package Modelo.Entidades;
import java.util.ArrayList;

public class Sucursal{
    private ArrayList<Paciente> Pacientes;
    private String Nombre;
    private ArrayList<Medico> Medicos;

    public Sucursal(){
        Nombre = "";
        Medicos = new ArrayList();
        Pacientes = new ArrayList();
    }
    
    public Sucursal(String nombre){
        Nombre = nombre;
        Medicos = new ArrayList();
        Medicos.clear();
        Pacientes = new ArrayList();
        Pacientes.clear();
    }
    
    public Sucursal(String nombre, ArrayList<Medico> medicos, ArrayList<Paciente> pacientes){
        Nombre = nombre;
        Medicos = medicos;
        Pacientes = pacientes;
    }

    public ArrayList<Paciente> getPacientes(){
        return Pacientes;
    }
    
    public void setPacientes(ArrayList<Paciente> Pacientes) {
        this.Pacientes = Pacientes;
    }    

    public ArrayList<Medico> getMedicos(){
        return Medicos;
    }
    
    public void setMedicos(ArrayList<Medico> Medicos) {
        this.Medicos = Medicos;
    }

    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String nombre){
        Nombre = nombre;
    }
    
    public int cantMedicos(){
        return Medicos.size();
    }
    
    public void addMedico(Medico medico){
        Medicos.add(medico);
    }
    
    public void addMedico(String nombre, String especialidad){
        Medico medico = new Medico(nombre, especialidad);
        addMedico(medico);
    }
    
    public void addMedico(String id, String nombre, String especialidad){
        Medico medico = new Medico(id, nombre, especialidad);
        addMedico(medico);
    }
    
    public Medico getMedico(int i){
        return Medicos.get(i);
    }
    
    public int cantPacientes(){
        return Pacientes.size();
    }
    
    public void addPaciente(Paciente paciente){
        Pacientes.add(paciente);
    }
    
    public Paciente getPaciente(int i){
        return Pacientes.get(i);
    }
}