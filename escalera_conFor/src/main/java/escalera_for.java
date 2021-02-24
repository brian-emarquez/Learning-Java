
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brian
 */
public class escalera_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("escalera"); //Interfas grafica
        int altura=Integer.parseInt(texto);
        for(int numAsterisco=1; numAsterisco<=altura; numAsterisco++){
            
            for(int i=0;i<numAsterisco;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }  
}
