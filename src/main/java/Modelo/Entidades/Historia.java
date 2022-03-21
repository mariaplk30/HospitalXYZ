package Modelo.Entidades;
import java.util.ArrayList;
import org.json.simple.JSONArray;

public class Historia{
    private String ID;
    private String Paciente;
    private ArrayList<HistorialCita> Historial;
    
    public Historia(){
        ID = "";
        Paciente = "";
        Historial = new ArrayList();
    }
    
    public Historia(String ci){
        ID = "";
        Paciente = ci;
        Historial = new ArrayList();
    }
    
    public Historia(String id, String ci, ArrayList historial){
        ID = id;
        Paciente = ci;
        Historial = historial;
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

    
    public int cantHistorial(){
        return Historial.size();
    }
    
    public void setHistorial(HistorialCita historial){
        Historial.set(Historial.size()-1, historial);
    }
    
    public HistorialCita getHistorial(){
        return Historial.get(Historial.size()-1);
    }
}