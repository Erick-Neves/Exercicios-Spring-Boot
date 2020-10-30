package com.helloworld.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*Importa a API REST*/
@RestController

/*Requisita o caminho no POSTMAN*/
@RequestMapping("/hello")
public class HelloController {
	/*Envia o caminho para o POSTMAN*/
	@GetMapping
	public String hello()
	{
		return "Meus objetivos de aprendizagem essa semana, foi entender como funciona SQL com banco de dados.";
	}
}
