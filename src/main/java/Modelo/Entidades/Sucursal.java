package Modelo.Entidades;
import java.util.ArrayList;

public class Sucursal{
    private String ID;
    private String Nombre;
    private String Ubicacion;
    private String Telefono;
    private ArrayList<Medico> Medicos;
    private ArrayList<Paciente> Pacientes;
    private ArrayList<Cita> Citas;
    private ArrayList<Historia> Historias;
    
    public Sucursal(){
        ID = "";
        Nombre = "";
        Ubicacion = "";
        Telefono = "";
        Medicos = new ArrayList();
        Pacientes = new ArrayList();
        Citas = new ArrayList();
        Historias = new ArrayList();
    }
    
    public void setID_Sucursal(String id){
        ID = id;
    }
    
    public String getID_Sucursal(){
        return ID;
    }
    
    public void setNombre(String nombre){
        Nombre = nombre;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setUbicacion(String ubi){
        Ubicacion = ubi;
    }

    public String getUbicacion(){
        return Ubicacion;
    }
            
    public void setTelefono(String tlf){
        Telefono = tlf;
    }

    public String getTelefono(){
        return Telefono;
    }
    
    public void addMedico(Medico medico){
        Medicos.add(medico);
    }
    
    public void addMedico(String id, String nombre, String especialidad){
        Medico medico = new Medico(id, nombre, especialidad);
        addMedico(medico);
    }
    
    public void addPaciente(Paciente paciente){
        Pacientes.add(paciente);
    }
    
    public void addPaciente(String ci, String nombre){
        Paciente paciente = new Paciente(ci, nombre);
        addPaciente(paciente);
    }
}