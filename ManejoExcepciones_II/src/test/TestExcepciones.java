/* manejo de errores */
package test;

<<<<<<< HEAD
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = 10/0;
        }catch(Exception e){
            System.out.println("Ocurrió un error: ");
            e.printStackTrace(System.out);
=======
import static aritmetica.Aritmetica.division;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        
        try{
            resultado = division(10,0 );
        }catch(Exception e){
           System.out.println("Ocurrió un error: ");
           e.printStackTrace(System.out);
//            System.out.print(e.getMessage());
>>>>>>> 7b709032fef2fd01f5829b41007a9b007814cd69
        }    
        System.out.println("resultado = " + resultado);
    }
}

