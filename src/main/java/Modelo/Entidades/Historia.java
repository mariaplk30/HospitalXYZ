package Modelo.Entidades;
import java.util.ArrayList;
import org.json.simple.JSONArray;

/**/
public class Historia{
    private String ID;
    private String Ci;
    private int Pulso;
    private ArrayList<String> Citas;
    private ArrayList<String> Tratamientos;
    
    public Historia(){
        ID = "";
        Ci = "";
        Pulso = 0;
        Tratamientos = new ArrayList();
    }
    
    public Historia(String ci){
        ID = "";
        Ci = ci;
        Pulso = 0;
        Tratamientos = new ArrayList();
    }
    
    public Historia(String id, String ci, ArrayList citas){
        ID = id;
        Ci = ci;
        Citas = citas; 
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
    
    public int getPulso(){
        return Pulso;
    }
    
    public void GuardarCita(Cita cita){
        ControlDeCita.add(Pulso, cita);
        Pulso++;
    }
    
    public void GuardarCita(String id, String fecha){
        Cita cita = new Cita(id, fecha); 
        GuardarCita(cita);
    }
    
    public Cita getCita(int nCita){
        return ControlDeCita.get(nCita);
    }
    
    public void setEvolucion(String valores){
        Evolucion.add(Pulso,valores);
    }
        
    public String getEvolucion(int nCita){
        return Evolucion.get(nCita);
    }
    
    public void setTratamientos(String recipe){
        Tratamientos.add(Pulso, recipe);
    }
       
    public String getTratamientos(int nCita){
        return Tratamientos.get(nCita);
    }
}