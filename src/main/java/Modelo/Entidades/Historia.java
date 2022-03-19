package Modelo.Entidades;
import java.util.ArrayList;
import org.json.simple.JSONArray;

public class Historia{
    private String ID;
    private String Paciente;
    private ArrayList<Cita> Citas;
    private ArrayList<String> Tratamientos;
    private int Pulso;
    
    public Historia(){
        ID = "";
        Paciente = "";
        Citas = new ArrayList();
        Tratamientos = new ArrayList();
        Pulso = 0;
    }
    
    public Historia(String ci){
        ID = "";
        Paciente = ci;
        Citas = new ArrayList();
        Tratamientos = new ArrayList();
        Pulso = 0;
    }
    
    public Historia(String id, String ci, ArrayList citas){
        ID = id;
        Paciente = ci;
        Citas = citas; 
        Tratamientos = new ArrayList();
        Pulso = 0;
    }
    
    public void setID(String id){
        ID = id;
    }
    
    public String getID(){
        return ID;
    }
    
    public void setPaciente(String ci){
        Paciente = ci;
    }
    
    public String getPaciente(){
        return Paciente;
    }
    
    public void setPulso(int pulso){
        Pulso = pulso;
    }
    
    public int getPulso(){
        return Pulso;
    }
    
    public void GuardarCita(Cita cita){
        Citas.add(Pulso, cita);
        Pulso++;
    }
    
    public void GuardarCita(String id, String fecha){
        Cita cita = new Cita(id, fecha); 
        GuardarCita(cita);
    }
    
    public Cita getCita(int nCita){
        return Citas.get(nCita);
    }
    
    public void setTratamientos(String recipe){
        Tratamientos.add(Pulso, recipe);
    }
       
    public String getTratamientos(int nCita){
        return Tratamientos.get(nCita);
    }
}