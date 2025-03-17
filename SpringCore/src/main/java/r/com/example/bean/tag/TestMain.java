package r.com.example.bean.tag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student bean = context.getBean("student", Student.class);
		System.out.println(bean);
		bean.getSamosa().displayPrice();
		
	}

}
