/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Persona;

/**
 *
 * @author brian
 */
public class TestFinal {
    public static void main(String[] args) {
        final int miVARIABLE = 10; /*ya no se podra modifical la variable, equivalente a una constante*/
        System.out.println("miVARIABLE = " + miVARIABLE);
        //miVariable = 20;
        
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona();
        persona1.setNombre("juan");
        System.out.println("persona1 = " + persona1.getNombre());
        
    }
    
}
