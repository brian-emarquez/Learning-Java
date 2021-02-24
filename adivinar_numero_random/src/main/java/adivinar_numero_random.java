
import java.util.Random;
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
public class adivinar_numero_random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        String texto=JOptionPane.showInputDialog("Humano dame la altura de tu pinche escalera");
        int altura=Integer.parseInt(texto);
        for(int numAsterisco=1;numAsterisco<=altura;numAsterisco++){
            for(int i=0;i<numAsterisco;i++){
                System.out.print("*");
        Random rand=new Random();
        int aleatorio=rand.nextInt(5)+1;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Humano que numero estoy pensado (entre 1 y 5) dijita 0 para salir"));
        while(num!= aleatorio){
            num = Integer.parseInt(JOptionPane.showInputDialog("Humano estupdo te equivocaste en que numero estoy pensado (entre 1 y 5) dijita 0 para salir"));
            if(num==0){
                break;
            }
            System.out.println("");
            aleatorio=rand.nextInt(5)+1;
        }
        if(num!=0){
            JOptionPane.showMessageDialog(null, "Bien jugado humano");
        }
        else{
            JOptionPane.showMessageDialog(null, "Huamno estupido el numero era "+aleatorio);
        }
    }
        
}
