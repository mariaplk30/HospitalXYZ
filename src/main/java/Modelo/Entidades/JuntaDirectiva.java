package Modelo.Entidades;
import java.util.*;

/*PacientesAnuales, y los registros son arreglos*/

public class JuntaDirectiva{
    private int CantidadPacientes;
    private ArrayList<Paciente> PacientesAnuales;
    private int CantidadMedicos;
    private ArrayList<Medico> RegistroMedicos;
    private ArrayList<Sucursal> RegistroSucursales;
    
    public JuntaDirectiva(){
        CantidadPacientes = 0;
        PacientesAnuales = new ArrayList();
        CantidadMedicos = 0;
        RegistroMedicos = new ArrayList();
        RegistroSucursales = new ArrayList();
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