package Modelo.Entidades;

public class Medico extends Persona{
    private String ID;
    private String Especialidad;

    public Medico(){
        ID = "";
        Especialidad="";
    }

    public Medico(String id, String nombre, String especialidad){
        ID = id;
        Nombres = nombre;
        Especialidad = especialidad;
    }
    
    public void setID_Medico(String id){
        ID = id;
    }
    
    public String getID_Medico() {
        return ID;
    }
    
    public void setEspecialidad(String esp){
        Especialidad = esp;
    }
            
    public String getEspecialidad(){
        return Especialidad;
    }
}