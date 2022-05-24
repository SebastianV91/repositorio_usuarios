package com.crud.proyecto.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.crud.proyecto.repository.UserRepository;



@Service
public class UserServiceImpl extends  UserRepository{

	
	public Map<String, Object> ejemploDB (String entrada) throws Exception {
		System.out.println(":::REPUESTA:::"+getTESTRepository("sebastian"));
		return getTESTRepository("sebastian");
	}


}
