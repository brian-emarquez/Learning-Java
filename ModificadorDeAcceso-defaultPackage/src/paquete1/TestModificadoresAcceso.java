/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete1.Clase1;
import paquete1.ClaseHija;

/**
 *
 * @author brian
 */
public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        clase1.atributoDefault= "Cambio desde la prueba default";
        System.out.println("clase atributo default = " + clase1.atributoDefault);
        clase1.metododefault();
    }
}
