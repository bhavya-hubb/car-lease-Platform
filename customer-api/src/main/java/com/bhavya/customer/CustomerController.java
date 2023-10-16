package com.bhavya.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	public CustomerService customerService;
	
	
	@RequestMapping("/customers")
	public List<CustomerDAO> getCarInfo() {
		return customerService.getAllCustomerInfo();
	}
	
	@RequestMapping("/customers/{customerId}")
	public CustomerDAO getcarInfo(@PathVariable String customerId) {
		return customerService.getCustomerInfo(customerId);		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/customers")
	public CustomerDAO addCustomer(@RequestBody CustomerDAO customers) {
		return customerService.addCustomer(customers);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/customers/{customerId}")
	public void updateCustomer(@PathVariable String carId, @RequestBody CustomerDAO customers) {
		customerService.updateCustomer(carId,customers);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/customers/{customerId}")
	public void addCustomer(@PathVariable String customerId) {
		customerService.deleteCustomer(customerId);
	}			
}