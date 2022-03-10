package Modelo.Entidades;
import java.util.*;

public class Sucursal {
    private String Ubicacion;
    private String Telefono;
    private String Gerente;
    private int CantidadDepartamentos;
    private ArrayList<String> Departamentos;
    
    public void setUbicacion(String ubi){
        Ubicacion = ubi;
    }

    public String getUbicacion(){
        return Ubicacion;
    }
            
    public void setTelefono(String tlf){
        Telefono = tlf;
    }

    public String getTelefono(){
        return Telefono;
    }
            
    public void setGerente(String gerente){
        Gerente = gerente;
    }

    public String getGerente(){
        return Gerente;
    }
            
    public void setCantDepartamentos(int num){
        CantidadDepartamentos = num;
    }

    public int getCantDepartamentos(){
        return CantidadDepartamentos;
    }
    
    public void setDepartamentos(int num, String depa){
        if(num<=CantidadDepartamentos){
            Departamentos.add(num, Telefono);
        }
    }
    
    public String getDepartamentos(int num){
        return Departamentos.get(num);
    }
    
    public ArrayList<String> getDepartamentos(){
        return Departamentos;
    }
    
    public void ListarDepartamentos(){
        for(int i=0;i<CantidadDepartamentos;i++){
            System.out.println(Departamentos.get(i));
        }
    }
}