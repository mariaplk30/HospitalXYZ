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

    ArrayList<Sucursal> arregloSucursales;
    ArrayList<Directivo> arregloJuntaD;

    public BDD(){
      
    }

    public void setArregloSucursales(ArrayList<Sucursal> arregloS) {
        arregloSucursales = arregloS;
    }


    public ArrayList<Sucursal> getArregloSucursales() {
        return arregloSucursales;
    }

    public ArrayList getArregloJuntaD() {
        return arregloJuntaD;
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

        return sucursal;
        
    }
    
    private Medico parseMedicos(JSONObject obj) {
	String id = (String)obj.get("id");
	String nombre = (String)obj.get("nombre");
	String especialidad = (String)obj.get("especialidad");
        
        Medico medico = new Medico(id,nombre,especialidad);

        return medico;
    }
    
    private Paciente parsePacientes(JSONObject obj) {
	String cedula = (String)obj.get("cedula");
	String nombre = (String)obj.get("nombre");
	JSONArray citas = (JSONArray)obj.get("citas");
        JSONArray historial = (JSONArray)obj.get("historial");

//	System.out.println("cedula: "+cedula); odio este proyectp

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
        JSONObject valore = (JSONObject)obj.get("valores");

        Valores value = parseValores(valore);

        HistorialCita valores = new HistorialCita(id, value);

        return valores;     
    }


    private Valores parseValores(JSONObject obj) {
	String peso = (String)obj.get("peso");
	String talla = (String)obj.get("talla");
        String pesoTalla = (String) obj.get("pesoTalla");
        JSONObject tension = (JSONObject) obj.get("tension");
        String pulso = (String) obj.get("pulso");

        Tension tet = new Tension(Integer.parseInt((String)tension.get("maxima")), Integer.parseInt((String)tension.get("minima")));
        System.out.println("TENEMOS UNE COMPAÑARE QUE NO TRABAJo EN NADA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

        Valores valores = new Valores(Double.parseDouble(peso), Double.parseDouble(talla), Double.parseDouble(pesoTalla), tet, Integer.parseInt(pulso));

          
        return valores;
    }
    
    public Directivo parseJuntaDirectiva(JSONObject obj){
	String nombre = (String)obj.get("nombre");
        Directivo dick = new Directivo();
        dick.setNombre(nombre);        
        return dick;
    }
   

    public void leerArchivoJSON(){

        JSONParser jsonParser = new JSONParser();
        String filePath = new File("").getAbsolutePath();
        //System.out.println (filePath);

        try {
            FileReader reader = new FileReader(filePath + "/src/main/java/Data/formato.json");
            Object obj = jsonParser.parse(reader);
            JSONObject jsonObject = (JSONObject) obj;

            JSONArray juntaD = (JSONArray) jsonObject.get("juntaDirectiva");
            JSONArray sucursales = (JSONArray) jsonObject.get("sucursales");

            arregloSucursales = new ArrayList();
            arregloJuntaD = new ArrayList();
            FabricaSucursales fabrica = new FabricaSucursales();
            JuntaDirectiva juntaDirectiva = JuntaDirectiva.getJuntaDirectiva(fabrica); //Aplicación de Singleton             


            for(int i=0;i<juntaD.size();i++)
            {
		JSONObject jd = (JSONObject)juntaD.get(i);
                arregloJuntaD.add(parseJuntaDirectiva(jd));
                juntaDirectiva.addNombre(arregloJuntaD.get(i).getNombre());
            }


            for(int i=0;i<sucursales.size();i++)
            {
		JSONObject suc =  (JSONObject)sucursales.get(i);
                arregloSucursales.add(parseSucursales(suc));
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

        //leerArchivoJSON();
        String filePath = new File("").getAbsolutePath();
        //System.out.println (filePath);
        try {

            Programa todo = new Programa(arregloJuntaD, arregloSucursales);
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File(filePath + "/src/main/java/Data/formato.json"), todo);
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

}