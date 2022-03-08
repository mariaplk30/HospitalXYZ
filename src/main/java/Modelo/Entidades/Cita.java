package Modelo.Entidades;

public class Cita {
    private String ID_Paciente;
    private String ID_Medico;
    private String ID_Sucursal;
    private String Fecha;
    private char Status;
    
    public Cita(){
        ID_Paciente = "";
        ID_Medico = "";
        ID_Sucursal = "";
        Fecha = "";
        Status = Character.MIN_VALUE;
    }
    
    public Cita(String id, String id2, String id3, String fecha, char status){
        ID_Paciente = id;
        ID_Medico = id2;
        ID_Sucursal = id3;
        Fecha = fecha;
        Status = status;
    }
    
    public void Solicitar(){
        
    }
    
    public void Modificar(Cita cita){
        
    }
    
    public void Cancelar(Cita cita){
        
    }
    
    public void setID_Paciente(String id){
        ID_Paciente = id;
    }
    
    public String getID_Paciente(){
        return ID_Paciente;
    }
    
    public void setID_Medico(String id){
        ID_Medico = id;
    }
    
    public String getID_Medico(){
        return ID_Medico;
    }
    
    public void setID_Sucursal(String id){
        ID_Sucursal = id;
    }
    
    public String getID_Sucursal(){
        return ID_Sucursal;
    }
    
    public void setFecha(String fecha){
        Fecha = fecha;
    }
    
    public String getFecha(){
        return Fecha;
    }
    
    public void setStatus(char status){
        Status = status;
    }
    
    public char getStatus(){
        return Status;
    }
}