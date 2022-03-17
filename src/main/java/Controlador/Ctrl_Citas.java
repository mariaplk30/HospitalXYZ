/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controlador;

//import java.io.FileReader;
//import java.util.Iterator;
//import java.util.Map;
//  
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.*;

import Modelo.Entidades.*;

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


    public Ctrl_Citas(){}
    
    private static Sucursal parseSucursales(JSONObject obj) {
	String nombre = (String)obj.get("nombre");
	JSONArray medicos = (JSONArray)obj.get("medicos");
	JSONArray pacientes = (JSONArray)obj.get("pacientes");
        
        ArrayList<Medico> arregloMedicosSucursal = new ArrayList();

        for(int i=0; i<medicos.size(); i++){
            arregloMedicosSucursal.add(parseMedicos((JSONObject) medicos.get(i)));
        }                

        ArrayList<Paciente> arregloPacientesSucursal = new ArrayList();

        for(int i=0; i<pacientes.size(); i++){
            arregloPacientesSucursal.add(parsePacientes((JSONObject) pacientes.get(i)));
        }          

        Sucursal sucursal = new Sucursal(nombre, arregloMedicosSucursal, arregloPacientesSucursal);

//	System.out.println("Nombre: "+nombre);
//	System.out.println("Medicos: "+medicos);
//	System.out.println("Pacientes: "+pacientes);

        return sucursal;
        
    }
    
    private static Medico parseMedicos(JSONObject obj) {
	String id = (String)obj.get("id");
	String nombre = (String)obj.get("nombre");
	String especialidad = (String)obj.get("especialidad");
        
        Medico medico = new Medico(id,nombre,especialidad);


//	System.out.println("id: "+id);
//	System.out.println("nombre: "+nombre);
//	System.out.println("especialidad: "+especialidad);

        return medico;
    }
    
    private static Paciente parsePacientes(JSONObject obj) {
	String cedula = (String)obj.get("cedula");
	String nombre = (String)obj.get("nombre");
	JSONArray citas = (JSONArray)obj.get("citas");
        JSONArray historial = (JSONArray)obj.get("historial");

//	System.out.println("cedula: "+cedula);
//	System.out.println("nombre: "+nombre);
//	System.out.println("citas: "+citas);

        ArrayList<Cita> arregloCitasDePaciente = new ArrayList();
        ArrayList<Historia> arregloHistoriasDePaciente = new ArrayList();

        for(int i=0; i<citas.size(); i++){
            arregloCitasDePaciente.add(parsePacienteCitas((JSONObject) citas.get(i)));
        }        

        for(int i=0; i<historial.size(); i++){
            arregloHistoriasDePaciente.add(parsePacienteHistorial((JSONObject) historial.get(i)));
        }    

        Paciente paciente = new Paciente(cedula, nombre, arregloCitasDePaciente, arregloHistoriasDePaciente);
        return paciente;
    }
    
    private static Cita parsePacienteCitas(JSONObject obj) {
	String id = (String)obj.get("id");
	String medico = (String)obj.get("medico");
        String fecha = (String)obj.get("fecha");
        Cita cita = new Cita(id, fecha, medico);
        return cita;
    }
    
    private static Historia parsePacienteHistorial(JSONObject obj) {
	String id = (String)obj.get("id");
	String paciente = (String)obj.get("paciente");
        String fecha = (String)obj.get("fecha");
        JSONArray citas = (JSONArray)obj.get("citas");

        //Falta aquí lo del JSON cITAS        



        Historia historia = new Historia(id, paciente, fecha, arregloCitas);
        return historia;
    }    

    public static void main(String[] args){

        JSONParser jsonParser = new JSONParser();
        String filePath = new File("").getAbsolutePath();
        //System.out.println (filePath);

        try {
            FileReader reader = new FileReader(filePath + "/src/main/java/Data/formato.json");
            Object obj = jsonParser.parse(reader);
            JSONObject jsonObject = (JSONObject) obj;

            JSONArray sucursales = (JSONArray) jsonObject.get("sucursales");

            System.out.println("Empieza a iterar por cada sucursal");
//            JSONObject test2 =  (JSONObject)sucursales.get(0);
//            JSONObject test3 =  (JSONObject)sucursales.get(0);
//            System.out.println(test3);
//            JSONArray medicos2 = (JSONArray)test2.get("pacientes");
            ArrayList<Sucursal> arregloSucursales = new ArrayList();
            for(int i=0;i<sucursales.size();i++)
            {
		JSONObject suc =  (JSONObject)sucursales.get(i);
                System.out.println("Dentro del for");
                arregloSucursales.add(parseSucursales(suc));
                System.out.println(arregloSucursales.get(i));

            }
//            
//            for(int i=0;i<sucursales.size();i++)
//            {
//		JSONObject test =  (JSONObject)sucursales.get(i);
//                parseObject(test);
//		System.out.println(test);
//            }
//            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    

    public void Solicitar(){
    

    }

    public void DesplegarFechas(){
       

    }

//    public void Modificar(Cita datos){
//       
//
//    }
//
//    public void Cancelar(Cita datos){
//       
//
//    }
//
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
//
//    public boolean ExistePaciente(Paciente datos){
//       
//
//    }
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
