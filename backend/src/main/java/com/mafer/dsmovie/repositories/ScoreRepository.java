package com.mafer.dscar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mafer.dscar.entities.Car;
import com.mafer.dscar.entities.Score;
import com.mafer.dscar.entities.ScorePK;
import com.mafer.dscar.entities.User;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
}
