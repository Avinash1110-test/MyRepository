package com.newage.employeeDetails.controller;

import com.newage.employeeDetails.model.Employee;
import com.newage.employeeDetails.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/employeeMaster")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping ("/getAllEmployees")
    public List<Employee> getAllEmployees() {

        return employeeService.getAllEmployees();
    }
    @GetMapping ("/getEmployeeByID/{employeeID}")
    public Employee getEmployee (@PathVariable ("employeeID") int employeeID) {

        return employeeService.getEmployeeById(employeeID);
    }

    @PostMapping ("/postEmployee")
    public List<Employee> saveEmployee (@RequestBody List<Employee> employee) {

        employeeService.save(employee);
        return employee;
    }

    @PutMapping ("/putEmployee/{employeeID}")
    public Employee updateEmployee (@PathVariable ("employeeID") int employeeID , @RequestBody Employee employee) {

        employeeService.update(employee , employeeID);
        return employee;
    }

    @DeleteMapping ("/deleteEmployee/{employeeID}")
    private String deleteTicket (@PathVariable ("employeeID") int employeeID) {

        employeeService.delete(employeeID);
        return "Deleted the details of the employee containing employeeID : " + employeeID;
    }
}
