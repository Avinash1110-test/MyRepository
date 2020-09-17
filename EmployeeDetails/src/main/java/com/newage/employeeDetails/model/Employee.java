package com.newage.employeeDetails.model;


import com.newage.employeeDetails.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Employee {

    @Id
    @Column
    private int employeeID;
    @Column
    private String employeeName;
    @Column
    private String email;
    @Column
    private double salary;
    @Column
    public String isApproved;
    @Column
    public String confirmation;

    @Autowired
    EmployeeService employeeService;

    public int getEmployeeID() {

        return employeeID;
    }
    public void setEmployeeID(int employeeID) {

        this.employeeID = employeeID;
    }
    public String getEmployeeName() {

        return employeeName;
    }
    public void setEmployeeName(String employeeName) {

        this.employeeName = employeeName;
    }
    public String getEmail() {

        return email;
    }
    public void setEmail(String email) {

        this.email = email;
    }
    public double getSalary() {

        return salary;
    }
    public void setSalary(double salary) {

        this.salary = salary;
    }
    public String getIsApproved() {

        return isApproved;
    }
    public void setIsApproved(String isApproved) {

        this.isApproved = isApproved;
    }
    public String getConfirmation() {

        return confirmation;
    }
    public void setConfirmation(String confirmation) {

        this.confirmation = employeeService.isConfirmed();
    }
}
