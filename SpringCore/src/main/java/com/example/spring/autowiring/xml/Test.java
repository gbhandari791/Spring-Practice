package com.example.spring.autowiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/spring/autowiring/xml/autoByXml.xml");
		Emp emp1 = context.getBean("emp", Emp.class);
		System.out.println(emp1);
	}
}
