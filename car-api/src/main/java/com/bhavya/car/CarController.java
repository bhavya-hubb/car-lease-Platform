package com.bhavya.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
	
	@Autowired
	public CarService carService;
	
	@Autowired
	public CarRepository carRepository;
	
	@RequestMapping("/cars")
	public List<CarDAO> getCarInfo() {
		return carService.getAllCarInfo();
	}
	
	@RequestMapping("/cars/{carId}")
	public CarDAO getcarInfo(@PathVariable String carId) {
		return carService.getCarInfo(carId);		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/cars")
	public CarDAO addCar(@RequestBody CarDAO cars) {
		return carService.addCar(cars);

	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/cars/{carId}")
	public void updateCar(@PathVariable String carId, @RequestBody CarDAO cars) {
		carService.updateCar(carId, cars);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/cars/{carId}")
	public void deleteCar(@PathVariable String carId) {
		carService.deleteCar(carId);
	}			
}
