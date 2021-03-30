/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "juan";
        System.out.println("persona nombre: " + persona1.nombre);
        
        cambiarValor(persona1);
        System.out.println("persona cambio de nombre: " + persona1.nombre);
    }       
    public static void cambiarValor(Persona persona){
        persona.nombre = "Karla";
        
    
    }
     
}   
