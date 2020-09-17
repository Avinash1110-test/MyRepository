package com.newage.employeeDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = "com.newage.employeeDetails.repository.EmployeeRepository")

public class EmployeeDetailsApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmployeeDetailsApplication.class, args);
	}

}
