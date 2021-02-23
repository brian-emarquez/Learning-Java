/*
 * Variables II Datos de Envoltorio
 */
package com.mycompany.variables_ii_datos_envoltorio;

/**
 *
 * @author brian
 */
public class envoltorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Cambiamos la primera letra a mayuscuala*/
        /*Envoltorios*/
        
        Byte mordida;
        mordida = (byte)126.55;
        System.out.println("Mordida="+ mordida);
        
        short corto;
        corto = 32000;
        System.out.println("Corto="+ corto);
        
        Integer entero;
        entero = 33000;
        System.out.println("Entero="+ entero);
        
        Long largo;
        largo = (long)3000;
        System.out.println("largo ="+ largo);
        
        float flotante;
        flotante=mordida.floatValue();
        //flotante = 33000.50f;
        System.out.println("Flotante="+ flotante);
        
        Double doublee;
        doublee = 33000.55;
        System.out.println("Double="+ doublee);
        
        // en el char no se requiere
        char caracter;
        caracter = 'b';
        System.out.println("char="+caracter);
        
        Boolean booleano;
        booleano = true;
        System.err.println("Bolleano = " + booleano);
        
        String cadena;
        cadena = "Brian";
        System.err.println("Cadena = " + cadena);

   
        
    }
    
}
