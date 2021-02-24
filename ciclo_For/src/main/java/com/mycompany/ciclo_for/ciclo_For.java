/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ciclo_for;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class ciclo_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ciclo_For
        /*for(int i = 1; i<=10; i++){
            System.out.println(i);
        }*/
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un numero para el For");
        int repeticiones = entrada.nextInt();
            for(int i = 1; i<=repeticiones; i++){
            System.out.println(i);
            }
    }   
}
