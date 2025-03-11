package com.example.spring.lifcycle.using.annotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Bean {
	
	private String beanStatus;

	public Bean() {
		super();
		System.out.println("Createing object");
	}

	public String getBeanStatus() {
		return beanStatus;
	}

	public void setBeanStatus(String beanStatus) {
		this.beanStatus = beanStatus;
		System.out.println("Setting Vaues");
	}

	@Override
	public String toString() {
		return "Bean [beanStatus=" + beanStatus + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("After Intiaization, init called");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Before distruction, destroy called");
	}
}
