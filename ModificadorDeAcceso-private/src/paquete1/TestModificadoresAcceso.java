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
        Clase1 clase1 = new Clase1("Publico");
        clase1.setAtributoDefault("Cambio valor a atributo ");
        System.out.println("Clse 1 = " + clase1.getAtributoDefault());
        

    }
}
