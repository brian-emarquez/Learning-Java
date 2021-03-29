/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporvalor;

/**
 *
 * @author brian
 */
public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);
        
        cambioValor(x);
        System.out.println("text: x = " + x );
    }
    public static void cambioValor(int arg1){
        // se pasa un capio de argumento x hacia arg1
        System.out.println("arg1 = " + arg1); 
        arg1 = 15;
    
    }
}
