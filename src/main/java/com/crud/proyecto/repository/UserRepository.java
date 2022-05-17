package com.crud.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.proyecto.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
