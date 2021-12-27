package com.hcl.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Car;
import com.hcl.services.CarService;

@RestController
public class CarController {

	@Autowired
	CarService carService;

	@GetMapping("/car/getAllCars")
	public List<Car> getAllCars() {
		return carService.getAllCars();
	}

	@GetMapping("/car/add")
	public int insertCar(@RequestParam("cname") String name) {
		return carService.insertCar(name);
	}

	@GetMapping("/car/getByName")
	public Car selectCarByName(@RequestParam("cname") String name) {
		return carService.selectCarByName(name);
	}

	@GetMapping("/car/update")
	public int updateCar(@RequestParam("cname1") String cname1, @RequestParam("cname2") String cname2) {
		return carService.updateCar(cname1, cname2);
	}

	@GetMapping("/car/getById")
	public Car selectCarById(@RequestParam("cid") Integer id) {
		return carService.selectCarById(id);
	}

	@GetMapping("/car/delete")
	public int updateCar(@RequestParam("cname") String cname) {
		return carService.deleteCar(cname);
	}
}
