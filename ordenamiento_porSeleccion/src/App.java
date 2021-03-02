import java.util.Scanner;

import javax.swing.text.Position;

/* Ordenamiento por seleccion */

public class App {
    public static void main(String[] args) {
        // 5, 4, 2, 1, 3

        Scanner entra = new Scanner(System.in);
        int elementos[] = new int[5], menor, pos, tem;
        System.out.println("Escrbe los numero par ordenar: ");
        for (int i= 0; i<5; i++){
            elementos[i] = entra.nextInt();
        }

        for(int i=0; i<elementos.length-1; i++){
            menor = elementos[i];
            pos = i;
            for(int j=i+1; j<elementos.length; j++){
                if(elementos[j] < menor){
                    menor = elementos[j];
                    pos = j;
                }
            }

            if(pos != i){
                tem = elementos[i];
                elementos [i] = elementos [pos];
                elementos [pos]  = tem;
            }
        }

        System.out.println("los elementos ordenas son: ");
        for(int i=0; i<elementos.length; i++){
            System.out.print(elementos[i] + ",");
        }
    }
}

