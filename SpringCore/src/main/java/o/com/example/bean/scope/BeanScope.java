package o.com.example.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("o/com/example/bean/scope/config.xml");
		
		Student student1 = context.getBean("student", Student.class);
		System.out.println(student1);
		System.out.println(student1.hashCode());
		student1.setName("Devang");
		
		Student student2 = context.getBean("student", Student.class);
		System.out.println(student2);
		System.out.println(student2.hashCode());
		
		Student student3 = context.getBean("student", Student.class);
		System.out.println(student3);
		System.out.println(student3.hashCode());
	}
}
