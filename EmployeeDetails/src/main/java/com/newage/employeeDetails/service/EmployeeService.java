package com.newage.employeeDetails.service;

import com.newage.employeeDetails.model.Employee;
import com.newage.employeeDetails.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    Employee employee;

    public List<Employee> getAllEmployees() {

        return (List<Employee>) employeeRepository.findAll();
    }
    public Employee getEmployeeById(int employeeid) {

        return employeeRepository.findById(employeeid).get();
    }
    public void save(List<Employee> employee) {

        employeeRepository.saveAll(employee);
    }
    public void delete(int id) {

        employeeRepository.deleteById(id);
    }
    public void update(Employee employee, int employeeid) {

        employeeRepository.save(employee);
    }
    public String isConfirmed () {
        String isApproved = "No";
        String a = "Employee is in Probation period";
        String b = "Employee is Confirmed";
        if (isApproved.equals(employee.getIsApproved())) {
            return a;
        } else {
            return b;
        }
    }

}
