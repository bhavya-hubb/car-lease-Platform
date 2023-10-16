package com.bhavya;

import com.bhavya.broker.BrokerDAO;
import com.bhavya.broker.BrokerRepository;
import com.bhavya.broker.BrokerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class BrokerServiceTest {
    @Autowired //injecting the crudRepository instance
    public BrokerRepository brokerRepository;
    @Autowired
    public BrokerService brokerService;
    @Test
    void firstTest() {
        List<BrokerDAO> brokers = brokerService.getAllBrokerInfo();
        assertTrue(brokers.isEmpty());
    }
}
