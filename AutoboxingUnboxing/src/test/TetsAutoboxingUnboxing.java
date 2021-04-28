/*
 *clase Wrapper o Envolvente
 */
package test;


public class TetsAutoboxingUnboxing {
    public static void main(String[] args) {
        // Clases Envolventes de tipos primitivos
        /*
        int Integer
        Log - Long
        float - Float
        double - Double
        */
        /*Autoboxing*/
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero Double= " + entero.doubleValue());
    
        /*Unboxing*/
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
        
    }
    
    
}
