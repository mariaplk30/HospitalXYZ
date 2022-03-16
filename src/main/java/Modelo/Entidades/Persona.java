package Modelo.Entidades;

public abstract class Persona{
    public String Nombres;
    public String Apellidos;
    public String Ci;
    public char Sexo;
    public String LugarNacimiento;
    public String FechaNacimiento;
    public String EstadoCivil;
    public String DireccionHabitacion;
    public String Telefono;

    public Persona(){
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
    
    public void setNombres(String nombres){
        Nombres = nombres;
    }

    public String getNombres(){
        return Nombres;
    }
    
    public void setApellidos(String apellidos){
        Apellidos = apellidos;
    }

    public String getApellidos(){
        return Apellidos;
    }
    
    public void setCi(String ci){
        Ci = ci;
    }

    public String getCi(){
        return Ci;
    }
    
    public void setSexo(char sexo){
        Sexo = sexo;
    }

    public char getSexo(){
        return Sexo;
    }
    
    public void setLugarNacimiento(String lugar){
        LugarNacimiento = lugar;
    }

    public String getLugarNacimiento(){
        return LugarNacimiento;
    }
    
    public void setFechaNacimiento(String fecha){
        FechaNacimiento = fecha;
    }

    public String getFechaNacimiento(){
        return FechaNacimiento;
    }

    public void setEstadoCivil(String edoCivil){
        EstadoCivil = edoCivil;
    }

    public String getEstadoCivil(){
        return EstadoCivil;
    }
    
    public void setDireccionHabitacion(String direccion){
        DireccionHabitacion = direccion;
    }

    public String getDireccionHabitacion(){
        return DireccionHabitacion;
    }
    
    public void setTelefono(String tlf){
        Telefono = tlf;
    }

    public String getTelefono(){
        return Telefono;
    }
}