/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.busqueda_secuencial;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class busquedaSecuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Busqueda Secuencial
        // 5 10 15 58 20 56 65 
        
        Scanner entra = new Scanner(System.in);
        int elemento[] = new int[7];
        System.out.println("Ingresa 7 numeros: ");
        for (int i= 0; i<7; i++){
            elemento[i] = entra.nextInt();
        }
        
        System.out.println("Ingresa un numero para Buscar");
        int numBuscar = entra.nextInt();
        
        int i=0;
        boolean bandera=false;
        while(i<7 && bandera ==false){
            if(numBuscar==elemento[i]){
                bandera=true;
            }
            i++;
        }  
        if(bandera == true){
            System.out.println("Ttu numero es en la posicicon " +i);
        }else{
            System.out.println("No se encontro el numero");
        }
    }
}
