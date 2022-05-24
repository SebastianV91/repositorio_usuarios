package com.crud.proyecto.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.crud.proyecto.dto.User;

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
				respuesta.put("apellido",(String) row.get("apellido"));
				
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
	
	public  Map<String, Object> insertUserRepository(User user) throws Exception  {
		Map<String, Object> respuesta = new HashMap<>();
		
		String sql = "INSERT INTO USERS "
				+ " (mail, enabled, name, surname, usuario, password)  "
				+ "VALUES (?, ?, ?, ?, ?, ?) ";

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, user.getMail(), user.getEnabled(), user.getName(), user.getSurname(), user.getUsuario(), user.getPassword());				

/*		if(rows != null) {
			for (Map<String, Object> row : rows) {
				System.out.println("RESPUESTA DB::"+(String) row.get("nombre"));
				respuesta.put("mail", user.getEmail());
				respuesta.put("enabled", user.getEnabled());
				respuesta.put("name", user.getName());
				respuesta.put("surname", user.getSurname());
				respuesta.put("usuario", user.getUsuario());
				respuesta.put("password", user.getPassword());
				
			}
		}																	*/
		
		return  respuesta;
	}																		
	
	public  int updateUserRepository(User user) throws Exception  {
		Map<String, Object> respuesta = new HashMap<>();
		
		String sql = "UPDATE USERS "
				+ " SET name=?, surname=?, mail=?, enabled=?, usuario=?, password=?   "
				+ "WHERE id = ? ";

		int rows = jdbcTemplate.update(sql, user.getName(), user.getSurname(), user.getMail(), user.getEnabled(), user.getUsuario(), user.getPassword(), user.getId());
								
		return  rows;
		
	}
	
}
