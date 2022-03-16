package Modelo.Entidades;
import java.util.*;

public class JuntaDirectiva{
    private ArrayList<String> Directivos;
    private int CantidadPacientes;
    private ArrayList<Paciente> PacientesAnuales;
    private int CantidadMedicos;
    private ArrayList<Medico> RegistroMedicos;
    private ArrayList<Sucursal> RegistroSucursales;
    
    private FabricaSucursales fabricaSucursales;
    
    public JuntaDirectiva(FabricaSucursales fabricaSucursales){
        Directivos = new ArrayList();
        CantidadPacientes = 0;
        PacientesAnuales = new ArrayList();
        CantidadMedicos = 0;
        RegistroMedicos = new ArrayList();
        RegistroSucursales = new ArrayList();
        this.fabricaSucursales = fabricaSucursales;
    }
    
    public void abrirSucursal(String nombre) {
        Sucursal sucursal = fabricaSucursales.crearSucursal(nombre);
        //Revisar si en sucursales hay otra con el mismo nombre, no logro que .contains sirva
        //Si no, pushearla a la lista
        return;
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