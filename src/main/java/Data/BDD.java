package Data;
import Modelo.Entidades.*;
import java.util.ArrayList;

public class BDD{
    private ArrayList<Sucursal> Sucursales; //Al crear o agregar una sucursal, se le asigna un ID único.
    
    private ArrayList<Medico> Medicos; //Se guardan todos los medicos registrados para asignarles un ID único
                                       //para luego ingresarlos o no en una sucursal.
    public BDD(){
        Sucursales = new ArrayList();
        Medicos = new ArrayList();
    }
    
    public int cantSucursales(){
        return Sucursales.size();
    }
    
    private String ID_Sucursal(){
        String mensaje = "S";
        int j = 0;
        
        //Log10(X) = cantidad de digitos de X sin contar las unidades.
        //si es 10 => log10(10) = 1 ; si es 100 => log10(100) = 2 ; si es 7 => log10(7) = 0.
        
        if(Math.log10(Sucursales.size())<1) j = 1; //Menor que 1, implica que el número es de 1 dígito.
        
        else j = (int) Math.log10(Sucursales.size()) + 1; //Mayor a 1, que es de 2 o más dígitos.
        
        //8-j para delimitar con cuantos 0 rellenar el mensaje sin superar los 8 dígitos numéricos
        //y concatenar el número correspondiente al tamaño de la lista -1 para comenzar desde el S00000000.
        
        for(int i=1; i<=8-j; i++) mensaje += "0";
        
        return mensaje + Integer.toString(Sucursales.size() - 1);   
    }
    
    public void addSucursal(Sucursal sucursal){
        Sucursales.add(sucursal);
        Sucursales.get(Sucursales.size()-1).setID(ID_Sucursal()); //A cada sucursal agregada se le genera su ID único.
    }
    
    public void addSucursal(String nombre){
        Sucursal sucursal = new Sucursal(nombre);
        addSucursal(sucursal);
    }
    
    public Sucursal getSucursal(int i){
        return Sucursales.get(i);
    }
    
    public ArrayList<Sucursal> getSucursales(){
        return Sucursales;
    }
    
    //ID_Medico emplea la misma lógica de ID_Sucursal, cambiando la clase utilizada.
    private String ID_Medico(){
        String mensaje = "M";
        int j = 0;
        
        if(Math.log10(Medicos.size())<1) j = 1;
        else j = (int) Math.log10(Medicos.size()) + 1;
        
        for(int i=1; i<=8-j; i++) mensaje += "0";
        
        return mensaje + Integer.toString(Medicos.size() - 1);  
    }
    
    public void addMedico(Medico medico){
        Medicos.add(medico);
        Medicos.get(Medicos.size()-1).setID(ID_Medico()); //A cada médico agendado se le genera su ID único.
    }
    
    public void addMedico(String nombre, String especialidad){
        Medico medico = new Medico(nombre, especialidad);
        addMedico(medico);
    }
    
    public Medico getMedico(int i){
        return Medicos.get(i);
    }
    
    public ArrayList<Medico> getMedicos(){
        return Medicos;
    }
}