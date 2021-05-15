/* Map en java*/
package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        /*List : con orden*/
        List <String> miLista = new ArrayList<>();
        miLista.add("Luness");
        miLista.add("Martess");
        miLista.add("Miercoless");
        miLista.add("Juevess");
        miLista.add("Vierness");
        String elemento = miLista.get(1);
        System.out.println("elemento = " + elemento);
        
        imprimir(miLista);
        

        /* Set: sin orden, sin duplicados*/
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
//        imprimir(miSet);

        Map miMapa = new HashMap();
        miMapa.put("Valor1", "Brian");
        miMapa.put("Valor2", "Maria");
        miMapa.put("Valor3", "Rosario");
        
//        String elemento = (String) miMapa.get("Valor1");
//        System.out.println("elemento = " + elemento);
//        
//        imprimir(miMapa.keySet());
       
    }

    public static void imprimir(Collection<String> coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }

}
