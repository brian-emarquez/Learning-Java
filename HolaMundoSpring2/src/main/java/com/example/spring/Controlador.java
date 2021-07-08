package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class Controlador {
	
	@GetMapping("/")
	public String inicio() {
		log.info("Ejecutamos el controlador rest"); // Mensage en el servidor  - Consola
		return "Hola Mundo con Spring Boot";
	}
}
