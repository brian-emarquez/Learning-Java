/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author brian
 */
public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1,2);
        variosParamentros("Juan", 8, 9 , 10 );
    }
    
    private static void variosParamentros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
    /*Argumetos variasbles*/
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++){
            System.out.println("elementos: " + numeros[i]);
        }
    }
    
}
