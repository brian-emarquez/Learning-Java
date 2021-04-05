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
    private int contador;
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Brian");
        Persona persona2 = new Persona("Carla");
        
        imprimir(persona1);
        imprimir(persona2);
    }
    
    //static public  void imprimir(Persona persona //lo mismo
    public static void imprimir(Persona persona){ // tiene que se statico para llamar a la funcion imprimir
        System.out.println("persona = " + persona);   
                 
    }  
    public int getContador(){  // con este metodo tenermos acceso
        imprimir(new Persona("color"));
        return this.contador = 10;
    }   
}
