package Modelo.Entidades;
import java.util.*;

public class JuntaDirectiva{
    private ArrayList<String> Directivos;
    private ArrayList<Medico> RegistroMedicos;
    private ArrayList<Sucursal> RegistroSucursales;
    
    private FabricaSucursales fabricaSucursales;
    
    public JuntaDirectiva(FabricaSucursales fabricaSucursales){
        Directivos = new ArrayList();
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