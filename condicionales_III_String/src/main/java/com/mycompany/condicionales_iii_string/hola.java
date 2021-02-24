package com.mycompany.condicionales_iii_string;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brian
 */
public class hola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entra = new Scanner(System.in);
        
        System.out.println("Saludamen por favor");
        String respuesta = entra.next();
        respuesta = respuesta.toLowerCase();
        if(respuesta.equals("hola") ==true){
            System.out.println("¿Como estas?");
        }else{
            System.out.println("No te entiendo");
        }
                
    }
    
}
