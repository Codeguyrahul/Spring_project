package com.rahul.springboot.project.springboot.Ems.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahul.springboot.project.springboot.Ems.project.model.EmployeeManagement;


@Repository
public interface EmployeeMSrepository extends JpaRepository<EmployeeManagement,Long>{

}