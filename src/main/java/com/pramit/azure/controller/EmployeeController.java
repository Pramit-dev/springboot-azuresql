package com.pramit.azure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pramit.azure.entity.Employee;
import com.pramit.azure.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
    private EmployeeRepository repository;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return repository.save(employee);
	}

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return repository.findAll();
	}
	
	@GetMapping("/hello")
	public String addEmployee() {
		return "This is my second sprinboot azure example";
	}

}
