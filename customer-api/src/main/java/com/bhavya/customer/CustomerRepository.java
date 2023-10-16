package com.bhavya.customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerDAO,String> {

}