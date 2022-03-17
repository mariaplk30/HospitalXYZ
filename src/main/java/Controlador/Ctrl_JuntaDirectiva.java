package Controlador;
import Modelo.Entidades.Medico;
import Modelo.Entidades.Sucursal;
import Modelo.Entidades.FabricaSucursales;
import Data.BDD;

public class Ctrl_JuntaDirectiva {

    public Ctrl_JuntaDirectiva(){}

    private Medico RegistroMedicos;

    public void RegistrarMedico(){
    
    }

    public boolean ExisteSucursal(){
        return true;
    }

    public boolean AbrirSucursal(String nombre){
        if(!ExisteSucursal()) {
            FabricaSucursales fabrica = new FabricaSucursales();
            Sucursal sucursal = fabrica.crearSucursal(nombre);
            BDD bdd = new BDD();
            bdd.addSucursal(sucursal);
            return true;
        } else {
            //console.log(marico);
            return false;
        }
    }

    public boolean ExisteMedico(Medico datos){
        return true;
    }

    public boolean VerificarDatos(Medico datos){
        return true;
    }
}