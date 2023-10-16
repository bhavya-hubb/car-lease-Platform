package com.bhavya.broker;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BrokerDAO {

    @Id
    private String brokerId;
    private String brokerName;
    private String brokerPlace;

    public BrokerDAO() {

    }

    public BrokerDAO(String brokerId, String brokerName, String brokerPlace) {
        super();
        this.brokerId = brokerId;
        this.brokerName = brokerName;
        this.brokerPlace = brokerPlace;
    }

    public String getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public String getBrokerPlace() {
        return brokerPlace;
    }

    public void setBrokerPlace(String brokerPlace) {
        this.brokerPlace = brokerPlace;
    }
}
