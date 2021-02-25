/*
 * Constantes
 */
package com.mycompany.contantes;

/**
 *
 * @author brian
 */
public class contantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // volverlo estatico con el prefijo "Final", ya no sepuede modificar
        final Byte mordida;
        mordida = (byte)126.34;
        System.out.println("Mordida="+ mordida);
        
        // 
        final float PI=3.1415f;
        System.out.println("PI="+ PI);
        
        float res=PI*2;
        System.out.println(res);
    }
}
