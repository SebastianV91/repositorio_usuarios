package com.crud.proyecto.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.crud.proyecto.dto.Mascota;



@Component
public class MascotaRepository {

	@Autowired
	@Qualifier("jdbcMaster")
	private JdbcTemplate jdbcTemplate;
	
	public int insertMascotaRepository(Mascota mascota) throws Exception{
		Map<String, Object> respuesta = new HashMap<>();
		
		String sql = "INSERT INTO MASCOTA "
				+ " (NOMBRE, RAZA, EDAD, DESCRIPCION, GENERO)  "
				+ "VALUES (?, ?, ?, ?, ?) ";
		
		int rows = jdbcTemplate.update(sql, mascota.getNombre(), mascota.getRaza(), mascota.getEdad(), mascota.getDescripcion(), mascota.getGenero());
		
		return rows;
		
	}
	
}
