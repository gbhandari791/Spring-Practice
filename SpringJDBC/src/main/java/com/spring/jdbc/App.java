package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.config.JdbcConfig;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		// Insert
//       Student student = new Student();
//       student.setId(3);
//       student.setName("Peter");
//       student.setCity("New York");       
//       int rs = studentDao.insert(student);
//       System.out.println(rs);

		// Update
//       Student student1 = new Student();
//       student1.setId(3);
//       student1.setName("Gaurav");
//       student1.setCity("Mumbai");
//       int update = studentDao.update(student1);
//       System.out.println(update);

		// Delete
//		studentDao.delete(2);
		
		// Read
		// Single row/object
//		Student student = studentDao.getStudent(3);
//		System.out.println(student);
//		
//		// Multiple Objects
		List<Student> allStudent = studentDao.getAllStudent();
		for(Student student2 : allStudent) {
			System.out.println(student2);
		}
	}
}
