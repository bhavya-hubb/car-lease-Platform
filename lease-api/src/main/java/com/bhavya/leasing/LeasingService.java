package com.bhavya.leasing;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LeasingService {

    private static final Logger logger = LoggerFactory
            .getLogger(LeasingService.class);
    @Autowired
    private LeasingRepository leasingRepository;
    @Autowired
    private RestTemplate restTemplate;

    public LeasingService(LeasingRepository leasingRepository) {
        this.leasingRepository = leasingRepository;
    }

    public Iterable<LeasingDAO> getAllLeases() {
        return leasingRepository.findAll();
    }

    public Double calculateLeaseRate(Double mileage, Double duration, Double interestRate, Double nettPrice) {

        if(mileage<=0 || duration<=0 || interestRate <=0 || nettPrice <=0) {
            logger.error("input cannot be less than zero");
            throw new LeasingBusinessException("input cannot be less than zero");
        }
        return (((mileage / 12) * duration) / nettPrice) + (((interestRate / 100) * nettPrice) / 12);
    }
}
