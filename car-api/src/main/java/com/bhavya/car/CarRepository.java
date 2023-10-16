package com.bhavya.car;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<CarDAO,String> {

}
