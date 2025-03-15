package j.com.example.spring.lifcycle.using.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("j/com/example/spring/lifcycle/using/annotation/blcua.xml");
		Bean bean = (Bean) context.getBean("bean1");
		System.out.println(bean);
		context.registerShutdownHook();
	}

}
