
import java.util.Scanner;

/*
 * Secuencias Logicas.
 * ciclo_While
 */

/**
 *
 * @author brian
 */
public class ciclo_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ciclo_While simple
        
        /*int i=1;
        while (i<=10){
        System.out.println(i);
        i+=1;
        }
        */
        
        /* Ingreso por teclado */ 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = entrada.nextInt();
        int i=1;
        while(i<=numero){
            System.out.println("i="+i);
            i++;
        }
    }
    
}
