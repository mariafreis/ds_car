package com.mafer.dscar.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mafer.dscar.dtos.CarDTO;
import com.mafer.dscar.entities.Car;
import com.mafer.dscar.repositories.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;
	
	@Transactional(readOnly = true)
	public Page<CarDTO> findAll(Pageable pageabale){
		Page<Car> cars = carRepository.findAll(pageabale);
		Page<CarDTO> carPages = cars.map(x -> new CarDTO(x));
		return carPages;
	}
	
	@Transactional(readOnly = true)
	public CarDTO findById(Long id){
		Car car = carRepository.findById(id).get();
		CarDTO carDTO = new CarDTO(car);
		return carDTO;
	}
	
}
