package com.hcl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.Car;
import com.hcl.repos.CarRepository;

@Service
public class CarService {
	@Autowired
	CarRepository carRepository;

	public List<Car> getAllCars() {
		return carRepository.getAllCars();
	}

	public int insertCar(String car, String type) {
		return carRepository.insertCar(car, type);
	}

	public Car selectCarByName(String name) {
		return carRepository.selectCarByName(name);
	}

	public Car selectCarById(Integer id) {
		return carRepository.selectCarById(id);
	}

	public int updateCar(String cname1, String cname2) {
		return carRepository.updateCar(cname1, cname2);
	}

	public int deleteCar(String cname) {
		return carRepository.deleteCar(cname);
	}

}
