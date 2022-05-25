package com.crud.proyecto.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.crud.proyecto.dto.Paseadores;
import com.crud.proyecto.repository.PaseadoresRepository;

@Service
public class PaseadoresService extends PaseadoresRepository{

	public Map<String, Object> listaPaseadores() throws Exception{
		return getPaseadoresRepository();
	}																	

}
