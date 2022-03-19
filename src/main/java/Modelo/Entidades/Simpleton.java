package Modelo.Entidades;

public class Simpleton {
    private static Simpleton instanciaSimpleton;
    private String dataSimpleton;
    
    private Simpleton(String dataSimpleton) {
        this.dataSimpleton = dataSimpleton;
    }
    
    public static Simpleton obtenerInstancia(String dataSimpleton) {
        
        if(instanciaSimpleton == null) {
            instanciaSimpleton = new Simpleton(dataSimpleton);
        }

        return instanciaSimpleton;
    }
}
