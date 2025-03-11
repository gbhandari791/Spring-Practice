package f.com.example.cunstructor.ref.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("f/com/example/cunstructor/ref/injection/ref.xml");
		A obOfA1 = (A) context.getBean("obOfA1");
		A obOfA2 = (A) context.getBean("obOfA2");
		A obOfA3 = (A) context.getBean("obOfA3");
		A obOfA4 = (A) context.getBean("obOfA4");
		
		System.out.println(obOfA1);
		System.out.println(obOfA2);
		System.out.println(obOfA3);
		System.err.println("--------------------------------");
		System.out.println(obOfA4.getListOfB());

	}

}
