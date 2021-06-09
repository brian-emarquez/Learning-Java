package com.example.demo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* Anotaciones */
@Data @AllArgsConstructor @NoArgsConstructor

public class Persona {
	
	private String Dni;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;

}
