package com.bhavya.leasing;

public enum LeasingStatus {
    AVAILABLE("Available"),
    RESERVED("Reserved"),
    RENTED("Rented"),
    RETURNED("Returned"),
    MAINTENANCE("Maintenance");

    private final String statusDescription;

    LeasingStatus(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

}
