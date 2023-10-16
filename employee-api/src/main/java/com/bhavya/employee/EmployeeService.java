package com.bhavya.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired //injecting the crudRepository instance
	public EmployeeRepository employeeRepository;

	public List<EmployeeDAO> getAllEmployeeInfo() {
		//creating an array list
		List<EmployeeDAO> Employees = new ArrayList<>();
		//iterate the findings and adding to list
		employeeRepository.findAll().forEach(Employees::add);
		return Employees;
	}
	
	public EmployeeDAO getEmployeeInfo(String id) {
		return employeeRepository.findById(id).get();	
	}
	
	public void addEmployee(EmployeeDAO Employee) {
		employeeRepository.save(Employee);
	}
	
	public void updateEmployee(String empId, EmployeeDAO Employee) {
		employeeRepository.save(Employee);
	}
	
	public void deleteEmployee(String empId) {
		employeeRepository.deleteById(empId);
	}
}
