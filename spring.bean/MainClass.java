package com.rahul.spring.bean.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String... args) {
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
Employee e = (Employee) context.getBean("empl");
System.out.println("Name : "+e.getName());
System.out.println("Id : "+e.getId());
}
}
