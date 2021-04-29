/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import paquete1.Clase1;
import paquete2.ClaseHija;

/**
 *
 * @author brian
 */
public class TestModificadoresAcceso {
    public static void main(String[] args) {
//        Clase1 clase1 = new Clase1("public");
        /* no se puede acceder al atributo progido*/
        //System.out.println("clase1 = " + clase1.atributoPublico);
        //clase1.metodopublico();  
        
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);
    }
}
