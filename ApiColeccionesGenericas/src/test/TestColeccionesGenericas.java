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
//        System.out.println("elemento = " + elemento);
//        imprimir(miLista);
        
        /* Set: sin orden, sin duplicados*/
        Set<String> miSet = new HashSet<>(); /* se convirtio a tipo generico*/
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
//        imprimir(miSet);

        Map <String, String> miMapa = new HashMap<>();
        miMapa.put("Valor1", "Brian");
        miMapa.put("Valor2", "Maria");
        miMapa.put("Valor3", "Rosario");
        
        String elementoMapa = miMapa.get("Valor1");
//        System.out.println("elementoMapa = " + elementoMapa);

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection<String> coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }

}
