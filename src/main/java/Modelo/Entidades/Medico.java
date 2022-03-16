package Modelo.Entidades;
/**/
public class Medico extends Persona{
    private String ID;
    private String Especialidad;

    public Medico(){
        ID = "";
        Especialidad="";
        Nombres = "";
        Apellidos = "";
        Ci = "";
        Sexo = Character.MIN_VALUE;
        LugarNacimiento = "";
        FechaNacimiento = "";
        EstadoCivil = "";
        DireccionHabitacion = "";
        Telefono = "";
    }

    public Medico(String nombre, String especialidad){
        ID = "";
        Nombres = nombre;
        Especialidad = especialidad;
        Apellidos = "";
        Ci = "";
        Sexo = Character.MIN_VALUE;
        LugarNacimiento = "";
        FechaNacimiento = "";
        EstadoCivil = "";
        DireccionHabitacion = "";
        Telefono = "";
    }
    
    public Medico(String id, String nombre, String especialidad){
        ID = id;
        Nombres = nombre;
        Especialidad = especialidad;
        Apellidos = "";
        Ci = "";
        Sexo = Character.MIN_VALUE;
        LugarNacimiento = "";
        FechaNacimiento = "";
        EstadoCivil = "";
        DireccionHabitacion = "";
        Telefono = "";
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