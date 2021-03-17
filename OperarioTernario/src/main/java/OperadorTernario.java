/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brian
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Operador Ternario
        // Primero se declaro la respuesta correcta 
        var resultado = (3 > 2) ? "Verdadero" : "Falso";
        System.out.println("resultado = " + resultado);
        
        var numero = 8;
        resultado = (numero %2 ==0) ? "numero par" : "numero impar";
        System.out.println("resultado = " + resultado);
        
    }
    
}
