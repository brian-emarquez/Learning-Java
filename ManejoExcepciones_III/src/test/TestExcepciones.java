/* manejo de errores */
package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionException;
import javax.management.openmbean.OpenDataException;

public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;

        try {
            resultado = division(10, 0);  
        }catch (OperacionException e) {
            System.out.println("Ocurrió un error de tipo OperacionException: ");
            System.out.print(e.getMessage());
        }catch (Exception e) {
            System.out.println("Ocurrió un error de tipo Exception: ");
            System.out.print(e.getMessage());
        }finally {
            /* siempre se ejecutara este bloque de codigo*/
            System.out.println("SE REVISO LA DIVICION");
        }

        System.out.println("resultado = " + resultado);
    }
}
