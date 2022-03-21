package Modelo.Entidades;

public class Tension {
    int maxima;
    int minima;

    public Tension(){}

    public Tension(int maxima, int minima){
        this.maxima = maxima;
        this.minima = minima;
    }

    public String getMaxima() {
        return String.valueOf(maxima);
    }

    public void setMaxima(int maxima) {
        this.maxima = maxima;
    }

    public String getMinima() {
        return String.valueOf(minima);
    }

    public void setMinima(int minima) {
        this.minima = minima;
    } 
}
