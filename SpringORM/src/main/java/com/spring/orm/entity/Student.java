package com.spring.orm.entity;

import javax.persistence.*;

@Entity
@Table(name = "student_info")
public class Student {

	@Id
	@Column(name = "student_id")
	private int id;
	@Column(name = "student_name")
	private String name;
	@Column(name = "student_laguage")
	private String laguage;
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, String laguage) {
		super();
		this.id = id;
		this.name = name;
		this.laguage = laguage;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLaguage() {
		return laguage;
	}

	public void setLaguage(String laguage) {
		this.laguage = laguage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", laguage=" + laguage + "]";
	}
	
	
}
