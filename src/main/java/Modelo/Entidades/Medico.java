package Modelo.Entidades;

public class Medico extends Persona {
    private String Especialidad;
    private String id;

    public Medico(){
        Especialidad="";
        id = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    public void setEspecialidad(String esp){
        Especialidad=esp;
    }
            
    public String getEspecialidad(){
        return Especialidad;
    }
}