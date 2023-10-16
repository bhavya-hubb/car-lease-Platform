package com.bhavya.leasing;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


import java.util.Date;

@Entity

public class LeasingDAO {

    @Id
    private Integer leaseId;
    private String  carId;
    private String  customerId;
    private Date orderDate;
    private Date  pickupDate;
    private Date  deliveryDate;
    private double  startingMiles;
    private double  endingMiles;
    private double  leaseAmount;
    private LeasingStatus  leasingStatus;

    public LeasingDAO() {

    }
    public LeasingDAO(Integer leaseId, String carId, String customerId, Date orderDate, Date pickupDate, Date deliveryDate, double startingMiles, double endingMiles, double leaseAmount, LeasingStatus leasingStatus) {
        this.leaseId = leaseId;
        this.carId = carId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.pickupDate = pickupDate;
        this.deliveryDate = deliveryDate;
        this.startingMiles = startingMiles;
        this.endingMiles = endingMiles;
        this.leaseAmount = leaseAmount;
        this.leasingStatus = leasingStatus;
    }

    public Integer getLeaseId() {
        return leaseId;
    }

    public void setLeaseId(Integer leaseId) {
        this.leaseId = leaseId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public double getStartingMiles() {
        return startingMiles;
    }

    public void setStartingMiles(double startingMiles) {
        this.startingMiles = startingMiles;
    }

    public double getEndingMiles() {
        return endingMiles;
    }

    public void setEndingMiles(double endingMiles) {
        this.endingMiles = endingMiles;
    }

    public double getLeaseAmount() {
        return leaseAmount;
    }

    public void setLeaseAmount(double leaseAmount) {
        this.leaseAmount = leaseAmount;
    }

    public LeasingStatus getLeasingStatus() {
        return leasingStatus;
    }

    public void setLeasingStatus(LeasingStatus leasingStatus) {
        this.leasingStatus = leasingStatus;
    }
}
