
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
public class ordenamiento_burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ordenamiento_burbuja
        // 5.4.2.1.3
        String texto=JOptionPane.showInputDialog("Ingresa Numeros");
        String numerosEnTexto[]=texto.split(",");
        int cantidad=numerosEnTexto.length;
        int numeros[]= new int[cantidad], temp;
        for(int i=0;i<cantidad;i++){
            numeros[i]=Integer.parseInt( numerosEnTexto[i]);
        }
        for(int i=0; i<cantidad; i++){
            for(int j=0; j<cantidad; i++){
                if (numeros[j] > numeros[j+1]){
                    temp = numeros[j] ;
                    numeros[j] = numeros[j+1];
                    numeros[j]= ]temp;
                        
                }
            }
        }
        
    }
    
}
