package Modelo.Entidades;
import java.util.ArrayList;
/**/
public class Historia{
    private String ID;
    private String Ci;
    private int Frecuencia;
    private ArrayList<Cita> ControlDeCita;
    private ArrayList<String> Evolucion;
    private ArrayList<String> Tratamientos;
    
    public Historia(){
        ID = "";
        Ci = "";
        Frecuencia = 0;
        ControlDeCita = new ArrayList();
        Evolucion = new ArrayList();
        Tratamientos = new ArrayList();
    }
    
    public Historia(String ci){
        ID = "";
        Ci = ci;
        Frecuencia = 0;
        ControlDeCita = new ArrayList();
        Evolucion = new ArrayList();
        Tratamientos = new ArrayList();
    }
    
    public Historia(String id, String ci){
        ID = id;
        Ci = ci;
        Frecuencia = 0;
        ControlDeCita = new ArrayList();
        Evolucion = new ArrayList();
        Tratamientos = new ArrayList();
    }
    
    public void setID(String id){
        ID = id;
    }
    
    public String getID(){
        return ID;
    }
    
    public void setCI(String ci){
        Ci = ci;
    }
    
    public String getCI(){
        return Ci;
    }
    
    public int getFrecuencia(){
        return Frecuencia;
    }
    
    public void GuardarCita(Cita cita){
        ControlDeCita.add(Frecuencia, cita);
        Frecuencia++;
    }
    
    public void GuardarCita(String id, String fecha){
        Cita cita = new Cita(id, fecha); 
        GuardarCita(cita);
    }
    
    public Cita getCita(int nCita){
        return ControlDeCita.get(nCita);
    }
    
    public void setEvolucion(String valores){
        Evolucion.add(Frecuencia,valores);
    }
        
    public String getEvolucion(int nCita){
        return Evolucion.get(nCita);
    }
    
    public void setTratamientos(String recipe){
        Tratamientos.add(Frecuencia, recipe);
    }
       
    public String getTratamientos(int nCita){
        return Tratamientos.get(nCita);
    }
}