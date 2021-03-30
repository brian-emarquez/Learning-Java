/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        //Persona persona1 = new Persona();
        Persona persona1 = null;
//        persona1.nombre = "juan";
//        System.out.println("persona nombre: " + persona1.nombre);
        
        persona1 = cambiarValor(persona1);
//        System.out.println("persona cambio de nombre: " + persona1.nombre);
    }       
    public static Persona cambiarValor(Persona persona){
        //persona.nombre = "Karla";
        if (persona == null){  
            System.out.println("VALOR DE PERSONA INVALIDO: null");
            return null;         
        }
        return persona;
    }
}   
