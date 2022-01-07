package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@RestController
public class DepertmentController {
	@Autowired
	private DepartmentRepository deptRepo;
	
	@Autowired RestTemplate restTemp;
	
	@PostMapping("/create")
	public Department addDept(@RequestBody Department dept) {
		return deptRepo.save(dept);
	}
	
	@GetMapping("/get-alldept")
	public List<Department> listDepartment() {
		return deptRepo.findAll();
	}

	@PutMapping("/upadte")
	public Department updateDept(@RequestBody Department employee) {
		return deptRepo.save(employee);
	}
	
	@GetMapping("/getall-allemployee")
	public List<Employee> getEmployee(){
		List<Employee> employee=
	}
	


}
