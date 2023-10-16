package com.bhavya;

import com.bhavya.leasing.LeasingBusinessException;
import com.bhavya.leasing.LeasingDAO;
import com.bhavya.leasing.LeasingRepository;
import com.bhavya.leasing.LeasingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class LeasingServiceTest {

    @Autowired
    public LeasingRepository leasingRepository;
    @Autowired
    private LeasingService leasingService;

    @Test
    void testGetAllLease() {
        List<LeasingDAO> leases = (List<LeasingDAO>) leasingService.getAllLeases();
        assertTrue(leases.isEmpty());
    }
    @Test
    void testCalculateLeaseRate() {

        Double mileage = 100.0;
        Double duration = 20.0;
        Double interestRate = 1.10;
        Double nettPrice = 300.42;

        double leaseRate= leasingService.calculateLeaseRate(mileage, duration, interestRate, nettPrice);
        double expectedLeaseRate = 0.8301638651443535;
        assertEquals(expectedLeaseRate, leaseRate, 0.01);
    }
    @Test
    void testNegativeLeaseRate() {
        Double mileage = 0.0;
        Double duration = 20.0;
        Double interestRate = -1.10;
        Double nettPrice = 300.42;

        assertThrows(LeasingBusinessException.class,()->leasingService.calculateLeaseRate(mileage, duration, interestRate, nettPrice));
    }
}
