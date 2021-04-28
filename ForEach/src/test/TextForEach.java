/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Persona;

/**
 *
 * no se puede usar var con arreglos
 */
public class TextForEach {
    public static void main(String[] args) {
        int edades[] = {5,6,8,9};
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        Persona personas[] = {new Persona("Brian"), new Persona("Maria"), new Persona("Liebre")};
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
}
