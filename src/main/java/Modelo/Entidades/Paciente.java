package Modelo.Entidades;
import java.util.ArrayList;

public class Paciente{
    private String Cedula;
    private String Nombre;
    private ArrayList<Cita> Citas;
    private ArrayList<Historia> Historial;
    
    public void setCedula(String Ci){
        Cedula = Ci;
    }
    
    public String getCedula(){
        return Cedula;
    }
    
    public void setNombre(String nombre){
        Nombre = nombre;
    }
    
    public String getNombre(){
        return Nombre;
    }

    public void setCitas(ArrayList<Cita> citas){
        Citas = citas;
    }
    
    public ArrayList<Cita> getCitas(){
        return Citas;
    }
    
    public void setHistorial(Historia historial){
        Historial.add(historial);
    }
    
    public void setHistorial(ArrayList<Historia> historial){
        Historial = historial;
    }
    
    public ArrayList<Historia> getHistorial(){
        return Historial;
    }

    public Paciente(){
        Cedula = "";
        Nombre = "";
        Citas = new ArrayList();
        Historial = new ArrayList();
}
    
    public Paciente(String ci, String nombre, ArrayList<Cita> citas, ArrayList<Historia> historial){
        Cedula = ci;
        Nombre = nombre;
        Citas = citas;
        Historial = historial;
    }
    
    private String ID_Cita(){
        String mensaje = "";
        int j = 0;
        
        if(Math.log10(Citas.size())<1) j = 1;
        else j = (int) Math.log10(Citas.size()) + 1;
        
        for(int i=1; i<=8-j; i++) mensaje += "0";
        
        return mensaje + Integer.toString(Citas.size() - 1);  
    }
    
    public void addCita(Cita cita){
        Citas.add(cita);
        Citas.get(Citas.size()-1).setID(ID_Cita()); //A cada cita agendada se le genera su ID único.
    }
}