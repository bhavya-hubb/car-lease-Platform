package com.bhavya;

import com.bhavya.employee.EmployeeDAO;
import com.bhavya.employee.EmployeeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    public EmployeeService employeeService;
    @Test
    void firstTest() {
        List<EmployeeDAO> employees = employeeService.getAllEmployeeInfo();
        assertTrue(employees.isEmpty());
    }
}