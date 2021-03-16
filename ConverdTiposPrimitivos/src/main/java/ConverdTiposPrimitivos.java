
import java.util.Scanner;

/*
 Conversión de Tipos Primitivos
 */

/**
 *
 * @author brian
 */
public class ConverdTiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Conversión de Tipos Primitivos
        
        var edad = Integer.parseInt("20"); //covierte a numero entero
        System.out.println("edad = " + (edad + 1));
        
        var valorPI = Double.parseDouble("3.141516");
         System.out.println("valorPI = " + valorPI);
         
         //pedir un valor
        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad:");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
         
    }
}
