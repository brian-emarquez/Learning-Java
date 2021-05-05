package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);

        Gerente gerente = new Gerente("Karla", 10000, "Contabilidad");

    }

    /*Concepto de polimorfismo*/
    public static void determinarTipo(Empleado empleado) {
        /*instanceOf usando usualmene para preguntar*/
        //la clases hija esta apunta a un objeto en memoria de tipo gerente
        if (empleado instanceof Gerente) {
             System.out.println("empleado = " + empleado);
        }
    }

}
