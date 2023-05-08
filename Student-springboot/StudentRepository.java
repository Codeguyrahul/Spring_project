package com.rahul.batch4119.springboot.spring.boot.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahul.batch4119.springboot.spring.boot.example.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
}
