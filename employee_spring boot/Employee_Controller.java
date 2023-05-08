package com.rahul.batch4119.springboot.EmployeeExample.spring.boot.employee.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.batch4119.springboot.EmployeeExample.spring.boot.employee.example.model.Employee;
import com.rahul.batch4119.springboot.EmployeeExample.spring.boot.employee.example.repository.EmployeeRepository;

@RestController
@RequestMapping("/student")
public class Employee_Controller {
	@Autowired
EmployeeRepository sr;
@RequestMapping("/details")
public List<Employee> getStudents(){
	return sr.findAll();
}
}