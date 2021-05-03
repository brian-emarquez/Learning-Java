package test;

import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        System.out.println("empeado = " + empleado.obtenerDetalles());
    }
}
