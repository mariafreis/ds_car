package com.mafer.dscar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mafer.dscar.dtos.CarDTO;
import com.mafer.dscar.services.CarService;

@RestController
@RequestMapping(value = "cars")
public class CarController {

	@Autowired
	CarService carService;
	
	@GetMapping
	public Page<CarDTO> findAll(Pageable pageable){
		
		return carService.findAll(pageable);
	
	}
	
	@GetMapping(value = "/{id}")
	public CarDTO find(@PathVariable Long id){
		
		return carService.findById(id);
	
	}
}
