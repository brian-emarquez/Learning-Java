
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brian
 */
public class busquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Busqueda Binaria
        // 5 10 15 30 50 70 90 95
        Scanner entra = new Scanner(System.in);
        int elementos[] = new int[8], menor, pos, tem;
        System.out.println("Escrbe 8 numeros: ");
        for (int i= 0; i<8; i++){
            elementos[i] = entra.nextInt();
        }
        System.err.println("Ingresa un Numero para saber su posicion: ");
        int numBuscar= entra.nextInt();
        
        int n = elementos.length, inf=0, centro=0;
        int sup=n-1;
        boolean bandera = false;
        while(inf<=sup){
            centro=(sup+inf)/2;
            if(elementos [centro] == numBuscar){
                bandera = true;
            break;
            }
            else if (numBuscar < elementos[centro]){
                    sup=centro-1;           
            }
             else{
                inf= centro +1;
            }
        }
        if (bandera == true) {
        System.out.print(" Se encontro tu numero:" +(centro+1));
       
        }else{
            System.out.print(" No se encontro tu numero");
        }
    }
}
