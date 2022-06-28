package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivosAprendizagem")

public class ObjetivosAprendizagemController {

	@GetMapping
	public String objetivosAprendizagem() {
		return "Objetivos de aprendizagem semanais:\n"
				+ "1- Collections.\n"
				+ "2- Try and Catch.\n"
				+ "3- Spring Boot.\n"
				+ "4- Usar o Postman.";
	}
}
