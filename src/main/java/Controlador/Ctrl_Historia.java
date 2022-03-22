//package Controlador;
//import Modelo.Entidades.*;
//import Data.BDD;
//import java.util.*;
//
//
//public class Ctrl_Historia{
//    
//    public String sucursal = "";
//    private BDD bdd = new BDD();
//    public int SucursalI;
//    public int PacienteI;
//    public int MedicoI;
//    
//    public Ctrl_Historia(){}
//    
//    public static boolean isEmpty(String paciente, String peso, String talla, String IMC, String PPM, String tensionMax, String tensionMin, String evolucion, String control, String sucursal){
//        return paciente.isEmpty() || paciente.isBlank() || peso.isEmpty() || peso.isBlank() ||
//               talla.isEmpty() || talla.isBlank() || IMC.isEmpty() || IMC.isBlank() ||
//               tensionMax.isEmpty() || tensionMax.isBlank() || tensionMin.isEmpty() || tensionMin.isBlank() ||
//               evolucion.isEmpty() || evolucion.isBlank() || control.isEmpty() || control.isBlank() ||
//               sucursal.isEmpty() || sucursal.isBlank();
//    }
//    
//    public static boolean VerificarDatosHistoria(String paciente, String peso, String talla, String IMC, String PPM, String tensionMax, String tensionMin, String evolucion, String control, String sucursal){
//        return  paciente.matches("\\d*") && 
//                peso.matches("\\d*") && 
//                talla.matches("\\d*") && 
//                IMC.matches("\\d*") && 
//                PPM.matches("\\d*") && 
//                tensionMax.matches("\\d*") && 
//                tensionMin.matches("\\d*") && 
//                sucursal.matches("^(?![\\s.]+$)[a-zA-Z\\u00C0-\\u017F\\s.]*") &&
//                !isEmpty(paciente, peso, talla, IMC, PPM, tensionMax, tensionMin, evolucion, control, sucursal);
//    }
//    
//    public Sucursal getSucursal(){
//        if(bdd.cantSucursales() > 0){
//            for(int i=0; i < bdd.cantSucursales(); i++){
//                if(bdd.getArregloSucursales().get(i).getNombre().equals(sucursal)){
//                    return bdd.getArregloSucursales().get(i);
//                }
//            }
//        }
//        return null;
//    }
//    
//    public Paciente getPaciente(String cedula){
//        bdd.leerArchivoJSON();
//        Sucursal sucursal = getSucursal();
//        for(int j=0; j < sucursal.cantPacientes(); j++){
//            if(sucursal.getPaciente(j).getCedula().equals(cedula)){
//                return sucursal.getPaciente(j);
//            }
//        }
//        return null;
//    }
//    
//    public boolean CrearHistoria(String paciente, String peso, String talla, String IMC, String pulso, String tensionMax, String tensionMin, String sucursal){
//        this.sucursal = sucursal;
//        if(ExistePaciente(paciente)){
//                Paciente Paciente = getPaciente(paciente);
//                Historia historia = new Historia(paciente);
//                    ArrayList<HistorialCita> historial = historia.getCitas();
//                        Valores valores = new Valores();
//                        valores.setPeso(Double.parseDouble(peso));
//                        valores.setTalla(Double.parseDouble(talla));
//                        valores.setPesoTalla(Double.parseDouble(IMC));
//                            Tension tension = new Tension();
//                            tension.setMaxima(Integer.parseInt(tensionMax));
//                            tension.setMinima(Integer.parseInt(tensionMin));
//                        valores.setTension(tension); 
//                        valores.setPulso(Integer.parseInt(pulso));
//                    if(historial.size()-1 >= 0){
//                        historial.get(historial.size()-1).setValores(valores);
//                        historial.get(historial.size()-1).setID(Paciente.getCitas().get(0).getID());
//                    }else{
//                        historial.get(0).setValores(valores);
//                        historial.get(0).setID(Paciente.getCitas().get(0).getID());
//                    }
//                historia.setCitas(historial);
//                Paciente.getHistorial().add(historia);
//            return true;
//        }else{
//            return false;
//        }
//    }
//
//    public boolean ExistePaciente(String cedula){
//        bdd.leerArchivoJSON();
//        Sucursal sucursal = getSucursal();
//        for(int j=0; j < sucursal.cantPacientes(); j++){
//            if(sucursal.getPaciente(j).getCedula().equals(cedula)) return true;
//        }
//        return false;
//    }
//   
//    public boolean ModificarHistoria(String paciente, String peso, String talla, String IMC, String tensionMax, String tensionMin, String sucursal){
//        this.sucursal = sucursal;
//        if(ExistePaciente(paciente) && !getPaciente(paciente).getHistorial().isEmpty()){
//            Paciente Paciente = getPaciente(paciente);
//                Historia historia = new Historia();
//                if(Paciente.getHistorial().size()-1 >= 0) historia = Paciente.getHistorial().get(Paciente.getHistorial().size()-1);
//                else historia = Paciente.getHistorial().get(0);
//                    ArrayList<HistorialCita> historial = historia.getCitas();
//                        Valores valores = new Valores();
//                        valores.setPeso(Double.parseDouble(peso));
//                        valores.setTalla(Double.parseDouble(talla));
//                        valores.setPesoTalla(Double.parseDouble(IMC));
//                            Tension tension = new Tension();
//                            tension.setMaxima(Integer.parseInt(tensionMax));
//                            tension.setMinima(Integer.parseInt(tensionMin));
//                        valores.setTension(tension);
//                        valores.setPulso(0); //NUNCA SE LEE PULSO EN NINGUNA INTERFAZ
//                    if(historial.size()-1 >= 0){
//                        historial.get(historial.size()-1).setValores(valores);
//                        historial.get(historial.size()-1).setID(Paciente.getCitas().get(0).getID());
//                    }else{
//                        historial.get(0).setValores(valores);
//                        historial.get(0).setID(Paciente.getCitas().get(0).getID());
//                    }
//                historia.setCitas(historial);
//                Paciente.getHistorial().add(historia);
//                if(ExistePacienteYMedico(paciente, " ", sucursal, false) == true){
//                    BDD bd = new BDD();
//                    ArrayList<Sucursal> sucursales = bd.getArregloSucursales();
//
//                    for(int i=0; i< sucursales.get(SucursalI).getPaciente(PacienteI).getCitas().size(); i++){
//                        sucursales.get(SucursalI).getPaciente(PacienteI).getHistorial().add(historia);           
//                    }
//                }else{
//                    return false;
//                }
//            return true;
//        }else{
//            return false;
//        }
//    }
//
//    public boolean ExistePacienteYMedico(String paciente, String medico, String sucursal, boolean med){
//        BDD bd = new BDD();
//        bd.leerArchivoJSON();
//        ArrayList<Sucursal> sucursales = bd.getArregloSucursales();
//        boolean existePaciente = false;
//        boolean existeMedico = false;
//        boolean existeSucursal = false;
//
//        for(int i=0; i<sucursales.size(); i++){
//
//            if(sucursal.toLowerCase().equals(sucursales.get(i).getNombre().toLowerCase()) == true){
//                existeSucursal = true;
//                SucursalI = i;
//                
//                ArrayList<Paciente> pacientes = sucursales.get(i).getPacientes();
//                for(int j=0; j<pacientes.size(); j++){
//                    if(paciente.toLowerCase().equals(pacientes.get(j).getNombre().toLowerCase()) == true){
//                        PacienteI = j;
//                        existePaciente = true;
//                    System.out.println("existe paciente");
//
//                    }
//                }
//                
//                if(existePaciente == false){
//                    System.out.println("no existe paciente");
//                    return false;
//                } 
//  
//                if(med == true){
//                    ArrayList<Medico> medicos = sucursales.get(i).getMedicos();
//                    for(int j=0; j<medicos.size(); j++){
//                        if(medico.toLowerCase().equals(medicos.get(j).getNombre().toLowerCase()) == true){
//                            MedicoI = j;
//                            existeMedico = true;
//                        System.out.println("existe medico");
//
//                        }
//                    }
//
//                    if(existeMedico == false){
//                        System.out.println("no existe medico");
//                        return false;
//                    }
//                }
//
//            }
//        }
//        if(existeSucursal == true) return true;
//        else return false;
//    }
//}
//
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