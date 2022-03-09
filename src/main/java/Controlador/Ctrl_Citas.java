/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
  
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
/**
 *
 * @author Hogar
 */
public class Ctrl_Citas {


    public Ctrl_Citas(){}
    
    public void LeerJson(){
        try{
            Object obj = new JSONParser().parse(new FileReader("../Data/formato.json"));
        }
        catch(Exception e){
        }
    }

    public void Solicitar(){
    

    }

    public void DesplegarFechas(){
       

    }

    public void Modificar(Cita datos){
       

    }

    public void Cancelar(Cita datos){
       

    }

    public boolean VerificarDatos(Paciente datos){
       

    }

    public boolean ExistePaciente(Paciente datos){
       

    }

    public void Registrar(Paciente datos){
       

    }

    public boolean ExisteCita(Cita datos){
       

    }

    public void DesplegarCita(){
       

    }



}
