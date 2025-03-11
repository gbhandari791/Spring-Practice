package com.example.spring.autowiring.xml;

public class Address {

	private String add;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Address [add=" + add + "]";
	}
	
	
}
