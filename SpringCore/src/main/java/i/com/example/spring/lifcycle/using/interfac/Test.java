package i.com.example.spring.lifcycle.using.interfac;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("i/com/example/spring/lifcycle/using/interfac/blcui.xml");
		Student std1 = (Student) context.getBean("bean1");
		System.out.println(std1);
		
		context.registerShutdownHook();
		
	}

}
