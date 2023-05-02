package com.two_way_annotation.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Employee {
@PostConstruct
public void inita() {
System.out.println("Bean is being created");
}
@PreDestroy
public void clear() {
System.out.println("Bean is being destroyed");
}

public void knowInfor() {
	// TODO Auto-generated method stub
	System.out.println("Employee is working");
}
}
