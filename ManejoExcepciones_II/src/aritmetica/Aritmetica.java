package aritmetica;

import javax.management.OperationsException;

public class Aritmetica {
    public static int division(int numerador, int denominador) throws OperationsException{
        
        if(denominador == 0){
            /* Arrojar excepcion */
            throw new OperationsException("Divison entre Cero");
        }
        return numerador / denominador;
    }
}
