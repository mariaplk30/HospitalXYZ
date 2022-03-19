package Modelo.Entidades;
/**/
public class Medico{
    private String ID;
    private String Nombres;
    private String Especialidad;

    public Medico(){
    }

    public Medico(String nombre, String especialidad){
        ID = "";
        Nombres = nombre;
        Especialidad = especialidad;
    }
    
    public Medico(String id, String nombre, String especialidad){
        ID = id;
        Nombres = nombre;
        Especialidad = especialidad;
    }
    
    public void setID(String id){
        ID = id;
    }
    
    public String getID() {
        return ID;
    }
    
    public void setEspecialidad(String esp){
        Especialidad = esp;
    }
            
    public String getEspecialidad(){
        return Especialidad;
    }
}