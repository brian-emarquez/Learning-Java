
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
public class palidromos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PALINDROMOS AL REVES SE LEE IGUAL
        String texto = JOptionPane.showInputDialog("Escribe un palindromo");
        int longitud = texto.length(); // tomamos su tamaño
        char [] letras = new char[longitud]; //arreglo
        char [] letrasInv = new char[longitud]; //arreglo   
        int inverso = longitud;
        boolean igual= true;
        
        for (int i=0 ; i<longitud; i++){
            letrasInv[i] = texto.toLowerCase().charAt(inverso-1);
            inverso--;
            letras[i]=texto.toLowerCase().charAt(i);
            if (letrasInv[i] != letras[i]){
                igual= false;
                break;
            }            
        } 
        if(igual== false){
            System.err.println(texto+ " No es palindromo");
        }  else{
        System.err.println(texto+ " Si es palindromo");
        }    
    }
}
