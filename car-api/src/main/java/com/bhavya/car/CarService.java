package com.bhavya.car;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
	
	@Autowired //injecting the crudRepository instance
	public CarRepository carRepository;

	/*
	List<CarDAO> cars = new ArrayList<>(Arrays.asList(
			new CarDAO("100","Toyoto","Innova","v1",5,50.1,29930.75,35000.00),
			new CarDAO("101","Toyoto","Fortuner","v2",5,89.2,3200.75,37000.00)
	));
	*/
	
	public List<CarDAO> getAllCarInfo() {
		//creating an array list
		List<CarDAO> cars = new ArrayList<>();
		//iterate the findings and adding to list
		carRepository.findAll().forEach(cars::add);
		return cars;
	}
	
	public CarDAO getCarInfo(String id) {
		return carRepository.findById(id).get();	
	}
	
	public CarDAO addCar(CarDAO car) {
		return carRepository.save(car);
	}
	
	public void updateCar(String carId, CarDAO car) {
		carRepository.save(car);
	}
	
	public void deleteCar(String carId) {
		carRepository.deleteById(carId);
	}

}
