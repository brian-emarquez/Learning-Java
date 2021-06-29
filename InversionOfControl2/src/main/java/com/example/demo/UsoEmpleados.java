package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		// Creacion de objetos de tiepo Empleado
		Empleados Empleado1 = new JefeEmpleado();
		//Empleados Empleado1 = new SecretarioEmpleado();
		//Empleados Empleado1 = new DirectorEmpleado();

		
		// Uso de lo objetos creados
		System.out.print(Empleado1.getTareas());
		
	}
}
