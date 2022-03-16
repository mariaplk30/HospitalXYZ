import Modelo.Entidades.*;
public class prueba {
    public static void main(String args[]) {
        Medico m1 = new Medico("1","m1","e1");
        System.out.print(m1.getID_Medico() + " " + m1.getNombres() + " " + m1.getEspecialidad());
    }
}
