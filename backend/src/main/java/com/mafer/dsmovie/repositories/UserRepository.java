package com.mafer.dscar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mafer.dscar.entities.Car;
import com.mafer.dscar.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
