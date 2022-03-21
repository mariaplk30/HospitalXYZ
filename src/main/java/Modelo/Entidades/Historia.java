package Modelo.Entidades;
import java.util.ArrayList;

public class Historia{
    private String ID;
    private String Paciente;
    private ArrayList<HistorialCita> citas;


    public Historia(){
        ID = "";
        Paciente = "";
        citas = new ArrayList();
    }
    
    public Historia(String ci){
        ID = "";
        Paciente = ci;
        citas = new ArrayList();
    }
    
    public Historia(String id, String ci, ArrayList<HistorialCita> historial){
        ID = id;
        Paciente = ci;
        citas = historial;
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
        return citas.size();
    }
    
    public ArrayList<HistorialCita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<HistorialCita> citas) {
        this.citas = citas;
    }
}