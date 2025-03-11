package com.example.spring.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp { 

	@Autowired
	@Qualifier("address1")
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Autowired
	public Emp(@Qualifier("address2") Address address) {
		super();
		this.address = address;
		System.out.println("Settting value Using Constructoe");
	}



	public Address getAddress() {
		return address;
	}

	@Autowired
	@Qualifier("address2")
	public void setAddress(Address address) {
		System.out.println("Setting Value using setter");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
