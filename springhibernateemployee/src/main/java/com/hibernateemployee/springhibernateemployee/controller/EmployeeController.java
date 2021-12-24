package com.hibernateemployee.springhibernateemployee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hibernateemployee.springhibernateemployee.entity.Employee;
import com.hibernateemployee.springhibernateemployee.repositary.EmployeeRepositary;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepositary employeeRepositary;
	
	@PostMapping("/create-employee")
	public Employee createEmp(@RequestBody Employee emp) {
		Employee e=employeeRepositary.save(emp);
		return e;
	}
}
