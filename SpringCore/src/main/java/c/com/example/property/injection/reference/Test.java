package c.com.example.property.injection.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("c/com/example/property/injection/reference/ref.xml");
		A obOfA0 =	(A) context.getBean("obOfA0");
		A obOfA = 	(A) context.getBean("obOfA");
		A obOfA2 =	(A) context.getBean("obOfA2");
		System.out.println(obOfA0);
		System.out.println("------------------------------------");
		System.out.println(obOfA);
		System.err.println("-------------------------------------");
		System.err.println(obOfA2);
	}

}
