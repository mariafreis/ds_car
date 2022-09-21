package com.mafer.dscar.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mafer.dscar.dtos.CarDTO;
import com.mafer.dscar.dtos.ScoreDTO;
import com.mafer.dscar.entities.Car;
import com.mafer.dscar.entities.Score;
import com.mafer.dscar.entities.User;
import com.mafer.dscar.repositories.CarRepository;
import com.mafer.dscar.repositories.ScoreRepository;
import com.mafer.dscar.repositories.UserRepository;

@Service
public class ScoreService {

	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ScoreRepository scoreRepository;
	
	
	@Transactional
	public CarDTO saveScore(ScoreDTO dto){
		
			User user = userRepository.findByEmail(null);
			if (user == null) {
				user = new User();
				user.setEmail(dto.getEmail());
				userRepository.saveAndFlush(user);
			}
			
			Car car = carRepository.findById(dto.getCarId()).get();
			
			Score score = new Score();
			score.setCar(car);
			score.setUser(user);
			score.setValue(dto.getScore());
			
			score = scoreRepository.saveAndFlush(score);
			
			double sum = 0;
			for(Score x: car.getScores()) {
				sum += x.getValue();
			}
			
			double avg = sum / car.getScores().size();
			car.setScore(avg);
			car.setCount(car.getScores().size());
			
			car = carRepository.save(car);
			
			
			return new CarDTO(car);
		}
	
}
