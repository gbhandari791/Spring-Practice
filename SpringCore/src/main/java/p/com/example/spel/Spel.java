package p.com.example.spel;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spel {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("p/com/example/spel/config.xml");
		TestBean bean = context.getBean("testBean", TestBean.class);
		System.out.println(bean);
		System.out.println(bean.getUtil().getMsg());
	}
}
