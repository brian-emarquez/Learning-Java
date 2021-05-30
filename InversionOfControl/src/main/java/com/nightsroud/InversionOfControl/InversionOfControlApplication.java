package com.nightsroud.InversionOfControl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InversionOfControlApplication {

	public static void main(String[] args) {
		
		//SpringApplication.run(InversionOfControlApplication.class, args);
		//JefeEmpleado Empleado1=new JefeEmpleado();
		
		//Empleados Empleado1 = new JefeEmpleado();
		//Empleados Empleado1 = new SecretarioEmpleado();
		Empleados Empleado1 = new DirectorEmpleado();
		System.out.println(Empleado1.getTareas());
	}

}
