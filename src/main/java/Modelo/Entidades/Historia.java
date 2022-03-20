package Modelo.Entidades;
import java.util.ArrayList;
import org.json.simple.JSONArray;

public class Historia{
    private String ID;
    private String Paciente;
    private ArrayList<Cita> Citas;
    private ArrayList<HistorialCita> Historial;
    
    public Historia(){
        ID = "";
        Paciente = "";
        Citas = new ArrayList(); 
    }
    
    public Historia(String ci){
        ID = "";
        Paciente = ci;
        Citas = new ArrayList();
    }
    
    public Historia(String id, String ci, ArrayList citas){
        ID = id;
        Paciente = ci;
        Citas = citas; 
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
    
    public void GuardarCita(Cita cita){
        Citas.add(cita);
    }
    
    public void GuardarCita(String id, String fecha){
        Cita cita = new Cita(id, fecha); 
        HistorialCita historial = new HistorialCita(id);
        GuardarCita(cita);
        Historial.add(historial);
    }
    
    public Cita getCita(int nCita){
        return Citas.get(nCita);
    }
}