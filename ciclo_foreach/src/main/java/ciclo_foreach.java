/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brian
 */
public class ciclo_foreach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ciclo_forech
        
        String [] animales = {"monte", "carlos", "solodino", "chemielo", "Maria", "chiquito"};
        for(int i=0; i<animales.length; i++){
            System.out.println((i+1)+"="+animales[i]);
        }
        
         System.out.println("========================");
        /*forech*/
        for(String animal: animales){
            System.err.println(animal);
        }
        
    }
    
}
