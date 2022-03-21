package Modelo.Entidades;
import java.util.*;

public class JuntaDirectiva{
    private ArrayList<Directivo> Directivos;
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
    
    public void addNombre(String nombre){
        Directivo dick = new Directivo();
        dick.setNombre(nombre);
        this.Directivos.add(dick);
    }
    
    public void addNombre(Directivo nombre){
        this.Directivos.add(nombre);
    }
    
    public ArrayList<Directivo> getDirectivos(){
        return Directivos;
    }
    
    public Directivo getDirectivo(int i){
        return Directivos.get(i);
    }
    
    private String ID_Medico(){
        String mensaje = "M";
        int j = 0;int aux = RegistroMedicos.size() - 1;
        
        if(Math.log10(RegistroMedicos.size())<1) j = 1;
        else j = (int) Math.log10(RegistroMedicos.size()) + 1;
        
        for(int i=1; i<=8-j; i++) mensaje += "0";
        
        return mensaje + Integer.toString(aux);  
    }
    
    private boolean registrado(Medico medico){
        if(!RegistroMedicos.isEmpty()){
            for(int i=0; i < RegistroMedicos.size(); i++){
                if(RegistroMedicos.get(i).getNombre().toLowerCase().equals(medico.getNombre().toLowerCase())) return true;
            }
        }
        return false;
    }
    
    public void addMedico(Medico medico){
        if((!registrado(medico))){
            RegistroMedicos.add(medico);
            medico.setID(ID_Medico()); //A cada médico registrado se le genera
        }
    }
 
    public void addMedico(String id, String nombre, String especialidad){
        Medico medico = new Medico(id, nombre, especialidad);
        addMedico(medico);
    }
    
    public Medico getMedico(int i){
        return RegistroMedicos.get(i);
    }
    
    public Medico searchMedico(Medico medico){
        if(registrado(medico)){
            for(int i=0; i < RegistroMedicos.size(); i++){
                if(RegistroMedicos.get(i).getNombre().toLowerCase().equals(medico.getNombre().toLowerCase()))
                        return RegistroMedicos.get(i);
            }
        }
        return null;
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
}