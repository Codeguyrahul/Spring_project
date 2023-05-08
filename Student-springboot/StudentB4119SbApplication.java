package com.rahul.batch4119.springboot.spring.boot.example;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.rahul.batch4119.springboot.spring.boot.example.model.Student;

import com.rahul.batch4119.springboot.spring.boot.example.repository.StudentRepository;

@SpringBootApplication
public class StudentB4119SbApplication implements CommandLineRunner{
@Autowired
StudentRepository sr;
public static void main(String[] args) {
SpringApplication.run(StudentB4119SbApplication.class, args);
}
@Override
public void run(String... args) throws Exception {
this.sr.save(new Student("Arun Kumar","Anudeep","arun.kumar@gmail.com"));
this.sr.save(new Student("Deepak Yadhav","Anudeep","deepak.yadhav@gmail.com"));
}
}
