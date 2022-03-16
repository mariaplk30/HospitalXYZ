package Modelo.Entidades;
import java.util.*;

public class JuntaDirectiva{
    private ArrayList<String> Directivos;
    private ArrayList<Medico> RegistroMedicos;
    private ArrayList<Sucursal> RegistroSucursales;
    
    public JuntaDirectiva(){
        Directivos = new ArrayList();
        RegistroMedicos = new ArrayList();
        RegistroSucursales = new ArrayList();
    }
    
    public void addDirectivo(String nombre){
        Directivos.add(nombre);
    }
    
    public void addMedico(Medico medico){
        RegistroMedicos.add(medico);
    }
 
    public void addSucursal(Sucursal sucursal){
        RegistroSucursales.add(sucursal);
    }
    
    public void RegPacientes(int anio){
        /*Busca en las sucursales a los pacientes desde el 1º de Enero hasta el 31 de Diciembre del año ingresado*/
    }
    
    public void RegPacientes(){
        /*Busca en las sucursales a los pacientes desde el 1º de Enero hasta el 31 de Diciembre del año actual*/
    }
}