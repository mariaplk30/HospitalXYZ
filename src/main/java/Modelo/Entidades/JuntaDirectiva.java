package Modelo.Entidades;
import java.util.*;

public class JuntaDirectiva{
    private ArrayList<String> Directivos;
    private ArrayList<Medico> RegistroMedicos;
    private ArrayList<Sucursal> RegistroSucursales;
    
    private static FabricaSucursales fabricaSucursales; 
    private static JuntaDirectiva juntaDirectivaSimpleton;
    
    public static JuntaDirectiva getJuntaDirectiva(FabricaSucursales fabricaSucursales2){
        if(juntaDirectivaSimpleton == null){
            juntaDirectivaSimpleton = new JuntaDirectiva(fabricaSucursales);
        }
        return juntaDirectivaSimpleton;
    }
    
    private JuntaDirectiva(FabricaSucursales fabricaSucursales2){        
        Directivos = new ArrayList();
        RegistroMedicos = new ArrayList();
        RegistroSucursales = new ArrayList();
        fabricaSucursales = fabricaSucursales2;
    }
    
    //metodo de prueba de instanciacion de la junta directiva
    public void probarJunta(){
       if(juntaDirectivaSimpleton != null) System.out.println("Hay una junta.");
   }
    
    public void addDirectivo(String nombre){
        Directivos.add(nombre);
    }
    
    public ArrayList<String> getDirectivos(){
        return Directivos;
    }
    
    public void addMedico(Medico medico){
        RegistroMedicos.add(medico);
    }
 
    public void addMedico(String id, String nombre, String especialidad){
        Medico medico = new Medico(id, nombre, especialidad);
        addMedico(medico);
    }
    
    public Medico getMedico(int i){
        return RegistroMedicos.get(i);
    }
    
    public int getCantMedicos(){
        return RegistroMedicos.size();
    }
    
    public void addSucursal(Sucursal sucursal){
        RegistroSucursales.add(sucursal);
    }
    
    public void addSucursal(String nombre){
        Sucursal sucursal = new Sucursal(nombre);
        addSucursal(sucursal);
    }
    
    public ArrayList<Sucursal> getSucursales(){
        return RegistroSucursales;
    }
    
    public Sucursal getSucursal(int i){
        return RegistroSucursales.get(i);
    }
    
    public int getCantSucursales(){
        return RegistroSucursales.size();
    }
     
    public int RegPacientes(String sucursal){
        /*Busca en las sucursales a los pacientes desde el 1º de Enero hasta el 31 de Diciembre del año actual*/
        int cont = 0; 
        Date fecha = new Date();
        String year = Integer.toString(fecha.getYear()+1900); //Año actual
        for(int i=0; i<RegistroSucursales.size(); i++){
            if(sucursal.equals(RegistroSucursales.get(i).getNombre())){
                ArrayList<Paciente> pacientes = RegistroSucursales.get(i).getPacientes();
                for(int j=0; j<pacientes.size(); j++){
                    ArrayList<Cita> citas = pacientes.get(j).getCitas();
                    for(int k=0; k<citas.size(); k++){
                        if(year.equals(citas.get(k).getFecha().substring(citas.get(k).getFecha().length()-4, citas.get(k).getFecha().length()))){
                            cont++;
                            break;
                        }
                    }
                }  
            }
        }
        return cont;
    }
    
    
    
    public void probarSucursales(){
        if(!RegistroSucursales.isEmpty()){
            for(int i=0; i<RegistroSucursales.size(); i++) System.out.println(RegistroSucursales.get(i).getNombre());
        }else System.out.println("No hay sucursales");
    }
}