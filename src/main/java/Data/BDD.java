package Data;
import Modelo.Entidades.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class BDD{
    //private ArrayList<Sucursal> Sucursales; //Al crear o agregar una sucursal, se le asigna un ID único.
    
    //private ArrayList<Medico> Medicos; //Se guardan todos los medicos registrados para asignarles un ID único
                                       //para luego ingresarlos o no en una sucursal.
    
    ArrayList<Sucursal> arregloSucursales;

    public BDD(){
      
    }

    private Sucursal parseSucursales(JSONObject obj) {
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
    
    private Medico parseMedicos(JSONObject obj) {
	String id = (String)obj.get("id");
	String nombre = (String)obj.get("nombre");
	String especialidad = (String)obj.get("especialidad");
        
        Medico medico = new Medico(id,nombre,especialidad);


//	System.out.println("id: "+id);
//	System.out.println("nombre: "+nombre);
//	System.out.println("especialidad: "+especialidad);

        return medico;
    }
    
    private Paciente parsePacientes(JSONObject obj) {
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
    
    private Cita parsePacienteCitas(JSONObject obj) {
	String id = (String)obj.get("id");
	String medico = (String)obj.get("medico");
        String fecha = (String)obj.get("fecha");
        Cita cita = new Cita(id, fecha, medico);
        return cita;
    }
    
    private Historia parsePacienteHistorial(JSONObject obj) {
	String id = (String)obj.get("id");
	String paciente = (String)obj.get("paciente");
        JSONArray citas = (JSONArray)obj.get("citas");

        ArrayList<HistorialCita> citasP = new ArrayList();
        for(int i=0; i<citas.size(); i++){
            citasP.add(pacienteCitasHistorial((JSONObject) citas.get(i)));
        }

        Historia historia = new Historia(id, paciente, citasP);
        return historia;
    }

    private HistorialCita pacienteCitasHistorial(JSONObject obj) {
	String id = (String)obj.get("id");
	String pulso = (String)obj.get("pulso");
        JSONObject valores = (JSONObject)obj.get("valores");


            HistorialCita val = new HistorialCita(id);
        


        //HistorialCita val = new HistorialCita();
  
        return val;
    }    

    public void leerArchivoJSON(){

        JSONParser jsonParser = new JSONParser();
        String filePath = new File("").getAbsolutePath();
        //System.out.println (filePath);

        try {
            FileReader reader = new FileReader(filePath + "/src/main/java/Data/formato.json");
            Object obj = jsonParser.parse(reader);
            JSONObject jsonObject = (JSONObject) obj;

            JSONArray sucursales = (JSONArray) jsonObject.get("sucursales");

            System.out.println("Empieza a iterar por cada sucursal");
            arregloSucursales = new ArrayList();

            for(int i=0;i<sucursales.size();i++)
            {
		JSONObject suc =  (JSONObject)sucursales.get(i);
                //System.out.println("Dentro del for");
                arregloSucursales.add(parseSucursales(suc));
                System.out.println(arregloSucursales.get(i));
            }
           

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


    public void main(){

        leerArchivoJSON();
        String filePath = new File("").getAbsolutePath();
        //System.out.println (filePath);
        try {

            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File(filePath + "/src/main/java/Data/formato1.json"), arregloSucursales);
            //FileWriter writer = new FileWriter(filePath + "/src/main/java/Data/formato1.json");
            
         } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }       
         

    }
    
    public int cantSucursales(){
        return arregloSucursales.size();
    }
    

    public void addSucursal(Sucursal sucursal){
        arregloSucursales.add(sucursal);
    }
    
//    public void addSucursal(String nombre){
//        Sucursal sucursal = new Sucursal(nombre);
//        addSucursal(sucursal);
//    }
//    
//    public Sucursal getSucursal(int i){
//        return arregloSucursales.get(i);
//    }
//    
//    public ArrayList<Sucursal> getSucursales(){
//        return arregloSucursales;
//    }
//    
//    //ID_Medico emplea la misma lógica de ID_Sucursal, cambiando la clase utilizada.
//    private String ID_Medico(){
//        String mensaje = "M";
//        int j = 0;
//        
//        if(Math.log10(Medicos.size())<1) j = 1;
//        else j = (int) Math.log10(Medicos.size()) + 1;
//        
//        for(int i=1; i<=8-j; i++) mensaje += "0";
//        
//        return mensaje + Integer.toString(Medicos.size() - 1);  
//    }
//    
//    public void addMedico(Medico medico){
//        Medicos.add(medico);
//        Medicos.get(Medicos.size()-1).setID(ID_Medico()); //A cada médico agendado se le genera su ID único.
//    }
//    
//    public void addMedico(String nombre, String especialidad){
//        Medico medico = new Medico(nombre, especialidad);
//        addMedico(medico);
//    }
//    
//    public Medico getMedico(int i){
//        return Medicos.get(i);
//    }
//    
//    public ArrayList<Medico> getMedicos(){
//        return Medicos;
//    }




}