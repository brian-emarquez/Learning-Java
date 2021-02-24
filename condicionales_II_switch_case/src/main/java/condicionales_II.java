
import java.util.Scanner;

/*
 * Condicioales II Swich Case
 */

/**
 *
 * @author brian
 */
public class condicionales_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Condicioanles II
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Sleccione una Opcion: \n1: Acceso\n2: Confguracion\n3: Ayuda");
        int seleccione = entrada.nextInt();
        switch(seleccione){
            case 1: System.out.println("Seleccionaleste el Acceso");
            break;
            
            case 2: System.out.println("Seleccionaleste Configuracion");
            break;
            
            case 3: System.out.println("Seleccionaleste Ayuda");
            break;
            
            default:
            System.out.println("Opcion no Valida"); 
            break;
        }
    }
}
