
import java.util.Scanner;

/*
 * condicionales_anidadas
 */

/**
 *
 * @author brian
 */
public class condicionales_anidadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // condicionales_anidadas
        Scanner entra = new Scanner (System.in);
        System.out.println("Escribe un numero de 1 y 999 ");
        int num = entra.nextInt();
        if(num>0 && num <10) {
            System.out.println("el numero es de unidad ");
        }else{
            if(num>=10 && num<100){
            System.out.println("El numero es una decena ");
            }else{
                if(num>=100 && num<1000){
                System.out.println("el numero es de unidad de cientos");
                }
            }
        }
    } 
}
