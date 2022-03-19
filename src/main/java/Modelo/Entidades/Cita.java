package Modelo.Entidades;
import java.util.ArrayList;

/**/
public class Cita{
    private String ID;
    private String Fecha;
    private String ID_medico;
    
    public Cita(){
        ID = "";
        Fecha = "";
    }
    
    public Cita(String id){
        ID = id;
        Fecha = "";
    }
    
    public Cita(String id, String fecha, String medico){
        ID = id;
        Fecha = fecha;
        ID_medico = medico;
    }

    public void setID(String id){
        ID = id;
    }
    
    public String getID(){
        return ID;
    }
    
    public void setFecha(String fecha){
        Fecha = fecha;
    }
    
    public String getFecha(){
        return Fecha;
    }
}