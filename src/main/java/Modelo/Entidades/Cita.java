package Modelo.Entidades;
import java.util.ArrayList;

public class Cita{
    private String ID;
    private String Medico;
    private String Fecha;
    
    public Cita(){
        ID = "";
        Medico = "";
        Fecha = "";
    }
    
    public Cita(String id){
        ID = id;
        Medico = "";
        Fecha = "";
    }
    
    public Cita(String id, String fecha){
        ID = id;
        Medico = "";
        Fecha = fecha;
    }
    
    public Cita(String id, String fecha, String medico){
        ID = id;
        Medico = medico;
        Fecha = fecha;
    }

    public void setID(String id){
        ID = id;
    }
    
    public String getID(){
        return ID;
    }
    
    public void setMedico(String id){
        Medico = id;
    }
    
    public String getMedico(){
        return Medico;
    }
    
    public void setFecha(String fecha){
        Fecha = fecha;
    }
    
    public String getFecha(){
        return Fecha;
    }



}