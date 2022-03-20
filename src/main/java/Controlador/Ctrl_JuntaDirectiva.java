package Controlador;
import Modelo.Entidades.Medico;
import Modelo.Entidades.Sucursal;
import Modelo.Entidades.FabricaSucursales;
import Data.BDD;
import Modelo.Entidades.JuntaDirectiva;
import java.util.ArrayList;

public class Ctrl_JuntaDirectiva {
    public int SucursalI;
    public int MedicoI;
    private FabricaSucursales fabrica = new FabricaSucursales();
    private JuntaDirectiva junta = JuntaDirectiva.getJuntaDirectiva(fabrica);
    private BDD bdd = new BDD();

    
    public Ctrl_JuntaDirectiva(){}

    private Medico RegistroMedicos;

//    public void RegistrarMedico(Medico medico, String id, String nombre, String especialidad){
//        if(!ExisteMedico(medico)){
//            junta.addMedico(medico);
//        }else{
//            //INTERFAZ DE ERROR MEDICO YA EXISTE
//        }
//    }

    public ArrayList ReporteAnual(){
        ArrayList<String> aaa = new ArrayList();
        for(int i=0; i<junta.getCantSucursales(); i++){
            aaa.add(junta.getSucursal(i).getNombre()+ " " +  Integer.toString(junta.RegPacientes(junta.getSucursal(i).getNombre())) + " pacientes." );
        }      
        

        return aaa;
    }




//    public boolean ExisteSucursal(String nombre){
//        bdd.leerArchivoJSON();
//        ArrayList<Sucursal> sucursales = bdd.getArregloSucursales();
//        for(int i=0; )
//        return true;
//    }
//
//    public boolean AbrirSucursal(String nombre){
//        if(!ExisteSucursal(nombre)){
//            //Uso del singleton y factory method
//
//            
//            //Esta bdd es local, se necesita una global para poder usarla en verificaciones y registros
//            BDD bdd = new BDD();
//            bdd.addSucursal(sucursal);
//            
//            //Garantizar que la sucursal esté en el json pls, no sabemos cómo hacerlo
//            return true;
//        } else {
//            //console.log(marico);
//            return false;
//        }
//    }
//
//    public boolean ExisteMedico(Medico datos, String id, String nombre, String especialidad){
//        BDD bdd = new BDD();
//        bdd.leerArchivoJSON();
//        FabricaSucursales fabrica = new FabricaSucursales();
//        JuntaDirectiva junta = JuntaDirectiva.getJuntaDirectiva(fabrica);
//        for(int i = 0; i < junta.getCantMedicos(); i++) {
//            if(datos.getNombre().equals(junta.getMedico(i).nombre)) {
//                return true;
//            }
//        }
//        return false;
//    }

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