package test;

import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
//        System.out.println("empeado = " + empleado.obtenerDetalles());
        imprimir(empleado);

        Gerente gerente = new Gerente("Karla", 10000, "Contabilidad");
//        System.out.println("empleado = " + gerente.obtenerDetalles());

        imprimir(gerente);
    }
    
    /*Concepto de polimorfismo*/
    public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
    
}
