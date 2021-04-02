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
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Brian");
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona("Carla");
        System.out.println("persona2 = " + persona2);

        
    }
}
