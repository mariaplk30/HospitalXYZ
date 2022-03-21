package Controlador;
import Modelo.Entidades.*;
import Data.BDD;
import java.util.*;

public class Ctrl_Historia{
    
    public String sucursal = "";
    private BDD bdd = new BDD();
    
    public Ctrl_Historia(){}
    
    public static boolean VerificarDatosHistoria(String paciente, String peso, String talla, String IMC, String PPM, String tensionMax, String tensionMin, String evolucion, String control, String sucursal){
        return  paciente.matches("\\d*"); //HACER VERIFICACION PARA LAS DEMAS PLS
    }
    
    public Sucursal getSucursal(){
        if(bdd.cantSucursales() > 0){
            for(int i=0; i < bdd.cantSucursales(); i++) if(bdd.getArregloSucursales().get(i).getNombre().equals(sucursal)) return bdd.getArregloSucursales().get(i);
        }
        return null;
    }
    
    public void CrearHistoria(String paciente, String peso, String talla, String IMC, String tensionMax, String tensionMin, String sucursal){
        this.sucursal = sucursal;
        if(ExistePaciente(paciente) && getPaciente(paciente).getHistorial().isEmpty()){
                Paciente Paciente = getPaciente(paciente);
                Historia historia = new Historia(paciente);
                    HistorialCita historial = historia.getHistorial();
                    historial.setPeso(Double.parseDouble(peso));
                    historial.setTalla(Double.parseDouble(peso));
                    historial.setPesoTalla(Double.parseDouble(IMC));
                    historial.setTensionMax(Integer.parseInt(tensionMax));
                    historial.setTensionMin(Integer.parseInt(tensionMin));
                    int tension[] = {historial.getTensionMax(), historial.getTensionMin()};
                    historial.setTension(tension);
                    historial.setID(Paciente.getCitas().get(0).getID());                   
                historia.setHistorial(historial);
                Paciente.getHistorial().add(historia);
                setHistoria(Paciente);        
        }else{
            //Interfaz que diga "PACIENTE NO REGISTRADO" o algo parecido
            //con botón para volver (>>LLAMADO VOLVER<<) a la interfaz de crear historia
            
            //¿Por qué?, no puedes crearle una historia a un paciente no registrado
        }
    }

    public boolean ExistePaciente(String cedula){
        bdd.leerArchivoJSON();
        Sucursal sucursal = getSucursal();
        for(int j=0; j < sucursal.cantPacientes(); j++){
            if(sucursal.getPaciente(j).getCedula().equals(cedula)) return true;
        }
        return false;
    }
    
    public void setHistoria(Paciente paciente){
        for(int i=0; i < bdd.cantSucursales(); i++){
            if(bdd.getArregloSucursales().get(i).getNombre().equals(sucursal)){
                for(int j=0; j < bdd.getArregloSucursales().get(i).getPacientes().size(); j++){
                    if(bdd.getArregloSucursales().get(i).getPaciente(j).getCedula().equals(paciente.getCedula())){
                        bdd.getArregloSucursales().get(i).getPaciente(j).setHistorial(paciente.getHistorial());
                    }
                }
            }
        }
    }
    
    public Paciente getPaciente(String cedula){
        bdd.leerArchivoJSON();
        Sucursal sucursal = getSucursal();
        for(int j=0; j < sucursal.cantPacientes(); j++){
            if(sucursal.getPaciente(j).getCedula().equals(cedula)) return sucursal.getPaciente(j);
        }
        return null;
    }
    
    public void ModificarHistoria(String paciente, String peso, String talla, String IMC, String tensionMax, String tensionMin, String sucursal){
        this.sucursal = sucursal;
        if(ExistePaciente(paciente) && !getPaciente(paciente).getHistorial().isEmpty()){
            Paciente Paciente = getPaciente(paciente);
                Historia historia = Paciente.getHistorial().get(Paciente.getHistorial().size()-1);
                    HistorialCita historial = historia.getHistorial();
                    historial.setPeso(Double.parseDouble(peso));
                    historial.setTalla(Double.parseDouble(peso));
                    historial.setPesoTalla(Double.parseDouble(IMC));
                    historial.setTensionMax(Integer.parseInt(tensionMax));
                    historial.setTensionMin(Integer.parseInt(tensionMin));
                    int tession[]= {historial.getTensionMax(),historial.getTensionMin()};
                    historial.setTension(tession);
                historia.setHistorial(historial);
            Paciente.setHistorial(historia);
            setHistoria(Paciente);
            //Abrir interfaz de operación realizada exitosamente
        }else{
            //Interfaz que diga "PACIENTE NO REGISTRADO" o algo parecido
            //con botón para volver (>>LLAMADO VOLVER<<) a la interfaz de modificar historia
            
            //¿Por qué?, no puedes modificarle una historia a un paciente no registrado
        }
    }
}
