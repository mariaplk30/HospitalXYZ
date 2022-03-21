package Data;
import java.util.*;
import Modelo.Entidades.*;

public class Programa {
    public ArrayList<Sucursal> sucursales;
    //Singleton y Factory Method
    private FabricaSucursales fabrica = new FabricaSucursales();
    private JuntaDirectiva junta = JuntaDirectiva.getJuntaDirectiva(fabrica); //Aplicación de Singleton
    
    public Programa(){
        sucursales = new ArrayList();
    }
    
    public Programa(ArrayList<Sucursal> sucursales, JuntaDirectiva junta){
        this.sucursales = sucursales;
        this.junta = junta;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public ArrayList getJunta() {
        return junta.getDirectivos();
    }

    public void setJunta(JuntaDirectiva junta) {
        this.junta = junta;
    }
}
