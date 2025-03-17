package n.com.example.stereotype.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereotypeAnno {

	public static void main(String[] args) {
	 ApplicationContext context	= new ClassPathXmlApplicationContext("n/com/example/stereotype/anno/config.xml");
	 Student student = context.getBean("studentBean", Student.class);
	 System.out.println(student);
	 System.out.println(student.getStudentAddress());
	 System.err.println(student.getStudentAddress().getClass().getName());
	}
}
