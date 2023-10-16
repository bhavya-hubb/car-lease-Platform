package com.bhavya;

import com.bhavya.car.CarDAO;
import com.bhavya.car.CarRepository;
import com.bhavya.car.CarService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CarServiceTest {

    @Autowired
    CarRepository carRepository;

    @Autowired
    CarService carService;

    @Autowired
    CarDAO carDAO;

    @Test
    void testGetCarList() {
        List<CarDAO> cars = carService.getAllCarInfo();
        assertTrue(cars.isEmpty());
    }
    @Test
    void testAddCar() {

        CarDAO newCar = new CarDAO("102","Toyota", "Camry", "v2",5, 50.2,2500.00,3000.00);
        CarDAO cars= carService.addCar(newCar);
        assertEquals("102", cars.getCarId());
    }
}
