package com.jp.git.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/index")
public class Index {
	
	@GetMapping("/saludo")
	public ResponseEntity<String> saludo (){
		return ResponseEntity.ok("Hola desde microservicio");
	}
	
	@GetMapping("/saludoCuatro")
	public ResponseEntity<String> saludoCuatro(){
		return ResponseEntity.ok("Hola desde microservicio cuatro");
	}
}
