package com.crud.proyecto.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crud.proyecto.dto.User;
import com.crud.proyecto.repository.UserRepository;



@Service
public class UserService extends  UserRepository{

	
	public Map<String, Object> ejemploDB (String entrada) throws Exception {
		System.out.println(":::REPUESTA:::"+getTESTRepository("sebastian"));
		return getTESTRepository("sebastian");
	}

	public Map<String, Object> insertUser (User user) throws Exception {
		
//		System.out.println(":::REPUESTA:::"+insertUser(user));
		
		return insertUserRepository(user);
	}																		
	
public Map<String, Object> updateUser(User user) throws Exception {
		
		Map <String, Object> response = new HashMap<String, Object>();
		
//		System.out.println(":::REPUESTA:::"+updateUserRepository(user));
		
		if(updateUserRepository(user) == 1) {
			response.put("message", "usuario actualizado");
		}else {
			response.put("message", "usuario no encontrado");
		}
		
		return response;
	}
	
}
