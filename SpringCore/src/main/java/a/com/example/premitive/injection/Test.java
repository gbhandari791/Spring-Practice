package a.com.example.premitive.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("a/com/example/premitive/injection/primitiveInjection.xml");
		Sudent student1 = (Sudent) context.getBean("student1");
		Sudent student2 = (Sudent) context.getBean("student2");
		Sudent student3 = (Sudent) context.getBean("student3");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}

}
