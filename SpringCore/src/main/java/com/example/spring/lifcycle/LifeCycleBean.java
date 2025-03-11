package com.example.spring.lifcycle;

public class LifeCycleBean {

	private String var;

	
	public LifeCycleBean() {		
		super();
		System.out.println("Createing Object Using default construtor");
	}

	public LifeCycleBean(String var) {
		super();
		this.var = var;
	}

	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
		System.out.println("Setting Var");
	}

	@Override
	public String toString() {
		return "LifeCycleBean [var=" + var + "]";
	}
	
	public void init() {
		System.out.println("Inside init() method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy() method");
	}
}
