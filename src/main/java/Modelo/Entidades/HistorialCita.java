package Modelo.Entidades;


public class HistorialCita {
    private String ID;
    private Valores val;

    public HistorialCita(){}
    
    public HistorialCita(String id){
        ID= id;
    }

    public HistorialCita(String id, Valores val){
        ID= id;
        this.val = val;
        
    }

    public Valores getVal() {
        return val;
    }

    public void setVal(Valores val) {
        this.val = val;
    }


    
    public void setID(String id){
        ID = id;
    }
    
    public String getId(){
        return ID;
    }   
    
}
