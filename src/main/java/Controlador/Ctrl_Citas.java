package Controlador;

//import java.io.FileReader;
//import java.util.Iterator;
//import java.util.Map;
//  
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.*;

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

    public void DesplegarFechas(){
       

    }

    public void Modificar(Cita datos){
        BDD bd = new BDD();
       

    }

    public void Cancelar(Cita datos){
        BDD bd = new BDD();
       

    }



    public boolean VerificarDatos(String nombres,String apellidos,String cedula,String sexo,String lugarN,String civil,String direccion,String telefono,String profesion,String ocupacion,String relativo){
       
        if(nombres.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           apellidos.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") && 
           sexo.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") && 
           lugarN.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           civil.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           direccion.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           profesion.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") && 
           ocupacion.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           cedula.matches("\\d*")&& 
           telefono.matches("\\d*") &&
           relativo.matches("\\d*") ){
           return true;
        }else{
           return false;
        }
        
    }

    public boolean ExistePacienteYMedico(String paciente, String medico, String sucursal){
        BDD bd = new BDD();
        bd.leerArchivoJSON();
        ArrayList<Sucursal> sucursales = bd.getArregloSucursales();
        boolean existePaciente = false;
        boolean existeMedico = false;
        for(int i=0; i<sucursales.size(); i++){

            if(sucursal.toLowerCase().equals(sucursales.get(i).getNombre().toLowerCase()) == true){
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



        return true;
    }
//
//    public void Registrar(Paciente datos){
//       
//
//    }
//
//    public boolean ExisteCita(Cita datos){
//       
//
//    }

    public void DesplegarCita(){
       

    }



}
