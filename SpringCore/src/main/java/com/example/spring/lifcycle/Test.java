package com.example.spring.lifcycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/example/spring/lifcycle/beanlifecycle.xml");
		LifeCycleBean bean = (LifeCycleBean) applicationContext.getBean("bean1");
		System.out.println(bean);
		
		// To call destroy method using registerShutdownHook() which is prsent in AbstractApplicationContext interface.
		applicationContext.registerShutdownHook();
	}
	
	
}	
