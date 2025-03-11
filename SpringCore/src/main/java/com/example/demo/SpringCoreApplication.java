package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);
	
		ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
		Student student1 = (Student) context.getBean("student");
		Student student2 = (Student) context.getBean("student2");
		Student student3 = (Student) context.getBean("student3");
		System.err.println(student1);
		System.err.println("-------------------------------------");
		System.err.println(student2);
		System.err.println("-------------------------------------");
		System.err.println(student3);
	}

}
