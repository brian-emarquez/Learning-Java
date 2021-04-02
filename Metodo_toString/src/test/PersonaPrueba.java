/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import dominio.Persona;

/**
 *
 * @author brian
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Brian", 5000.00, false);
        // System.out.println("persona1 inicial = " + persona1.getNombre());
        System.out.println("persona1 = " + persona1.toString());
        persona1.setNombre("Brian Marquez");
        
        // persona1.setNombre("BrianE");
        // System.out.println("persona1 = " + persona1.nombre); // no se puede 
        // System.out.println("persona1 cambiado= " + persona1.getNombre());
        System.out.println("persona1 = " + persona1.toString());
    }   
}
