package Modelo.Entidades;
import java.util.*;

public class JuntaDirectiva{
    private ArrayList<String> Directivos;
    private int CantidadPacientes;
    private ArrayList<Paciente> PacientesAnuales;
    private int CantidadMedicos;
    private ArrayList<Medico> RegistroMedicos;
    private ArrayList<Sucursal> RegistroSucursales;
    
    public JuntaDirectiva(){
        Directivos = new ArrayList();
        CantidadPacientes = 0;
        PacientesAnuales = new ArrayList();
        CantidadMedicos = 0;
        RegistroMedicos = new ArrayList();
        RegistroSucursales = new ArrayList();
    }
    
    public void setDirectivo(String nombre){
        
    }
    
    public void setCantidadPacientes(int cant){
        CantidadPacientes = cant;
    }
    
    public int getCantidadMedicos(){
        return CantidadPacientes;
    }

    public void setCantidadMedicos(int cant){
        CantidadPacientes = cant;
    }
    
    public int getCantidadPacientes(){
        return CantidadPacientes;
    }
}