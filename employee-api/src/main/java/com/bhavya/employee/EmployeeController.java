package com.bhavya.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
		
	@RequestMapping("/employees")
	public List<EmployeeDAO> getCarInfo() {
		return employeeService.getAllEmployeeInfo();
	}
	
	@RequestMapping("/employees/{empId}")
	public EmployeeDAO getEmpInfo(@PathVariable String empId) {
		return employeeService.getEmployeeInfo(empId);		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/employees")
	public void addEmp(@RequestBody EmployeeDAO employees) {
		employeeService.addEmployee(employees);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/employees/{empId}")
	public void updateEmp(@PathVariable String empId, @RequestBody EmployeeDAO employees) {
		employeeService.updateEmployee(empId, employees);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/employees/{empId}")
	public void deleteEmp(@PathVariable String empId) {
		employeeService.deleteEmployee(empId);
	}			
	
}