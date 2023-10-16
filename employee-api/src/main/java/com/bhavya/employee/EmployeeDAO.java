package com.bhavya.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 *  This is a Data Access Object (DAO) class for interacting with the Employee data.
 *  by using private fields and public getter and setter methods.
 */
@Entity
public class EmployeeDAO {

    @Id
    private String empId;
    private String empName;
    private String empPlace;

    public EmployeeDAO() {

    }

    public EmployeeDAO(String empId, String empName, String empPlace) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empPlace = empPlace;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPlace() {
        return empPlace;
    }

    public void setEmpPlace(String empPlace) {
        this.empPlace = empPlace;
    }

}
