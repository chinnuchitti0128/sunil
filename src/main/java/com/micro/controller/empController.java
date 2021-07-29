package com.micro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.micro.model.Employee;
import com.micro.service.empService;

@RestController
public class empController {

	@Autowired
	empService eservice;
	
	@GetMapping("/emp")
	public List<Employee> getAllEmp(){
		return eservice.getAllemp();
	}
	
	@PostMapping("/addemp")
	public Employee addEmployee(@RequestBody Employee emp) {
		return eservice.addemployee(emp);
	}
}
