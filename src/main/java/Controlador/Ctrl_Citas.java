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


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.io.File;
import java.util.Map;
/**
 *
 * @author Hogar
 */
public class Ctrl_Citas {


    public Ctrl_Citas(){}
    
    public static void main(String[] args){

        JSONParser jsonParser = new JSONParser();
        String filePath = new File("").getAbsolutePath();
        //System.out.println (filePath);

        try {
            FileReader reader = new FileReader(filePath + "/src/main/java/Data/formato.json");

            Object obj = jsonParser.parse(reader);
            JSONObject jsonObject =  (JSONObject) obj;
            
            //System.out.println(obj);
            // recibiendo la junta directiva
            JSONArray juntaD = (JSONArray) jsonObject.get("juntaDirectiva");
            
            // creando el iterador del dato
            Iterator<JSONObject> itr1 = juntaD.iterator();
            // loop array
            
            while (itr1.hasNext()) {
                
                System.out.println( itr1.next().get("nombre"));
                
            }
            
//            String name = (String) jsonObject.get("juntaDirectiva");
//            System.out.println(name);
//
//            long age = (Long) jsonObject.get("nombre");
//            System.out.println(age);

            

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
//    public boolean VerificarDatos(Paciente datos){
//       
//
//    }
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
