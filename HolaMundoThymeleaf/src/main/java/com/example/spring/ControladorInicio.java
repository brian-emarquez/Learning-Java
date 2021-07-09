package com.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorInicio {
	
	@GetMapping("/")
	public String inicio() {
		//log.info("ejecutando el controlador Spring MVC");
		return "index";
	}
}