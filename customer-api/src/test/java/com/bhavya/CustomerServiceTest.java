package com.bhavya;

import com.bhavya.customer.CustomerDAO;
import com.bhavya.customer.CustomerRepository;
import com.bhavya.customer.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CustomerServiceTest {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerService customerService;

    @Test
    void FirstTest() {
        List<CustomerDAO> customers = customerService.getAllCustomerInfo();
        assertTrue(customers.isEmpty());
    }
}
