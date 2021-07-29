package com.micro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.model.Employee;
import com.micro.repository.empRepository;

@Service
public class empService {

	@Autowired
	empRepository erep;
	
	public Employee addemployee(Employee emp) {
		return erep.save(emp);
	}
	
	public List<Employee> getAllemp(){
		List<Employee> list=new ArrayList<Employee>();
		erep.findAll().forEach(a->list.add(a));
		return list;
	}
}
