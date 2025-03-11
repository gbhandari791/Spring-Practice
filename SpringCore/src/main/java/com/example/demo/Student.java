package com.example.demo;

public class Student {
	private String studentId;
	private String studentName;
	private String studentAdd;	
	
	public Student() {
		super();
	}
	
	public Student(String studentId, String studentName, String studentAdd) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAdd = studentAdd;
	}

	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		System.err.println("Setting Stident Id" + studentId);
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.err.println("Setting student Name" + studentName);
		this.studentName = studentName;
	}
	public String getStudentAdd() {
		return studentAdd;
	}
	public void setStudentAdd(String studentAdd) {
		System.err.println("Setting student Add" + studentAdd);
		this.studentAdd = studentAdd;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAdd=" + studentAdd + "]";
	}
	
	
}
