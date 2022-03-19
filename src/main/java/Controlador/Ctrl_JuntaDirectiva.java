package Controlador;
import Modelo.Entidades.Medico;
import Modelo.Entidades.Sucursal;
import Modelo.Entidades.FabricaSucursales;
import Data.BDD;
import Modelo.Entidades.JuntaDirectiva;

public class Ctrl_JuntaDirectiva {

    public Ctrl_JuntaDirectiva(){}

    private Medico RegistroMedicos;

    public void RegistrarMedico(){
    
    }

    public boolean ExisteSucursal(){
        return true;
    }

    public boolean AbrirSucursal(String nombre){
        if(!ExisteSucursal()){
            //Uso del simpleton y factory method
            FabricaSucursales fabrica = new FabricaSucursales();
            Sucursal sucursal = fabrica.crearSucursal(nombre);
            JuntaDirectiva junta = JuntaDirectiva.getJuntaDirectiva(fabrica);
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

    public boolean VerificarDatos(String nombres,String apellidos,String cedula,String sexo,String lugarN,String civil,String direccion,String telefono,String especialidad){
        if(nombres.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           apellidos.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") && 
           sexo.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") && 
           lugarN.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           civil.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           direccion.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           especialidad.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") && 
           cedula.matches("\\d*")&& 
           telefono.matches("\\d*") ){
           return true;
        }else{
           return false;
        }
    }
}