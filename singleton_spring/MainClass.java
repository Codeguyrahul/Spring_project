package com.singleton.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
public static void main(String... args) {
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
Employee e1 = context.getBean(Employee.class);
Employee e2 = context.getBean(Employee.class);
boolean isSame = e1==e2;
System.out.println(e1.hashCode());
System.out.println(e2.hashCode());
System.out.println("e1 and e2 are same "+isSame);
context.close();
}
}
