package Modelo.Entidades;
import java.util.*;

public class Historia {
    private int Frecuencia;
    private ArrayList<Cita> ControlDeCita;
    private ArrayList<String> Evolucion;
    private ArrayList<String> Tratamientos;
    
    public Historia(){
        Frecuencia = 0;
        ControlDeCita = new ArrayList();
        Evolucion = new ArrayList();
        Tratamientos = new ArrayList();
    }
    
    public void setFrecuencia(int frecuencia){
        Frecuencia = frecuencia;
    }
    
    public int getFrecuencia(){
        return Frecuencia;
    }
    
    public void GuardarCita(Cita cita){
        ControlDeCita.add(Frecuencia, cita);
    }
    
    public Cita getControlDeCita(int i){
        return ControlDeCita.get(i);
    }
    
    public void setEvolucion(int nCita,String valores){
        Evolucion.add(nCita, valores);
    }
            
    public String getEvolucion(int nCita){
        return Evolucion.get(nCita);
    }
            
    public void setTratamientos(int nCita, String recipe){
        Tratamientos.add(nCita, recipe);
    }
            
    public String getTratamientos(int nCita){
        return Tratamientos.get(nCita);
    }
}