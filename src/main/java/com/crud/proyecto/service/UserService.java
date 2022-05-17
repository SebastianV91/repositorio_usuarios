package com.crud.proyecto.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.crud.proyecto.entity.User;

public interface UserService {

	public Iterable<User> findAll();
	
	public Optional<User> findById(Long Id);
	
	public User save(User user);
	
	public void deleteById(Long id);
	
}
