/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos_iii;

/**
 *
 * @author brian
 */
public class Arreglos_III {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edades[] = new int [3];
        System.out.println("edades = " + edades);
        
        edades[0] = 10;
        System.out.println("edades o  = " + edades[0] );
        
        for (int i = 0; i<edades.length; i++){
            System.out.println("edades elemento" + i + ":" + edades[i]);
        }
       
    }
    
}
