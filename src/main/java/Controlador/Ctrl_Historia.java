package Controlador;
import Modelo.Entidades.*;
import Data.BDD;
import java.util.*;

public class Ctrl_Historia{
    
    public String sucursal = "";
    private BDD bdd = new BDD();
    
    public Ctrl_Historia(){}
    
    public static boolean isEmpty(String paciente, String peso, String talla, String IMC, String PPM, String tensionMax, String tensionMin, String evolucion, String control, String sucursal){
        return paciente.isEmpty() || paciente.isBlank() || peso.isEmpty() || peso.isBlank() ||
               talla.isEmpty() || talla.isBlank() || IMC.isEmpty() || IMC.isBlank() ||
               tensionMax.isEmpty() || tensionMax.isBlank() || tensionMin.isEmpty() || tensionMin.isBlank() ||
               evolucion.isEmpty() || evolucion.isBlank() || control.isEmpty() || control.isBlank() ||
               sucursal.isEmpty() || sucursal.isBlank();
    }
    
    public static boolean VerificarDatosHistoria(String paciente, String peso, String talla, String IMC, String PPM, String tensionMax, String tensionMin, String evolucion, String control, String sucursal){
        return  paciente.matches("\\d*") && 
                peso.matches("\\d*") && 
                talla.matches("\\d*") && 
                IMC.matches("\\d*") && 
                PPM.matches("\\d*") && 
                tensionMax.matches("\\d*") && 
                tensionMin.matches("\\d*") && 
                sucursal.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
                !isEmpty(paciente, peso, talla, IMC, PPM, tensionMax, tensionMin, evolucion, control, sucursal);
    }
    
    public Sucursal getSucursal(){
        if(bdd.cantSucursales() > 0){
            for(int i=0; i < bdd.cantSucursales(); i++) if(bdd.getArregloSucursales().get(i).getNombre().equals(sucursal)) return bdd.getArregloSucursales().get(i);
        }
        return null;
    }
    
    public boolean CrearHistoria(String paciente, String peso, String talla, String IMC, String tensionMax, String tensionMin, String sucursal){
        this.sucursal = sucursal;
        if(ExistePaciente(paciente)){
                Paciente Paciente = getPaciente(paciente);
                Historia historia = new Historia(paciente);
                    ArrayList<HistorialCita> historial = historia.getCitas();
                        Valores valores = new Valores();
                        valores.setPeso(Double.parseDouble(peso));
                        valores.setTalla(Double.parseDouble(talla));
                        valores.setPesoTalla(Double.parseDouble(IMC));
                            Tension tension = new Tension();
                            tension.setMaxima(Integer.parseInt(tensionMax));
                            tension.setMinima(Integer.parseInt(tensionMin));
                        valores.setTension(tension);
                        valores.setPulso(0); //NUNCA SE LEE PULSO EN NINGUNA INTERFAZ
                    if(historial.size()-1 >= 0){
                        historial.get(historial.size()-1).setValores(valores);
                        historial.get(historial.size()-1).setID(Paciente.getCitas().get(0).getID());
                    }else{
                        historial.get(0).setValores(valores);
                        historial.get(0).setID(Paciente.getCitas().get(0).getID());
                    }
                historia.setCitas(historial);
                Paciente.getHistorial().add(historia);
                setHistoria(Paciente);
                return true;
        }else{
            return false;
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
        bdd.main();
    }
    
    public Paciente getPaciente(String cedula){
        bdd.leerArchivoJSON();
        Sucursal sucursal = getSucursal();
        for(int j=0; j < sucursal.cantPacientes(); j++){
            if(sucursal.getPaciente(j).getCedula().equals(cedula)) return sucursal.getPaciente(j);
        }
        return null;
    }
    
    public boolean ModificarHistoria(String paciente, String peso, String talla, String IMC, String tensionMax, String tensionMin, String sucursal){
        this.sucursal = sucursal;
        if(ExistePaciente(paciente) && !getPaciente(paciente).getHistorial().isEmpty()){
            Paciente Paciente = getPaciente(paciente);
                Historia historia = new Historia();
                if(Paciente.getHistorial().size()-1 >= 0) historia = Paciente.getHistorial().get(Paciente.getHistorial().size()-1);
                else historia = Paciente.getHistorial().get(0);
                    ArrayList<HistorialCita> historial = historia.getCitas();
                        Valores valores = new Valores();
                        valores.setPeso(Double.parseDouble(peso));
                        valores.setTalla(Double.parseDouble(talla));
                        valores.setPesoTalla(Double.parseDouble(IMC));
                            Tension tension = new Tension();
                            tension.setMaxima(Integer.parseInt(tensionMax));
                            tension.setMinima(Integer.parseInt(tensionMin));
                        valores.setTension(tension);
                        valores.setPulso(0); //NUNCA SE LEE PULSO EN NINGUNA INTERFAZ
                    if(historial.size()-1 >= 0){
                        historial.get(historial.size()-1).setValores(valores);
                        historial.get(historial.size()-1).setID(Paciente.getCitas().get(0).getID());
                    }else{
                        historial.get(0).setValores(valores);
                        historial.get(0).setID(Paciente.getCitas().get(0).getID());
                    }
                historia.setCitas(historial);
                Paciente.getHistorial().add(historia);
                setHistoria(Paciente);
            return true;
        }else{
            return false;
        }
    }
}