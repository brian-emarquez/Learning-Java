package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brian
 */
public class testHerencia {
    public static void main(String[] args) {
//        Empleado empleado1 = new Empleado("Brian", 5000.0);
//        System.out.println("empleado = " + empleado1); 

    var fecha = new Date();
    Cliente cliente1 = new Cliente(fecha, true, "Brian", 'M', 27, "Calle 23");
    System.out.println("cliente1 = " + cliente1);

    }
}
