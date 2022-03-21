package Data;
import java.util.*;
import Modelo.Entidades.*;

public class Programa {
    private ArrayList<Directivo> juntaDirectiva;
    public ArrayList<Sucursal> sucursales;

    public Programa(){
        juntaDirectiva = new ArrayList();
        sucursales = new ArrayList();
    }
    
    public Programa(ArrayList<Directivo> junta, ArrayList<Sucursal> sucursales){
        this.juntaDirectiva = junta;
        this.sucursales = sucursales;
    }

    public ArrayList getJuntaDirectiva() {
        return juntaDirectiva;
    }

    public void setJuntaDirectiva(ArrayList junta) {
        this.juntaDirectiva = junta;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }
}
