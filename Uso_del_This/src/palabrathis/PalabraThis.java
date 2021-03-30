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
        Persona persona = new Persona("juan", "Perez"); // almacena en el pull stream
        //System.out.println("persona = " + persona);
        System.out.println("persona (nombre) = " + persona.nombre);
        System.out.println("persona (apellido )= " + persona.apellido);
    }
    
}
class Persona{
    // atributos por default
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){ // constructor
        this.nombre = nombre;
        this.apellido = apellido;
    
    }

}