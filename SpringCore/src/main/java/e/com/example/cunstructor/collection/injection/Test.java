package e.com.example.cunstructor.collection.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("e/com/example/cunstructor/collection/injection/cci.xml");
		Emp emp1 = (Emp) context.getBean("emp1");
		
		System.err.println(emp1);

	}

}
