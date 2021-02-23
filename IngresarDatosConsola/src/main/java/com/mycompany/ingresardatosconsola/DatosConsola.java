/*
 * Ingreso de datos pro consola
 */
package com.mycompany.ingresardatosconsola;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class DatosConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        //Ingreso de datos por teclado consola
        /*Scanner entrada = new Scanner(System.in);
                
        int valor;
        System.out.println("Ingresa el valor: ");
        valor = entrada.nextInt();
        System.out.println("tu numero es: " + valor);*/
        
        /* Cadenas */
        Scanner entrada = new Scanner(System.in);
        String cadena;
        System.out.println("Escriba una Cadena: ");
        cadena = entrada.next();
        System.out.println("la cadena es: " + cadena);
    }
}
