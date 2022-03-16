package Modelo.Entidades;

public class Medico extends Persona{
    private String ID;
    private String Especialidad;
    private String id;

    public Medico(){
        ID = "";
        Especialidad="";
        id = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void setID(String id){
        ID = id;
    }
            
    public String getID(){
        return ID;
    }
    
    public void setEspecialidad(String esp){
        Especialidad = esp;
    }
            
    public String getEspecialidad(){
        return Especialidad;
    }
}