package com.bhavya.leasing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/lease")
public class LeasingController {

    @Autowired
    private LeasingService leasingService;

    /**
     * Constructor injection
     *
     * @param leasingService
     */
    public LeasingController(LeasingService leasingService) {
        this.leasingService = leasingService;
    }

    @RequestMapping("/")
    public Iterable<LeasingDAO> getLeases() {
        return leasingService.getAllLeases();
    }

    @RequestMapping("/rate")
    public Double calculateLease(@RequestParam("mileage") Double mileage,
                                 @RequestParam("duration") Double duration,
                                 @RequestParam("interestRate") Double interestRate,
                                 @RequestParam("nettPrice") Double nettPrice
    ) {
        return leasingService.calculateLeaseRate(mileage, duration, interestRate, nettPrice);
    }

}
