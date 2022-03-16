package Modelo.Entidades;

public class Cita{
    private String ID;
    private String ID_Medico;
    private String Fecha;
    
    public Cita(){
        ID = "";
        ID_Medico = "";
        Fecha = "";
    }
    
    public Cita(String id, String id2, String id3, String fecha){
        ID = id;
        ID_Medico = id2;
        Fecha = fecha;
    }
    
    public void setID_Paciente(String id){
        ID = id;
    }
    
    public String getID_Paciente(){
        return ID;
    }
    
    public void setID_Medico(String id){
        ID_Medico = id;
    }
    
    public String getID_Medico(){
        return ID_Medico;
    }
    
    public void setFecha(String fecha){
        Fecha = fecha;
    }
    
    public String getFecha(){
        return Fecha;
    }
}