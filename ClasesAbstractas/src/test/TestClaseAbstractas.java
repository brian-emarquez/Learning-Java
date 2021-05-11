
package test;

import domain.*;

public class TestClaseAbstractas {
    public static void main(String[] args) {
        /* no se puede crear objetos de la clase padre */
        
        FiguraGeometrica figura = new Rectangulo ("Rectangulo");
        figura.dibujar();
    }
}
