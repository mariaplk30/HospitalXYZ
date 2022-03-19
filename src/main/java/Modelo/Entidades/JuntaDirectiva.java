package Modelo.Entidades;
import java.util.*;
/**/
public class JuntaDirectiva{
    private ArrayList<String> Directivos;
    private ArrayList<Medico> RegistroMedicos;
    private ArrayList<Sucursal> RegistroSucursales;
    
    private static JuntaDirectiva juntaDirectivaSimpleton;
    private static FabricaSucursales fabricaSucursales; 
    
    
    private JuntaDirectiva(FabricaSucursales fabricaSucursales2){        
        Directivos = new ArrayList();
        RegistroMedicos = new ArrayList();
        RegistroSucursales = new ArrayList();
        fabricaSucursales = fabricaSucursales2;
    }
    
    public JuntaDirectiva getJuntaDirectiva() {
        if(juntaDirectivaSimpleton == null) {
            juntaDirectivaSimpleton = new JuntaDirectiva(fabricaSucursales);
        }
        return juntaDirectivaSimpleton;
    }

    //metodo de prueba de instanciacion de la junta directiva
    public void probarJunta() {
       System.out.println("Hay una junta.");
   }
    
    public void addDirectivo(String nombre){
        Directivos.add(nombre);
    }
    
    public void addMedico(Medico medico){
        RegistroMedicos.add(medico);
    }
 
    public void addMedico(String id, String nombre, String especialidad){
        Medico medico = new Medico(id, nombre, especialidad);
        addMedico(medico);
    }
    
    public void addSucursal(Sucursal sucursal){
        RegistroSucursales.add(sucursal);
    }
    
    public void addSucursal(String nombre){
        Sucursal sucursal = new Sucursal(nombre);
        addSucursal(sucursal);
    }
    
    public void RegPacientes(int anio){
        
        /*Busca en las sucursales a los pacientes desde el 1º de Enero hasta el 31 de Diciembre del año ingresado*/
    }
    
    public void RegPacientes(){
        
        /*Busca en las sucursales a los pacientes desde el 1º de Enero hasta el 31 de Diciembre del año actual*/
    }
}