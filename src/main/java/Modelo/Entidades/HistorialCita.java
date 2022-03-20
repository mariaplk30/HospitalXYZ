package Modelo.Entidades;
import org.json.simple.JSONObject;

public class HistorialCita {
    private String ID;
    private double Peso;
    private double Talla;
    private double PesoTalla;
    private int TensionMax;
    private int TensionMin;
    private int[] Tension;
    private int Pulso;

    public HistorialCita(String id){
     ID= id;
    }

    public HistorialCita(String id, double peso, double talla, double pesoTalla, JSONObject tension, int pulso){
        ID = id;
        Peso = peso;
        Talla = talla;
        PesoTalla = pesoTalla;
        Tension[0] = (int)tension.get("maxima");
        Tension[1] = (int)tension.get("minima");
        Pulso = pulso;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getTalla() {
        return Talla;
    }

    public void setTalla(double Talla) {
        this.Talla = Talla;
    }

    public double getPesoTalla() {
        return PesoTalla;
    }

    public void setPesoTalla(double PesoTalla) {
        this.PesoTalla = PesoTalla;
    }

//    public float getIMC(){
//        IMC = Math.round((int) Peso/Math.pow(Talla, 2) * 100d) /100d; // Sacar IMC limitando sus decimales a 2
//        return (float) IMC;
//    }
    
    
    public int getTensionMax() {
        return TensionMax;
    }

    public void setTensionMax(int TensionMax) {
        this.TensionMax = TensionMax;
    }

    public int getTensionMin() {
        return TensionMin;
    }

    public void setTensionMin(int TensionMin) {
        this.TensionMin = TensionMin;
    }

    public int[] getTension() {
        return Tension;
    }

    public void setTension(int[] Tension) {
        this.Tension = Tension;
    }
    
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
    
    
    public int getPulso() {
        return Pulso;
    }

    public void setPulso(int Pulso) {
        this.Pulso = Pulso;
    }



}
