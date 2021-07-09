package com.example.HolaMundoThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorInicio {
	
	@GetMapping("/")
	public String inicio(){
		//log.info("Ejecutando el controlador Spring MVC");
		return "index";	
	} 
}
