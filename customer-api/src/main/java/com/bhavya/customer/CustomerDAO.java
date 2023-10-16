package com.bhavya.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CustomerDAO {

	@Id
	private String customerId;
	private String customerName;
	private String street;
	private String houseNumber;
	private String zipCode;
	private String place;
	private String emailId;
	private String phnNum;
    
    public CustomerDAO() {

	}
    
    public CustomerDAO(String customerId, String customerName, String street, String houseNumber, String zipCode,
			String place, String emailId, String phnNum) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.street = street;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
		this.place = place;
		this.emailId = emailId;
		this.phnNum = phnNum;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhnNum() {
		return phnNum;
	}
	public void setPhnNum(String phnNum) {
		this.phnNum = phnNum;
	}
    
    
}
