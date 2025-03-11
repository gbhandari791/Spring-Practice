package d.com.example.cunstructor.premitive.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("d/com/example/cunstructor/premitive/injection/cpi.xml");
		
		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);
		
		System.out.println("--------------------------");
		Student student2 = (Student) context.getBean("student2");
		System.out.println(student2);
		
		System.out.println("--------------------------");
		Student student3 = (Student) context.getBean("student3");
		System.out.println(student3);
	}

}
