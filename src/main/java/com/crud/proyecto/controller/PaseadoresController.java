package com.crud.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.proyecto.dto.Paseadores;
import com.crud.proyecto.service.PaseadoresService;

@RestController
@RequestMapping("/api/paseadores/")
public class PaseadoresController {

	@Autowired
	PaseadoresService paseadoresService;
	
	@GetMapping("/listaPaseadores")
	public ResponseEntity<?> listPaseadores() throws Exception{
		return new ResponseEntity(paseadoresService.listaPaseadores(), HttpStatus.OK);
	}																						
	
}
