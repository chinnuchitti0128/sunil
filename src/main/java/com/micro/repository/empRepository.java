package com.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.model.Employee;
@Repository
public interface empRepository extends JpaRepository<Employee,Integer>{

}
