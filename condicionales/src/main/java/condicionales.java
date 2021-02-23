
import java.util.Scanner;

/*
 * condicionales (Sentencia IF, Else)
 */

/**
 *
 * @author brian
 */
public class condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // condicionales (Sentencia IF, Else)
        Scanner entra= new Scanner(System.in);
        int numUser, numSis;
        numSis = (int) (Math.random()*10);
        System.out.println("Ingresa este numero "+numSis+": ");
        numUser = entra.nextInt();
        
        //se podria usar ==, >=, <=, >, <, !=
        if(numUser == numSis){
            System.out.println("Coinciden ");
        }else{
            System.out.println("no coinciden ");
        }
    }
    
}
