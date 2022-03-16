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

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.*;


public class Ctrl_Citas {


    public Ctrl_Citas(){}
    
    public static ArrayList recorrerJsonArray(JSONArray arreglo, String atributo){
        ArrayList Alista = new ArrayList();
        Iterator<JSONObject> itr = arreglo.iterator();
        int i=0;
            
        while (itr.hasNext()) {
            Alista.add( itr.next().get(atributo) );
            //System.out.println(arreglo.get(i));
            i++;
        }
        return Alista;
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
            // creando el iterador del dato

            // Añadiendo los datos del JSON en ArrayList
            ArrayList nombreSucursal = recorrerJsonArray(sucursales, "nombre");
            ArrayList medicos = recorrerJsonArray(sucursales, "medicos");
            ArrayList pacientes = recorrerJsonArray(sucursales, "pacientes");
            
            //Una vez lo tengo en objetos no sé cómo acceder a cada cosa del objeto

            Iterator itNombreS = nombreSucursal.iterator();
            while (itNombreS.hasNext()){
                System.out.println(itNombreS.next());
            }
            
            Iterator itMedicos = medicos.iterator();
            while (itMedicos.hasNext()){
                System.out.println(itMedicos.next());
            }
            
            for(Object i: nombreSucursal){
               System.out.println(i); 
            }
            
            for(Object i: pacientes){
               System.out.println(i); 
            }
            
            Iterator<JSONObject> itr1 = sucursales.iterator();
            // loop array
            
            while (itr1.hasNext()) {
                
                itr1.next().get("nombre");
                    
            }

            

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
