package Modelo.Entidades;

public class HistorialCita {
    private String ID;
    private Valores valores;

    public HistorialCita(){}
    
    public HistorialCita(String id){
        ID= id;
    }

    public HistorialCita(String id, Valores val){
        ID= id;
        valores = val;
        
    }

    public Valores getVal() {
        return valores;
    }

    public void setVal(Valores val) {
        valores = val;
    }

    public void setID(String id){
        ID = id;
    }
    
    public String getId(){
        return ID;
    }   
    
}
