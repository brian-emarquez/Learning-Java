package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        empleado = new Gerente("Karla", 1000, "Contabilidad");
        determinarTipo(empleado);
    }

    /*Concepto de polimorfismo*/
    public static void determinarTipo(Empleado empleado) {

        if (empleado instanceof Gerente) {
            // ¿ a empleado = new Empleado? fañso apunta a gerente

            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente) empleado;//conversion
//            gerente.getDepartamento();
            System.out.println("gerente = " + gerente.getDepartamento());

        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
}
