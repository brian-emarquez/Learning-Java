/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ingresardatosviashowinputdialog;
import javax.swing.JOptionPane;

/**
 *
 * @author brian
 */
public class ingresardatosviashowInputDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*STRING*/
        String cadena=JOptionPane.showInputDialog("Inserta un cadena");
        JOptionPane.showMessageDialog(null, "Esto es una cadena: " + cadena);
        
        /*Enteros*/
        int entero= Integer.parseInt(JOptionPane.showInputDialog("Inserta un entero"));
        JOptionPane.showMessageDialog(null, "Esto es una cadena: " + entero);
        
        float flotante = Float.parseFloat(JOptionPane.showInputDialog("Inserta un entero"));
        JOptionPane.showMessageDialog(null, "Esto es una cadena: " + flotante);
        
    }
    
}
