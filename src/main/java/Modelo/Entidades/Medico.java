package Modelo.Entidades;

public class Medico {
    private String Especialidad;
    
    public Medico(){
        Especialidad="";
    }
    
    public void setEspecialidad(String esp){
        Especialidad=esp;
    }
            
    public String getEspecialidad(){
        return Especialidad;
    }
}