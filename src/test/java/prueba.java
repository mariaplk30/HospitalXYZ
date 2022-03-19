import Modelo.Entidades.*;
import Data.*;
import java.util.*;

public class prueba {
    public static void main(String args[]){
        
        // Simpleton y Factory Method para crear junta directiva, y así crear sucursales
            FabricaSucursales f = new FabricaSucursales();
            JuntaDirectiva j = JuntaDirectiva.getJuntaDirectiva(f);
            
            Sucursal a = f.crearSucursal("nombre 1");
            j.addSucursal(a);
            a = f.crearSucursal("nombre 2");
            j.addSucursal(a);
            a = f.crearSucursal("nombre 3");
            j.addSucursal(a);
           
        //Pacientes y citas
            Cita c = new Cita("000000001", "19-3-2022", "M00000001");
            Cita c2 = new Cita("000000002", "29-3-2022", "M00000002");
            Cita c3 = new Cita("000000003", "1-1-2023", "M00000001");
            
            ArrayList<Cita> citas = new ArrayList();
            citas.add(c);
            citas.add(c2);
            citas.add(c3);
            
            ArrayList<Historia> historias = new ArrayList();
            
            Paciente uno = new Paciente("1", "paciente 1", citas, historias);
            Paciente dos = new Paciente("2", "paciente 2", citas, historias);
            Paciente cinco = new Paciente("2", "paciente 2", citas, historias);
            Paciente seis = new Paciente("2", "paciente 2", citas, historias);
            
            citas = new ArrayList(); // paciente 3 y 4
            citas.add(c3);
          
            Paciente tres = new Paciente("3", "paciente 3", citas, historias);
            Paciente cuatro = new Paciente("4", "paciente 4", citas, historias);
            
            ArrayList<Paciente> pacientes = new ArrayList();
            pacientes.add(uno);
            pacientes.add(dos);
            pacientes.add(cinco);
            pacientes.add(seis);
        
            j.getSucursal(0).setPacientes(pacientes);
            
            pacientes = new ArrayList();
            pacientes.add(tres);
            pacientes.add(cuatro);
            
            j.getSucursal(1).setPacientes(pacientes);
            
            
            for(int i=0; i<j.getCantSucursales(); i++){
                System.out.print(j.getSucursal(i).getNombre() + ": ");
                System.out.println(j.RegPacientes(j.getSucursal(i).getNombre()) + " pacientes");
            }
            
            
    }
}