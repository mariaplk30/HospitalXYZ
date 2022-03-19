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


    public Ctrl_Citas(){}
    

    public void Solicitar(){
        BDD bd = new BDD();
        bd.main();
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
