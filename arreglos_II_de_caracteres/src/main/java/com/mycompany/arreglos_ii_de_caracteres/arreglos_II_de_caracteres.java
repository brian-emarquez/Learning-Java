/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arreglos_ii_de_caracteres;

import javax.swing.JOptionPane;

/**
 *
 * @author brian
 */
public class arreglos_II_de_caracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // arreglos_II_de_caracteres
        String texto = JOptionPane.showInputDialog("Ingresa un texto: "); // Ingrese por pantalla
        int longitud = texto.length(); // tamaño de texto
        char []caracteres = new char [longitud]; // cadenas
        int inverso=longitud;
        
        for(int i=0; i<longitud; i++)
        {
            caracteres[i] = texto.charAt(inverso-1);
            inverso--;
        }
        System.out.println(caracteres);
    }  
    
}
