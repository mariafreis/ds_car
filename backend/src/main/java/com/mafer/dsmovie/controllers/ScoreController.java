package com.mafer.dscar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mafer.dscar.dtos.CarDTO;
import com.mafer.dscar.dtos.ScoreDTO;
import com.mafer.dscar.services.CarService;
import com.mafer.dscar.services.ScoreService;

@RestController
@RequestMapping(value = "scores")
public class ScoreController {

	@Autowired
	ScoreService scoreService;
	
	@PutMapping
	public CarDTO saveScore(@RequestBody ScoreDTO score){
		CarDTO carDTO = scoreService.saveScore(score);
		return carDTO;
	
	}
	

}
