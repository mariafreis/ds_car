package com.mafer.dscar.dtos;

import com.mafer.dscar.entities.Car;

public class CarDTO {
	private Long id;
	private String name;
	private Double score;
	private Integer count;
	private String image;
	
	public CarDTO() {
		
	}

	public CarDTO(Long id, String name, Double score, Integer count, String image) {
	
		this.id = id;
		this.name = name;
		this.score = score;
		this.count = count;
		this.image = image;
	}
	
	public CarDTO(Car car) {
	
		this.id = car.getId();
		this.name = car.getName();
		this.score = car.getScore();
		this.count = car.getCount();
		this.image = car.getImage();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
}
