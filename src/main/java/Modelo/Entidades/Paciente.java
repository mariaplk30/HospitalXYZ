package Modelo.Entidades;
import java.util.ArrayList;
/**/
public class Paciente{

    public String getNombre() {
        return Nombre;
    }

    public void setNombres(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCi() {
        return cedula;
    }

    public void setCi(String Ci) {
        this.cedula = Ci;
    }

    public ArrayList<Historia> getHistorial() {
        return Historial;
    }

    public void setHistorial(ArrayList<Historia> Historial) {
        this.Historial = Historial;
    }

    public ArrayList<Cita> getCitas() {
        return Citas;
    }

    public void setCitas(ArrayList<Cita> Citas) {
        this.Citas = Citas;
    }
    private String Nombre;
    private String cedula;

    private ArrayList<Historia> Historial;
    private ArrayList<Cita> Citas;

    public Paciente(){
        cedula = "";
        Nombre = "";
        Citas = new ArrayList();
        Historial = new ArrayList();
}
    
    public Paciente(String ci, String nombre, ArrayList<Cita> citas, ArrayList<Historia> historial){
        cedula = ci;
        Nombre = nombre;
        Citas = citas;
        Historial = historial;
    }
    
//    public void setOcupacion(String ocupacion){
//        Ocupacion = ocupacion;
//    }
//    
//    public String getOcupacion(){
//        return Ocupacion;
//    }
//    
//    public void setProfesion(String profesion){
//        Profesion = profesion;
//    }
//    
//    public String getProfesion(){
//        return Profesion;
//    }
//    
//    public void setTelefonoRelacion(String tlf){
//        TelefonoRelacionado = tlf;
//    }
//    
//    public String getTelefonoRelacion(){
//        return TelefonoRelacionado;
//    }
//
//    public void setPeso(double peso){
//        Peso = peso;
//    }
//    
//    public double getPeso(){
//        return Peso;
//    }
//    
//    public void setTalla(double talla){
//        Talla = talla;
//    }
//    
//    public double getTalla(){
//        return Talla;
//    }
//    
//    public float getIMC(){
//        IMC = Math.round((int) Peso/Math.pow(Talla, 2) * 100d) /100d; // Sacar IMC limitando sus decimales a 2
//        return (float) IMC;
//    }
//    
//    public void setTensionMax(int tmax){
//        TensionMax = tmax;
//        Tension[0] = tmax;
//    }
//    
//    public  int getTensionMax(){
//        return TensionMax;
//    }
//    
//    public void setTensionMin(int tmin){
//        TensionMin = tmin;
//        Tension[1] = tmin;
//    }
//    
//    public int getTensionMin(){
//        return TensionMin;
//    }
//    
//    public int[] getTensiones(){
//        return Tension;
//    }
//    
//    public void setPulso(int pulso){
//        Pulso = pulso;
//    }
//    
//    public int getPulso(){
//        return Pulso;
//    }
    
//    public void crearHistoria(Historia historia){
//        Historia = historia;
//    }
//    
//    public void crearHistoria(String id){
//        Historia.setID(id);
//        Historia.setCI(Ci);
//    }
//    
//    public Historia getHistoria(){
//        return Historia;
//    }

}