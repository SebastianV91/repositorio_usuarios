package com.crud.proyecto.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crud.proyecto.dto.Mascota;
import com.crud.proyecto.repository.MascotaRepository;

@Service
public class MascotaService extends MascotaRepository{

	public Map<String, Object> insertMascota (Mascota mascota) throws Exception{
		
		Map <String, Object> response = new HashMap<String, Object>();
		
		if(insertMascotaRepository(mascota) == 1) {
			response.put("mensaje", "Mascota registrada exitosamente");
		}
		
		return response;
		
	}
	
}
