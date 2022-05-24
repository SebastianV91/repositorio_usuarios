package com.crud.proyecto.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {
	
	@Autowired
	@Qualifier("jdbcMaster")
	private JdbcTemplate jdbcTemplate;
    
	public  Map<String, Object> getTESTRepository( String entrada) throws Exception  {
		Map<String, Object> respuesta = new HashMap<>();
		
		String sql = "SELECT  "
				+ "'sebastian' AS nombre, 'vergara' AS apellido  "
				+ "FROM DUAL ";

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);				

		if(rows != null) {
			for (Map<String, Object> row : rows) {
				System.out.println("RESPUESTA DB::"+(String) row.get("nombre"));
				respuesta.put("nombre", (String) row.get("nombre"));
				respuesta.put("apellido", "LOCA");
				
			}
		}
		
		return  respuesta;
	}
	
	public  Map<String, Object> getTESTRepositoryParametros( String entrada, String estado) throws Exception  {
		Map<String, Object> respuesta = new HashMap<>();
		
		String sql = "SELECT  "
				+ "'sebastian' AS nombre, 'vergara' AS apellido "
				+ "FROM user "
				+ "WHERE name = ?  and status = ?";

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql,entrada, estado);				

		if(rows != null) {
			for (Map<String, Object> row : rows) {
				System.out.println("RESPUESTA DB::"+(String) row.get("nombre"));
				respuesta.put("nombre", (String) row.get("nombre"));
				respuesta.put("apellido", (String) row.get("apellido"));
				
			}
		}
		
		return  respuesta;
	}
	
}
