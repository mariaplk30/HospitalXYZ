package Modelo.Entidades;
import java.util.ArrayList;

public class Sucursal{
    private String Nombre;
    private ArrayList<Medico> Medicos;
    private ArrayList<Paciente> Pacientes;

    //private ArrayList<Cita> Citas; //Se guardan todas las citas solicitadas para asignarles un ID único y luego
                                   //poder operar a gusto con las citas
    
    //private ArrayList<Historia> Historias; //Se guardan todas las historias registradas para asignarles un ID
                                           //único y luego ingresarla en su paciente correspondiente.



    public Sucursal(){
        Nombre = "";
        Medicos = new ArrayList();
        Pacientes = new ArrayList();
    }
    
    public Sucursal(String nombre){
        Nombre = nombre;
        Medicos = new ArrayList();
        Pacientes = new ArrayList();
    }
    
    public Sucursal(String nombre, ArrayList<Medico> medicos, ArrayList<Paciente> pacientes){
        Nombre = nombre;
        Medicos = medicos;
        Pacientes = pacientes;
    }


    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String nombre){
        Nombre = nombre;
    }
    
    public ArrayList<Medico> getMedicos(){
        return Medicos;
    }
    
    public void setMedicos(ArrayList<Medico> Medicos) {
        this.Medicos = Medicos;
    }
    
    public ArrayList<Paciente> getPacientes(){
        return Pacientes;
    }

//    public void setPaciente(Paciente paciente){
//        
//    }
    
    public void setPacientes(ArrayList<Paciente> Pacientes) {
        this.Pacientes = Pacientes;
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
    
//    public void addPaciente(String ci, String nombre){
//        Paciente paciente = new Paciente(ci, nombre);
//        addPaciente(paciente);
//    }
    
    public Paciente getPaciente(int i){
        return Pacientes.get(i);
    }
    

    
//    public int cantHistorias(){
//        return Historias.size();
//    }
//    
//    //ID_Cita emplea la misma lógica de los métodos ID_X de la clase BDD, cambiando la clase utilizada.

    
//    public void addCita(String id){
//        Cita cita = new Cita(id);
//        addCita(cita);
//    }
//    
//    public Cita getCita(int i){
//        return Citas.get(i);
//    }
//    
//    public ArrayList<Cita> getCitas(){
//        return Citas;
//    }
//  
//    //ID_Historia emplea la misma lógica de los métodos ID_X antes vistos, cambiando la clase utilizada.
//    private String ID_Historia(){
//        String mensaje = "H";
//        int j = 0;
//        
//        if(Math.log10(Historias.size())<1) j = 1;
//        else j = (int) Math.log10(Historias.size()) + 1;
//        
//        for(int i=1; i<=8-j; i++) mensaje += "0";
//        
//        return mensaje + Integer.toString(Historias.size() - 1);  
//    }
//    
//    public void addHistoria(Historia historia){
//        Historias.add(historia);
//        Historias.get(Historias.size()-1).setID(ID_Historia()); //A cada historia agendada se le genera su ID único.
//    }
//    
//    public void addHistoria(String ci){
//        Historia historia = new Historia(ci);
//        addHistoria(historia);
//    }
//    
//    public Historia getHistoria(int i){
//        return Historias.get(i);
//    }
//    
//    public ArrayList<Historia> getHistorias(){
//        return Historias;
//    }
}