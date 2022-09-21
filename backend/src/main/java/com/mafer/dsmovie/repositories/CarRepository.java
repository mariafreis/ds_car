package com.mafer.dscar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mafer.dscar.entities.Car;

public interface CarRepository extends JpaRepository<Car, Long>{
	
}
