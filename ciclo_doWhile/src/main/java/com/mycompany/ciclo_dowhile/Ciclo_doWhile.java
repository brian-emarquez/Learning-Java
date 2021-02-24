/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ciclo_dowhile;

import java.util.Random;

/**
 *
 * @author brian
 */
public class Ciclo_doWhile {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // Ciclo con Do While
        
        /*int i=1;
        do{
        System.out.println(i);
        i+=1;
        }          
        while (i<=10);*/
        
        Random rand = new Random();
        int aleatorio = rand.nextInt(10);
        System.out.println("Aleatorio" + aleatorio);
        int i = 1;
        do{
            System.out.println("i="+i);
            i+=1;
        }while (i<= aleatorio);
  
    } 
}
