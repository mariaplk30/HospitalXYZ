package Controlador;
import java.util.Date;
import java.util.ArrayList;
import Data.BDD;
import Modelo.Entidades.*;
import org.apache.commons.lang.StringUtils;


public class Ctrl_JuntaDirectiva{
    //Singleton y Factory Method
    private FabricaSucursales fabrica = new FabricaSucursales();
    private JuntaDirectiva junta = JuntaDirectiva.getJuntaDirectiva(fabrica); //Aplicación de Singleton
    
    private BDD bdd = new BDD();
    
    public Ctrl_JuntaDirectiva(){}

    public static boolean isEmpty(String nombre, String ubicacion){
        return nombre.isEmpty() || nombre.isBlank() || ubicacion.isEmpty() || ubicacion.isBlank();
    }
    
    public static boolean VerificarDatosSucursal(String nombre, String ubicacion){
        return nombre.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
               ubicacion.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
               !isEmpty(nombre, ubicacion);
    }
    
    public boolean ExisteSucursal(String nombre){
        bdd.leerArchivoJSON();
        for(int i=0; i < bdd.cantSucursales(); i++) if(bdd.getArregloSucursales().get(i).getNombre().toLowerCase().equals(nombre)) return true;
        return false;
    }

    public boolean AbrirSucursal(String nombre){
        if(!ExisteSucursal(nombre)){
            //Aplicación de Factory Method
            Sucursal sucursal = fabrica.crearSucursal(nombre);
            junta.addSucursal(sucursal);
            
            ArrayList<Sucursal> sucursales = bdd.getArregloSucursales();
            sucursales.add(sucursal);
            bdd.main();
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean isEmpty(String nombres, String apellidos, String cedula, String sexo, String lugarN, String civil, String direccion, String telefono, String especialidad){
        return (nombres.isEmpty() || nombres.isBlank() || apellidos.isEmpty() || apellidos.isBlank() ||
               sexo.isEmpty() || sexo.isBlank() || lugarN.isEmpty() || lugarN.isBlank() ||
               civil.isEmpty() || civil.isBlank() || direccion.isEmpty() || direccion.isBlank() ||
               especialidad.isEmpty() || especialidad.isBlank() || cedula.isEmpty() || cedula.isBlank() ||
               telefono.isEmpty() || telefono.isBlank());
    }
    
    public static boolean VerificarDatosMedico(String nombres, String apellidos, String cedula, String sexo, String lugarN, String civil, String direccion, String telefono, String especialidad){
        return nombres.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           apellidos.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") && 
           sexo.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") && 
           lugarN.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           civil.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           direccion.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           especialidad.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") && 
           cedula.matches("\\d*")&& 
           telefono.matches("\\d*") && !isEmpty(nombres, apellidos, cedula, sexo, lugarN, civil, direccion, telefono, especialidad);
    }
    
    public boolean ExisteMedico(String id, String nombre, String especialidad){
        bdd.leerArchivoJSON();
        Medico medico = new Medico(id, nombre, especialidad);
        for(int i = 0; i < junta.getCantMedicos(); i++) if(medico.getNombre().toLowerCase().equals(junta.getMedico(i).getNombre())) return true;
        return false;
    }
    
    public boolean RegistrarMedico(String id, String nombre, String especialidad){
        if(!ExisteMedico(id, nombre, especialidad)){
            boolean registrado = false;
            junta.addMedico(id, nombre, especialidad);
            for(int i=0; i < bdd.cantSucursales() && registrado == false; i++){
                if(bdd.getArregloSucursales().get(i).getMedicos().isEmpty()){
                    Medico medico = junta.getMedico(junta.getCantMedicos()-1);
                    bdd.getArregloSucursales().get(i).addMedico(medico); //Agrega al médico nuevo a una sucursal vacía
                    registrado = true;
                }
                //Si todas las sucursales tienen al menos 1 médico registrado el nuevo médico se añade a la primera
                if(i == bdd.cantSucursales()-1 && registrado == false){
                    Medico medico = junta.getMedico(junta.getCantMedicos()-1);
                    bdd.getArregloSucursales().get(0).addMedico(medico); //Agrega al médico nuevo a la primera sucursal
                    registrado = true;
                }
            }
            bdd.main();
            return true;
        }else{
            return false;
        }
    }

    public int RegPacientes(String sucursal){
        /*Busca en las sucursales a los pacientes desde el 1º de Enero hasta el 31 de Diciembre del año actual*/
        bdd.leerArchivoJSON();
        int cont = 0; 
        Date fecha = new Date();
        String year = Integer.toString(fecha.getYear()+1900); //Año actual
        for(int i=0; i<bdd.getArregloSucursales().size(); i++){
            if(sucursal.equals(bdd.getArregloSucursales().get(i).getNombre())){
                ArrayList<Paciente> pacientes = bdd.getArregloSucursales().get(i).getPacientes();
                for(int j=0; j<pacientes.size(); j++){
                    ArrayList<Cita> citas = pacientes.get(j).getCitas();
                    for(int k=0; k<citas.size(); k++){
                        if(year.equals(citas.get(k).getFecha().substring(citas.get(k).getFecha().length()-4, citas.get(k).getFecha().length()))){
                            cont++;
                            break;
                        }
                    }
                }  
            }
        }
        return cont;
    }
    
    public ArrayList ReporteAnual(){
        bdd.leerArchivoJSON();
        ArrayList<String> reporte = new ArrayList();
        for(int i=0; i < bdd.getArregloSucursales().size(); i++){
            reporte.add(bdd.getArregloSucursales().get(i).getNombre()+ ": " +  Integer.toString(RegPacientes(bdd.getArregloSucursales().get(i).getNombre())) + " pacientes." );
        }      
        return reporte;
    }
}