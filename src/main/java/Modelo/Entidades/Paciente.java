package Modelo.Entidades;
import java.util.ArrayList;
/**/
public class Paciente extends Persona{
    private String Ocupacion;
    private String Profesion;
    private String TelefonoRelacionado;
    private double Peso;
    private double Talla;
    private double IMC;
    private int TensionMax;
    private int TensionMin;
    private int[] Tension;
    private int Pulso;
    private Historia Historia;
    
    public Paciente(){
        Ocupacion = "";
        Profesion = "";
        TelefonoRelacionado = "";
        Peso = 0;
        Talla = 0;
        IMC = 0; 
        TensionMax = 0;
        TensionMin = 0;
        Tension = new int[2];
        Tension[0] = 0;
        Tension[1] = 0;
        Pulso = 0;
        Sexo = Character.MIN_VALUE;
        LugarNacimiento = "";
        FechaNacimiento = "";
        EstadoCivil = "";
        DireccionHabitacion = "";
        Telefono = "";
        Historia = new Historia();
    }
    
    public Paciente(String ci, String nombre){
        Ci = ci;
        Nombres = nombre;
        Ocupacion = "";
        Profesion = "";
        TelefonoRelacionado = "";
        Peso = 0;
        Talla = 0;
        IMC = 0; 
        TensionMax = 0;
        TensionMin = 0;
        Tension = new int[2];
        Tension[0] = 0;
        Tension[1] = 0;
        Pulso = 0;
        Sexo = Character.MIN_VALUE;
        LugarNacimiento = "";
        FechaNacimiento = "";
        EstadoCivil = "";
        DireccionHabitacion = "";
        Telefono = "";
        Historia = new Historia();
    }
    
    public void setOcupacion(String ocupacion){
        Ocupacion = ocupacion;
    }
    
    public String getOcupacion(){
        return Ocupacion;
    }
    
    public void setProfesion(String profesion){
        Profesion = profesion;
    }
    
    public String getProfesion(){
        return Profesion;
    }
    
    public void setTelefonoRelacion(String tlf){
        TelefonoRelacionado = tlf;
    }
    
    public String getTelefonoRelacion(){
        return TelefonoRelacionado;
    }

    public void setPeso(double peso){
        Peso = peso;
    }
    
    public double getPeso(){
        return Peso;
    }
    
    public void setTalla(double talla){
        Talla = talla;
    }
    
    public double getTalla(){
        return Talla;
    }
    
    public float getIMC(){
        IMC = Math.round((int) Peso/Math.pow(Talla, 2) * 100d) /100d; // Sacar IMC limitando sus decimales a 2
        return (float) IMC;
    }
    
    public void setTensionMax(int tmax){
        TensionMax = tmax;
        Tension[0] = tmax;
    }
    
    public  int getTensionMax(){
        return TensionMax;
    }
    
    public void setTensionMin(int tmin){
        TensionMin = tmin;
        Tension[1] = tmin;
    }
    
    public int getTensionMin(){
        return TensionMin;
    }
    
    public int[] getTensiones(){
        return Tension;
    }
    
    public void setPulso(int pulso){
        Pulso = pulso;
    }
    
    public int getPulso(){
        return Pulso;
    }
    
    public void crearHistoria(Historia historia){
        Historia = historia;
    }
    
    public void crearHistoria(String id){
        Historia.setID(id);
        Historia.setCI(Ci);
    }
    
    public Historia getHistoria(){
        return Historia;
    }
}