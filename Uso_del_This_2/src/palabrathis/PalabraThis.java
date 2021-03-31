/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrathis;

/**
 *
 * @author brian
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("juan", "Perez");
        //System.out.println("persona = " + persona);
        System.out.println("persona Nombre = " + persona.nombre);
        System.out.println("persona Apellido = " + persona.apellido);          
    } 
}

class Persona{
    String nombre; // default o packege
    String apellido;
    
    //cosntructor
    Persona(String nombre, String apellido){
        //super(); // llamada al contructor de la clase padre
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this = " + this);
        //Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this); // simplificado
        
    }
}

class Imprimir{
    public void imprimir (Persona persona){
        System.out.println("Persona desde imprimir Persona = " + persona);
        System.out.println("Persona desde imprimir this = " + this);
    }
}