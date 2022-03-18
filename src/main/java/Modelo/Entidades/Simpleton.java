/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Entidades;

/**
 *
 * @author David
 */
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
