/*
 * Operadores Matematicos
 */
package com.mycompany.operadoresmatematicos;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class operadoresMatematicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Operadores Matematicos
        Scanner entra = new Scanner(System.in);
        float num1, num2, suma, resta, mult, div, residuo;
        System.out.println("Ingresa 2 Numeros: ");
        num1=entra.nextFloat();
        num2=entra.nextFloat();
        suma= num1+ num2;
        resta= num1- num2;
        mult= num1* num2;
        div= num1/ num2;
        residuo = num1% num2;
        
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La Multiplicacion es: "+ mult);
        System.out.println("La Division es: "+ div);
        System.out.println("El residuo es: "+ residuo);

    }
    
}
