package com.bhavya.broker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BrokerController {
	@Autowired
	public BrokerService brokerService;
		
	@RequestMapping("/brokers")
	public List<BrokerDAO> getBrokerInfo() {
		return brokerService.getAllBrokerInfo();
	}
	
	@RequestMapping("/brokers/{brokerId}")
	public BrokerDAO getBroker(@PathVariable String brokerId) {
		return brokerService.getBrokerInfo(brokerId);		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/brokers")
	public void addBroker(@RequestBody BrokerDAO brokers) {
		brokerService.addBroker(brokers);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/brokers/{brokerId}")
	public void updateBroker(@PathVariable String brokerId, @RequestBody BrokerDAO brokers) {
		brokerService.updateBroker(brokerId, brokers);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/brokers/{brokerId}")
	public void deleteBroker(@PathVariable String brokerId) {
		brokerService.deleteBroker(brokerId);
	}
}
