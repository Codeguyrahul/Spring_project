package com.rahul.batch4119.springboot.EmployeeExample.spring.boot.employee.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahul.batch4119.springboot.EmployeeExample.spring.boot.employee.example.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}