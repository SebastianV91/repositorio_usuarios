package com.crud.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.proyecto.dto.Mascota;
import com.crud.proyecto.service.MascotaService;

@RestController
@RequestMapping("/api/mascota/")
public class MascotaController {
	
	@Autowired
	MascotaService mascotaService;
	
	@PostMapping("/guardarMascota")
	public ResponseEntity<?> registrarMascota(@RequestBody Mascota mascota) throws Exception{
		
		return new ResponseEntity(mascotaService.insertMascota(mascota), HttpStatus.CREATED);
		
	}
	
}
