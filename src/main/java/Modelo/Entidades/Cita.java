package Modelo.Entidades;
/**/
public class Cita{
    private String ID;
    private String Fecha;
    
    public Cita(){
        ID = "";
        Fecha = "";
    }
    
    public Cita(String id){
        ID = id;
        Fecha = "";
    }
    
    public Cita(String id, String fecha){
        ID = id;
        Fecha = fecha;
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