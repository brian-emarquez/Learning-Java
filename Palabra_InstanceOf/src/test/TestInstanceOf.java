package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado);     
//        Gerente gerente = new Gerente("Karla", 10000, "Contabilidad");

    }

    /*Concepto de polimorfismo*/
    public static void determinarTipo(Empleado empleado) {
        /*instanceOf usando usualmene para preguntar*/
        //la clases hija esta apunta a un objeto en memoria de tipo gerente
        if (empleado instanceof Gerente) {
            // ¿ a empleado = new Empleado? fañso apunta a gerente
            System.out.println("Es de tipo Gerente" + empleado);
        }else if(empleado instanceof Empleado){
            System.out.println("Es de tipo empleado");
        }else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
}
