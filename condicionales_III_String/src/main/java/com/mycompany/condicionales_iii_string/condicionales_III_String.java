/*
 * condicionales_III_String
 */
package com.mycompany.condicionales_iii_string;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class condicionales_III_String {

    /**
     * @param args the command line arguments
     * char = Line
     */
    public static void main(String[] args) {
        // condicionales_III_String
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba una opcion:\nacceso\nconfguracion\nayuda");
        String seleccione = entrada.nextLine();
        seleccione = seleccione.toLowerCase();
        switch(seleccione){
            case "acceso" :
                   System.out.println("Seleccionaleste el acceso");
            break;
            
            case "confguracion" :
                System.out.println("Seleccionaleste configuracion");
            break;
            
            case "ayuda":
                System.out.println("Seleccionaleste ayuda");
            break;
            
            default:
            System.out.println("Opcion no Valida"); 
            break;
        }
        
    }
    
}
