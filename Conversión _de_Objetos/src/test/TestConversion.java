package test;

import domain.*;

public class TestConversion {

    public static void main(String[] args) {
        Empleado empleado;

        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
//      System.out.println("empleado = " + empleado);
        System.out.print(empleado.obtenerDetalles());
        
        /* Downcasting*/
//        ((Escritor)empleado).getTipoEscritura();
        
        Escritor escritor = (Escritor)empleado;
        escritor.getTipoEscritura();
        
        Empleado empleado2 = escritor;
//        empleado2.obtenerDetalles();
    }
}
