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

import com.crud.proyecto.entity.User;
import com.crud.proyecto.service.UserServiceImpl;

@RestController
@RequestMapping("/api/users/")
public class UserController {

	@Autowired
	UserServiceImpl userImpl;


	@PostMapping("/save")
	public ResponseEntity<?> create(@RequestBody User user) throws Exception{
		//UserServiceImpl userImpl = new UserServiceImpl();

		return new ResponseEntity(userImpl.ejemploDB("sebastian").toString(), HttpStatus.CREATED);
				
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id") Long userId){
		
		
		return ResponseEntity.ok(null);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody User userDetails, @PathVariable(value = "id") Long userId){
		/*Optional<User> user = userService.findById(userId);
		
		if(!user.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		user.get().setName(userDetails.getName());
		user.get().setSurname(userDetails.getSurname());
		user.get().setEmail(userDetails.getEmail());
		user.get().setEnabled(userDetails.getEnabled());*/
		
		return ResponseEntity.ok().build();
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long userId){
		
		/*if(!userService.findById(userId).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		userService.deleteById(userId);*/
		
		return ResponseEntity.ok().build();
		
	}
	
	@GetMapping
	public List<User> readAll(){
		
		/*List<User> users = StreamSupport
				.stream(userService.findAll().spliterator(), false)
				.collect(Collectors.toList());*/
		
		return null;
	}
	
}
