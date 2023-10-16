package com.bhavya.car;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CarDAO {

    @Id
    private String carId;
    private String make;
    private String model;
    private String version;
    private Integer numberOfDoors;
    private double co2Emission;
    private double grossPrice;
    private double nettPrice;

    public CarDAO() {

    }

    public CarDAO(String carId, String make, String model, String version, Integer numberOfDoors, double co2Emission,
                  double grossPrice, double nettPrice) {
        super();
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.version = version;
        this.numberOfDoors = numberOfDoors;
        this.co2Emission = co2Emission;
        this.grossPrice = grossPrice;
        this.nettPrice = nettPrice;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public double getCo2Emission() {
        return co2Emission;
    }

    public void setCo2Emission(double co2Emission) {
        this.co2Emission = co2Emission;
    }

    public double getGrossPrice() {
        return grossPrice;
    }

    public void setGrossPrice(double grossPrice) {
        this.grossPrice = grossPrice;
    }

    public double getNettPrice() {
        return nettPrice;
    }

    public void setNettPrice(double nettPrice) {
        this.nettPrice = nettPrice;
    }

    @Override
    public String toString() {
        return "CarDAO [carId=" + carId + ", make=" + make + ", model=" + model + ", version=" + version
                + ", numberOfDoors=" + numberOfDoors + ", co2Emission=" + co2Emission + ", grossPrice=" + grossPrice
                + ", nettPrice=" + nettPrice + "]";
    }

}
 