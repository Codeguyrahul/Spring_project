package com.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Employee implements InitializingBean,DisposableBean{
public void afterPropertiesSet() throws Exception{
System.out.println("Bean is being created");
}
public void destroy() throws Exception{
System.out.println("Bean is being destroyed");
}
public void knowInfor() {
System.out.println("Employee is working");
}
}
