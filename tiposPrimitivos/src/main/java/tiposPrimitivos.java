/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brian
 */
public class tiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tipos Primitivos
        byte numeroByte = (byte)129;
        System.out.println("Valor minimo byte:" + Byte.MIN_VALUE);
        System.out.println("Valor minimo byte:" + Byte.MAX_VALUE);
        
        short numeroShor = (short)32768;
        System.out.println("Valor minimo byte:" + Short.MIN_VALUE);
        System.out.println("Valor minimo byte:" + Short.MAX_VALUE);
        
        int numeroInt = (int)214748368L;
        System.out.println("Valor minimo byte:" + Integer.MIN_VALUE);
        System.out.println("Valor minimo byte:" + Integer.MAX_VALUE);
        
        long numeroLong = (long)914564565465460L;
        System.out.println("Valor minimo byte:" + Long.MIN_VALUE);
        System.out.println("Valor minimo byte:" + Long.MAX_VALUE);
    }
    
}
