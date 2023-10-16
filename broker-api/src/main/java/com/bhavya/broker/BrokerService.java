package com.bhavya.broker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrokerService {
	@Autowired //injecting the crudRepository instance
	public BrokerRepository brokerRepository;

	public List<BrokerDAO> getAllBrokerInfo() {
		//creating an array list
		List<BrokerDAO> Brokers = new ArrayList<>();
		//iterate the findings and adding to list
		brokerRepository.findAll().forEach(Brokers::add);
		return Brokers;
	}
	
	public BrokerDAO getBrokerInfo(String id) {
		return brokerRepository.findById(id).get();	
	}
	
	public void addBroker(BrokerDAO Broker) {
		brokerRepository.save(Broker);
	}
	
	public void updateBroker(String brokerId, BrokerDAO Broker) {
		brokerRepository.save(Broker);
	}
	
	public void deleteBroker(String brokerId) {
		brokerRepository.deleteById(brokerId);
	}
}
