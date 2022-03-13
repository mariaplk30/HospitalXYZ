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
import java.io.Reader;
import java.util.Iterator;
/**
 *
 * @author Hogar
 */
public class Ctrl_Citas {


    public Ctrl_Citas(){}
    
    public static void main(String[] args){

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("formato.json")) {

            Object obj = jsonParser.parse(reader);
            System.out.println(obj);
            
            JSONArray juntaDirectiva = (JSONArray) obj;
            System.out.println(juntaDirectiva);

//            String name = (String) jsonObject.get("juntaDirectiva");
//            System.out.println(name);
//
//            long age = (Long) jsonObject.get("nombre");
//            System.out.println(age);

            // loop array
            JSONArray msg = (JSONArray) jsonObject.get("sucursales");
            Iterator<String> iterator = msg.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
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
