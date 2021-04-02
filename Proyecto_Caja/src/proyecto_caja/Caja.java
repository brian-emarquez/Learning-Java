/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_caja;

/**
 *
 * @author brian
 */
public class Caja {
    
    int ancho;
    int alto;
    int profundo;
    
    public Caja() {
        System.out.println("Biemvenido al Proyecto caja");
        }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int calcularVolumen() {
        return ancho * alto * profundo;
    }
}