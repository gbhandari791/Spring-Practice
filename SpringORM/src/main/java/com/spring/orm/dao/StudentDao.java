package com.spring.orm.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entity.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	// Create
	@Transactional
	public int insert(Student student) {		
		Integer rs = (Integer) this.hibernateTemplate.save(student);		
		return rs;
	}
	
	// Read
	//Read single row
	public Student getStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	//Read single rows
	public List<Student> getAllStudents() {
		List<Student> all = this.hibernateTemplate.loadAll(Student.class);
		return all;
	}
	
	// Delete
	@Transactional
	public void delete(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	
	//Update
	@Transactional
	public void update(Student student) {
		this.hibernateTemplate.update(student);
	}
}
