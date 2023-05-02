package com.arun.batch4119.spring.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Office {
public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
Employee e1 = (Employee) context.getBean("contract");
e1.knowInfor();
Employee e2 = (Employee)context.getBean("permanent");
e2.knowInfor();
}
}