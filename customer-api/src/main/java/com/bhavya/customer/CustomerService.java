package com.bhavya.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired //injecting the crudRepository instance
	public CustomerRepository customerRepository;

	public List<CustomerDAO> getAllCustomerInfo() {
		//creating an array list
		List<CustomerDAO> Customers = new ArrayList<>();
		//iterate the findings and adding to list
		customerRepository.findAll().forEach(Customers::add);
		return Customers;
	}
	
	public CustomerDAO getCustomerInfo(String id) {
		return customerRepository.findById(id).get();	
	}
	
	public CustomerDAO addCustomer(CustomerDAO Customer) {
		return customerRepository.save(Customer);
	}
	
	public void updateCustomer(String customerId, CustomerDAO Customer) {
		customerRepository.save(Customer);
	}
	
	public void deleteCustomer(String customerId) {
		customerRepository.deleteById(customerId);
	}
}
