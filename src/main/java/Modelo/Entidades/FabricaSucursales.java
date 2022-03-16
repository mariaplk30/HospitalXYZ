package Modelo.Entidades;

public class FabricaSucursales{
    public Sucursal crearSucursal(String nombre){
        Sucursal sucursal = new Sucursal(nombre);
        return sucursal;
    }
}