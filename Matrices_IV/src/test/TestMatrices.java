/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Persona;

/**
 *
 * @author brian
 */
public class TestMatrices {
    public static void main(String[] args) {
        int edades [][] = new int [3][2];
        System.out.println("edades = " + edades);
        
        edades [0][0] = 5;
        edades [0][1] = 7;
        edades [1][0] = 8;
        edades [1][1] = 4;

        for (int ren = 0; ren < edades.length; ren++) {
               for (int col = 0; col < edades[ren].length; col++) {
                   System.out.println("edades = " + ren + "-" + col + ": " + edades[ren][col]);             
            }
        }     
        
        System.out.println("_______________________________________________");
        String frutas [][] = {{"Naranja, limon"},{"freasa", "Zarzamora"}};
        imprimir(frutas);
        
        Persona personas[][] = new Persona[2][3];/*al igual que lo arreglos se recomienda que sean en plural*/
        personas [0][0] = new Persona("Juan");
        personas [0][1] = new Persona("Karla");
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]){
        
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("frutas " + ren + "-" + col + ": " + matriz[ren][col]);
            }
        }
    }
}
