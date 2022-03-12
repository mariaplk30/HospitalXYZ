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

        try (Reader reader = new FileReader("C:\\Peliculas\\formato.json")) {

            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            System.out.println(jsonObject);

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
