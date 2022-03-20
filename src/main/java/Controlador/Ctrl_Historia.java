package Controlador;
import Vista.Medico.*;

import Modelo.Entidades.*;
import Data.BDD;
import java.util.*;

public class Ctrl_Historia{
    
    public Ctrl_Historia(){
        
    }

    public void CrearHistoria(String paciente,String peso,String talla,String IMC,String tensionMax,String tensionMin){
        BDD bd = new BDD();
        bd.leerArchivoJSON();
        ArrayList<Sucursal> sucursales = bd.getArregloSucursales();
        
        HistorialCita historialCita = new HistorialCita(id);
        historialCita.setPeso(Double.parseDouble(peso));
        historialCita.setTalla(Double.parseDouble(talla));
        historialCita.setPesoTalla(Double.parseDouble(IMC));
        historialCita.setTensionMax(Integer.parseInt(tensionMax));
        historialCita.setTensionMin(Integer.parseInt(tensionMin));
        int tession[]= {historialCita.getTensionMax(),historialCita.getTensionMin()};
        historialCita.setTension(tession);
        
        Historia historia = new Historia();
        historia.setID();
        historia.setPaciente(paciente);
        cita.setMedico(sucursales.get(SucursalI).getMedico(MedicoI).getID());

        sucursales.get(SucursalI).getPaciente(PacienteI).addCita(cita);
        bd.main();
    
    }

    public void ModificarPaciente(Paciente datos){
    
    }

    public boolean ExistePaciente(Historia datos){
        return true;
    }

    public boolean VerificarDatos(Historia datos){
        return true;
    }
}
