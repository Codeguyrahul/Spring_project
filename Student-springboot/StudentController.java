package com.rahul.batch4119.springboot.spring.boot.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.batch4119.springboot.spring.boot.example.model.Student;
import com.rahul.batch4119.springboot.spring.boot.example.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
StudentRepository sr;
@RequestMapping("/details")
public List<Student> getStudents(){
return this.sr.findAll();
}
}

