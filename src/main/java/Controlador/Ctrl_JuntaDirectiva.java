package Controlador;
import Modelo.Entidades.Medico;
import Modelo.Entidades.Sucursal;
import Modelo.Entidades.FabricaSucursales;
import Modelo.Entidades.JuntaDirectiva;
import Data.BDD;
import java.util.ArrayList;

public class Ctrl_JuntaDirectiva{
    //Singleton y Factory Method
    private FabricaSucursales fabrica = new FabricaSucursales();
    private JuntaDirectiva junta = JuntaDirectiva.getJuntaDirectiva(fabrica); //Aplicación de Singleton
    
    private BDD bdd = new BDD();
    
    public Ctrl_JuntaDirectiva(){}

    public static boolean VerificarDatosSucursal(String nombre, String ubicacion){
        return (nombre.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
                ubicacion.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*"));
    }
    
    public boolean ExisteSucursal(String nombre){
        bdd.leerArchivoJSON();
        for(int i=0; i < bdd.cantSucursales(); i++) if(bdd.getArregloSucursales().get(i).getNombre().equals(nombre)) return true;
        return false;
    }

    public void AbrirSucursal(String nombre){
        if(!ExisteSucursal(nombre)){
            //Aplicación de Factory Method
            Sucursal sucursal = fabrica.crearSucursal(nombre);
            junta.addSucursal(sucursal);
            bdd.addSucursal(sucursal);
            //Abrir interfaz de operación realizada exitosamente
        }else{
            //INTERFAZ DE ERROR SUCURSAL YA EXISTE (PREFERIBLEMENTE SOLO MENSAJE DE "SUCURSAL YA EXISTE")
            //con botón para volver (>>LLAMADO VOLVER<<) a la interfaz de abrir sucursal
        }
    }
    
    public static boolean VerificarDatosMedico(String nombres, String apellidos, String cedula, String sexo, String lugarN, String civil, String direccion, String telefono, String especialidad){
        return nombres.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           apellidos.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") && 
           sexo.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") && 
           lugarN.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           civil.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           direccion.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
           especialidad.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") && 
           cedula.matches("\\d*")&& 
           telefono.matches("\\d*");
    }
    
    public boolean ExisteMedico(String id, String nombre, String especialidad){
        bdd.leerArchivoJSON();
        Medico medico = new Medico(id, nombre, especialidad);
        for(int i = 0; i < junta.getCantMedicos(); i++) if(medico.getNombre().equals(junta.getMedico(i).getNombre())) return true;
        return false;
    }
    
    public void RegistrarMedico(String id, String nombre, String especialidad){
        if(!ExisteMedico(id, nombre, especialidad)){
            junta.addMedico(id, nombre, especialidad);
            for(int i=0; i < bdd.cantSucursales(); i++){
                if(bdd.getArregloSucursales().get(i).getMedicos().isEmpty()){
                    bdd.getArregloSucursales().get(i).addMedico(nombre, especialidad); //Agrega al médico nuevo a una sucursal vacía                    
                    break;
                }               
            }
            //Abrir interfaz de operación realizada exitosamente
        }else{
            //INTERFAZ DE ERROR MEDICO YA EXISTE (PREFERIBLEMENTE SOLO MENSAJE DE "MEDICO YA EXISTE")
            //con botón para volver (>>LLAMADO VOLVER<<) a la interfaz de registrar médico
        }
    }

    public ArrayList ReporteAnual(){
        ArrayList<String> reporte = new ArrayList();
        for(int i=0; i < junta.getCantSucursales(); i++){
            reporte.add(junta.getSucursal(i).getNombre()+ " " +  Integer.toString(junta.RegPacientes(junta.getSucursal(i).getNombre())) + " pacientes." );
        }      
        return reporte;
    }
}