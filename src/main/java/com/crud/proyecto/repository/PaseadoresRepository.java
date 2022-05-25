package com.crud.proyecto.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.crud.proyecto.dto.Paseadores;



@Component
public class PaseadoresRepository {

	@Autowired
	@Qualifier("jdbcMaster")
	private JdbcTemplate jdbcTemplate;

	public Map<String, Object> getPaseadoresRepository() throws Exception{
		
		Map<String, Object> respuesta = new HashMap<>();
		List<Paseadores> listPaseadores = new ArrayList<>();
		
		String sql = "SELECT  "
				+ " NOMBRE, APELLIDO, EDAD, TELEFONO, CASE WHEN (ESTADO=0 )  THEN 'NO DISPONIBLE' ELSE 'DISPONIBLE' END as ESTADO  "
				+ " FROM PASEADORES ";
		
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		
		if(rows != null) {
			for (Map<String, Object> row : rows) {
				Paseadores paseador = new Paseadores();
				paseador.setNombre((String) row.get("NOMBRE"));
				paseador.setApellido((String) row.get("APELLIDO"));
				paseador.setEdad((Integer) row.get("EDAD"));
				paseador.setTelefono((String) row.get("TELEFONO"));
				paseador.setEstado((String) row.get("ESTADO"));
				listPaseadores.add(paseador);
			}
			respuesta.put("paseadores", listPaseadores);
		}
		
		return respuesta;
		
	}																															
	
	
	
}
