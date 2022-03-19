package Modelo.Entidades;

public class Medico{
    private String ID;
    private String Nombre;
    private String Especialidad;

    public Medico(){
    }

    public Medico(String nombre, String especialidad){
        ID = "";
        Nombre = nombre;
        Especialidad = especialidad;
    }
    
    public Medico(String id, String nombre, String especialidad){
        ID = id;
        Nombre = nombre;
        Especialidad = especialidad;
    }
    
    public void setID(String id){
        ID = id;
    }
    
    public String getID() {
        return ID;
    }
    
    public void setNombre(String nombre){
        Nombre = nombre;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setEspecialidad(String esp){
        Especialidad = esp;
    }
            
    public String getEspecialidad(){
        return Especialidad;
    }
}