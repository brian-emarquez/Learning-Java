/* Set en java*/
package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        /*List : con orden*/
        List miLista = new ArrayList();
        miLista.add("Luness");
        miLista.add("Martess");
        miLista.add("Miercoless");
        miLista.add("Juevess");
        miLista.add("Vierness");
//        imprimir(miLista);

        /* Set: sin orden, sin duplicados*/
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        imprimir(miSet);
    }

    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }

}
