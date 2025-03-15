package m.com.example.spring.stanfalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("m/com/example/spring/stanfalone/collection/aloncoll.xml");
		StandAlonCollection alonCollection = context.getBean("bean1", StandAlonCollection.class);
		System.err.println(alonCollection.getFriends());
		System.out.println(alonCollection.getFriends().getClass().getName());
		System.out.println("--------------------------------------------------------");
		
		System.out.println(alonCollection.getPhoneNo());
		System.err.println(alonCollection.getPhoneNo().getClass().getName());
		System.out.println("---------------------------------------------------------");
		
		System.out.println(alonCollection.getAge());
		System.out.println(alonCollection.getAge().getClass().getName());
		System.out.println("---------------------------------------------------------");
		
		System.out.println(alonCollection.getProps());
	}
	

}
