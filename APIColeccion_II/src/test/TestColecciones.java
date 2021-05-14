/* Set en java*/

package test;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        /*creamos eñl objeto*/
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        
        /*usando la funcion lambda o ciclo forearch*/
        miLista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
        
        /* Set*/
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        
    }
    
}
