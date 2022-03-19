import Modelo.Entidades.*;
import Data.*;

public class prueba {
    public static void main(String args[]){
        FabricaSucursales fb = new FabricaSucursales();
        JuntaDirectiva j = JuntaDirectiva.getJuntaDirectiva(fb);
        
        Sucursal a = fb.crearSucursal("nombre 1");
        j.addSucursal(a);
        a = fb.crearSucursal("nombre 2");
        j.addSucursal(a);
        a = fb.crearSucursal("nombre 3");
        j.addSucursal(a);
        j.probarSucursales();
    }
}