package com.rahul.spring.ex1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application.Context.xml");
    HelloService obj=(HelloService)context.getBean("HelloService");
    obj.hello();
    context.close();
   }
 }
