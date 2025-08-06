package s.com.example.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOP {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = context.getBean("student", Student.class);
		Employee employee = context.getBean("emloyee", Employee.class);
		student.study();
		System.out.println("----------------------------------");
		student.studyingMaths();
		employee.studyingJava();
		System.out.println("----------------------------------");
		student.add(2,5);
		System.out.println("----------------------------------");
		student.addTwoNumbers(20, 21);
		System.out.println("----------------------------------");
		try {
			student.throwException();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("----------------------------------");
		student.printHello();
		System.out.println("----------------------------------");
		student.printNumber();
	}
}
