package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner lombokTest() {
		return args ->{
			
			Persona p1 = new Persona();
			p1.setDni("1234567A");
			p1.setNombre("Brian");
			p1.setApellido("Marquez");
			p1.setFechaNacimiento(LocalDate.of(2020, 1, 31));
			
			System.out.println(p1);
		};
	}
}
