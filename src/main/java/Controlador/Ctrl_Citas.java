package Controlador;

import Modelo.Entidades.*;
import Data.BDD;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.*;
import org.json.simple.JSONValue;    
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.*;

public class Ctrl_Citas {
    public int SucursalI;
    public int MedicoI;
    public int PacienteI;
    private BDD bd = new BDD();
        
    public Ctrl_Citas(){}
    
    public void Solicitar(String fecha){
        BDD bd = new BDD();
        bd.leerArchivoJSON();
        ArrayList<Sucursal> sucursales = bd.getArregloSucursales();
        
        Cita cita = new Cita();
        cita.setFecha(fecha);
        cita.setMedico(sucursales.get(SucursalI).getMedico(MedicoI).getID());

        sucursales.get(SucursalI).getPaciente(PacienteI).addCita(cita);
        bd.main();
    }

    public void Modificar(String paciente, String FechaID, String fechaNueva, String medicoNuevo, String sucursal){
        BDD bd = new BDD();
        bd.leerArchivoJSON();
        ArrayList<Sucursal> sucursales = bd.getArregloSucursales();

        if(ExistePacienteYMedico(paciente, medicoNuevo, sucursal, true)){
        
            for(int i=0; i< sucursales.get(SucursalI).getPaciente(PacienteI).getCitas().size(); i++){
                if(FechaID.substring(11).equals(sucursales.get(SucursalI).getPaciente(PacienteI).getCitas().get(i).getID()) == true ){

                        System.out.println(FechaID.substring(11) + "  " + sucursales.get(SucursalI).getPaciente(PacienteI).getCitas().get(i).getID());
                        sucursales.get(SucursalI).getPaciente(PacienteI).getCitas().get(i).setFecha(fechaNueva);
                                
                        for(int s=0; s<sucursales.get(i).getMedicos().size(); s++){
                            if(medicoNuevo.equals(sucursales.get(SucursalI).getMedicos().get(s).getNombre()) == true){
                                sucursales.get(SucursalI).getPaciente(PacienteI).getCitas().get(i).setMedico(medicoNuevo);
                                break;
                            }
                        }
                    
                }
               
            }
        }
        bd.main();

    }

    public void Cancelar(String Paciente, String FechaID, String sucursal){
        bd.leerArchivoJSON();
        ArrayList<Sucursal> sucursales = bd.getArregloSucursales();

        if(ExistePacienteYMedico(Paciente, "", sucursal, false)){
        
            for(int i=0; i< sucursales.get(SucursalI).getPaciente(PacienteI).getCitas().size(); i++){
                if(FechaID.substring(11).equals(sucursales.get(SucursalI).getPaciente(PacienteI).getCitas().get(i).getID()) == true ){
                    sucursales.get(SucursalI).getPaciente(PacienteI).getCitas().remove(i);
                    System.out.println("borre algo");
                    break;
               }
            }
        }
        bd.main();
    }

    public boolean isEmpty(String nombres, String apellidos, String cedula, String sexo, String lugarN, String civil, String direccion, String telefono, String profesion, String ocupacion, String relativo){
        return nombres.isEmpty() || nombres.isBlank() || apellidos.isEmpty() || apellidos.isBlank() ||
               cedula.isEmpty() || cedula.isBlank() || sexo.isEmpty() || sexo.isBlank() ||
               lugarN.isEmpty() || lugarN.isBlank() || civil.isEmpty() || civil.isBlank() ||
               direccion.isEmpty() || direccion.isBlank() || telefono.isEmpty() || telefono.isBlank() ||
               profesion.isEmpty() || profesion.isBlank() || ocupacion.isEmpty() || ocupacion.isBlank() ||
               relativo.isEmpty() || relativo.isBlank();
    }
    
    public boolean VerificarDatos(String nombres,String apellidos,String cedula,String sexo,String lugarN,String civil,String direccion,String telefono,String profesion,String ocupacion,String relativo){
       
        return nombres.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           apellidos.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") && 
           sexo.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") && 
           lugarN.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           civil.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           direccion.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           profesion.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") && 
           ocupacion.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           cedula.matches("\\d*")&& 
           telefono.matches("\\d*") &&
           relativo.matches("\\d*") &&
           !isEmpty(nombres, apellidos, cedula, sexo, lugarN, civil, direccion, telefono, profesion, ocupacion, relativo);
    }
     
    public boolean ExistePacienteYMedico(String paciente, String medico, String sucursal, boolean med){
        BDD bd = new BDD();
        bd.leerArchivoJSON();
        ArrayList<Sucursal> sucursales = bd.getArregloSucursales();
        boolean existePaciente = false;
        boolean existeMedico = false;
        boolean existeSucursal = false;

        for(int i=0; i<sucursales.size(); i++){

            if(sucursal.toLowerCase().equals(sucursales.get(i).getNombre().toLowerCase()) == true){
                existeSucursal = true;
                SucursalI = i;
                
                ArrayList<Paciente> pacientes = sucursales.get(i).getPacientes();
                for(int j=0; j<pacientes.size(); j++){
                    if(paciente.toLowerCase().equals(pacientes.get(j).getNombre().toLowerCase()) == true){
                        PacienteI = j;
                        existePaciente = true;
                    System.out.println("existe paciente");

                    }
                }
                
                if(existePaciente == false){
                    System.out.println("no existe paciente");
                    return false;
                } 
  
                if(med == true){
                    ArrayList<Medico> medicos = sucursales.get(i).getMedicos();
                    for(int j=0; j<medicos.size(); j++){
                        if(medico.toLowerCase().equals(medicos.get(j).getNombre().toLowerCase()) == true){
                            MedicoI = j;
                            existeMedico = true;
                        System.out.println("existe medico");

                        }
                    }

                    if(existeMedico == false){
                        System.out.println("no existe medico");
                        return false;
                    }
                }

            }
        }
        if(existeSucursal == true) return true;
        else return false;
    }

    public void Registrar(String cedula, String nombre, String apellido, String sucursal){
        BDD bd = new BDD();
        bd.leerArchivoJSON();
        ArrayList<Sucursal> sucursales = bd.getArregloSucursales();
        for(int i=0; i< sucursales.size(); i++){
            if(sucursal.equals(sucursales.get(i).getNombre()) == true){
                Paciente paciente = new Paciente();
                paciente.setNombre(nombre + " " + apellido);
                paciente.setCedula(cedula);
                sucursales.get(i).getPacientes().add(paciente);
            }
        }
        bd.main();
    }

    public ArrayList DesplegarCita(String paciente, String Sucursal){
        BDD bd = new BDD();
        bd.leerArchivoJSON();
        ArrayList<Sucursal> sucursales = bd.getArregloSucursales();
        ArrayList<String> fechas = new ArrayList();
        for(int i=0; i< sucursales.get(SucursalI).getPaciente(PacienteI).getCitas().size(); i++){
            fechas.add(sucursales.get(SucursalI).getPaciente(PacienteI).getCitas().get(i).getFecha() + " " + sucursales.get(SucursalI).getPaciente(PacienteI).getCitas().get(i).getID());
        }
        return fechas;      
    }
}
