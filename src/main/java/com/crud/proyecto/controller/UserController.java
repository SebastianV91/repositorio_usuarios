package com.crud.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.proyecto.dto.User;
import com.crud.proyecto.service.UserService;

@RestController
@RequestMapping("/api/users/")
public class UserController {

	@Autowired
	UserService userImpl;


	@PostMapping("/save")
	public ResponseEntity<?> create(@RequestBody User user) throws Exception{
		//UserServiceImpl userImpl = new UserServiceImpl();

		return new ResponseEntity(userImpl.ejemploDB("sebastian").toString(), HttpStatus.CREATED);
				
	}
	
	@PostMapping("/saveUser")
	public ResponseEntity<?> createUser(@RequestBody User user) throws Exception{
		//UserServiceImpl userImpl = new UserServiceImpl();

		return new ResponseEntity(userImpl.insertUser(user), HttpStatus.OK);
				
	}																					
	
	@PostMapping("/updateUser")
	public ResponseEntity<?> updateUser(@RequestBody User user) throws Exception{
		//UserServiceImpl userImpl = new UserServiceImpl();

		//userImpl.updateUser(user);
		
		return new ResponseEntity(userImpl.updateUser(user), HttpStatus.CREATED);		
				
	}
	
	@PostMapping("/loginUser")
	public ResponseEntity<?> signinUser(@RequestBody User user) throws Exception{
		return new ResponseEntity(userImpl.loginUser(user), HttpStatus.CREATED);
	}
	
	
	
}
