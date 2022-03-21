/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Entidades;

/**
 *
 * @author Hogar
 */
public class Valores {
    private double Peso;
    private double Talla;
    private double PesoTalla;
    private Tension tension;
    private int Pulso;


    public Valores(){}

    public Valores(double Peso, double Talla, double PesoTalla, Tension tension, int pulso){
        this.Peso = Peso;
        this.Talla = Talla;
        this.PesoTalla = PesoTalla;
        this.tension = tension;
        this.Pulso = pulso;

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

    public Tension getTension() {
        return tension;
    }

    public void setTension(Tension tension) {
        this.tension = tension;
    }

    public int getPulso() {
        return Pulso;
    }

    public void setPulso(int Pulso) {
        this.Pulso = Pulso;
    }



}
