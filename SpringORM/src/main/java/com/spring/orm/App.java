package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStream;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.configuration.OrmConfiguration;
import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(OrmConfiguration.class);
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
//       
//        Student student = new Student(1, "Durgesh", "Java");
//        int rs = studentDao.insert(student);
//        System.out.println("Roes Inserted : " + rs);
        
        // CRUD
        
        // Create
        
        Student student1 = new Student(3, "Tony", "Java");
        Student student2 = new Student(4, "Peter", "Python");
        Student student3 = new Student(5, "Durgesh", "React");
        studentDao.insert(student1);
        studentDao.insert(student2);
        studentDao.insert(student3);
        
        
        // Read
        
        Student student = studentDao.getStudent(1);
        System.out.println(student);
        System.out.println("-------------------------------------------------------------");
        List<Student> allStudents = studentDao.getAllStudents();
        for(Student stnt : allStudents) {
        	System.out.println(stnt);
        }
        
        // update
        
//        Student uStudent1 = new Student(1, "Iron Man", "All");
//        studentDao.update(uStudent1);
        
        // Delete
        
 //       studentDao.delete(3);
        
    }
}
