package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entity.Student;

public interface StudentDao {

	public int insert(Student student);
	
	public int update(Student student);
	
	public void delete(int id);
	
	public Student getStudent(int id);
	
	public List<Student> getAllStudent();
}
