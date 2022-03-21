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

    public ArrayList<Sucursal> getArregloSucursales() {
        return arregloSucursales;
    }

    //private ArrayList<Sucursal> Sucursales; //Al crear o agregar una sucursal, se le asigna un ID único.
    //private ArrayList<Medico> Medicos; //Se guardan todos los medicos registrados para asignarles un ID único
    //para luego ingresarlos o no en una sucursal.
    public ArrayList<JuntaDirectiva> getArregloJuntaD() {
        return arregloJuntaD;
    }
    
    //AAAAAAAAAAAAAAAAAYUDAAAAAAAAAAAAAAAAAAAA
    ArrayList<Sucursal> arregloSucursales;
    ArrayList<JuntaDirectiva> arregloJuntaD;
    private ArrayList<Object> jsonCompleto;

    public ArrayList<Object> getJsonCompleto() {
        return jsonCompleto;
    }

//    public void setJsonCompleto(ArrayList<Sucursal> suck, ArrayList<JuntaDirectiva> di) {
//
//        this.jsonCompleto = jsonCompleto;
//    }

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
        JSONObject valores = (JSONObject)obj.get("valores");

        System.out.println("1");
        Valores value = parseValores(valores);

            HistorialCita val = new HistorialCita(id, value);
        System.out.println("puto ricardo");

            return val;

     


         
    }


    private Valores parseValores(JSONObject obj) {
	String peso = (String)obj.get("peso");
	String talla = (String)obj.get("talla");
        String pesoTalla = (String) obj.get("pesoTalla");
        JSONObject tension = (JSONObject) obj.get("tension");
        String pulso = (String) obj.get("pulso");

        System.out.println("peso " +peso);
        System.out.println("pulso " +pulso);
        System.out.println("Talla " +talla);
        System.out.println("pesotalla " +pesoTalla);
        
        System.out.println("culo");

        Tension tet = new Tension(Integer.parseInt((String)tension.get("maxima")), Integer.parseInt((String)tension.get("minima")));
        System.out.println("5");
        System.out.println(tet.getMaxima());
        System.out.println(tet.getMinima());

        Valores val = new Valores(Double.parseDouble(peso), Double.parseDouble(talla), Double.parseDouble(pesoTalla), tet, Integer.parseInt(pulso));
        System.out.println("6");

          
        return val;
    }


    private JuntaDirectiva parseJuntaD(JSONObject obj) {
	String nombre = (String)obj.get("nombre");
        FabricaSucursales fab = new FabricaSucursales();
        JuntaDirectiva j = JuntaDirectiva.getJuntaDirectiva(fab);
        j.addDirectivo(nombre);
        return j;
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

            System.out.println("Empieza a iterar por cada sucursal");
            arregloSucursales = new ArrayList();
            arregloJuntaD = new ArrayList();


            for(int i=0;i<juntaD.size();i++)
            {
		JSONObject jd =  (JSONObject)juntaD.get(i);
                //System.out.println("Dentro del for");
                arregloJuntaD.add(parseJuntaD(jd));
                //System.out.println(arregloSucursales.get(i));
            }



            for(int i=0;i<sucursales.size();i++)
            {
		JSONObject suc =  (JSONObject)sucursales.get(i);
                //System.out.println("Dentro del for");
                arregloSucursales.add(parseSucursales(suc));
                //System.out.println(arregloSucursales.get(i));
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
            this.jsonCompleto = new ArrayList();
            this.jsonCompleto.add(arregloSucursales);
            this.jsonCompleto.add(arregloJuntaD);
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File(filePath + "/src/main/java/Data/formato1.json"), jsonCompleto);
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