package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entity.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int insert(Student student) {
		String sql = "Insert into student (id, name, city) values(?, ?, ?)";  
		int update = jdbcTemplate.update(sql, student.getId(), student.getName(), student.getCity());
		return update;
	}

	

	@Override
	public int update(Student student) {
		String sql = "UPDATE student set name = ?, city = ? where id = ?";
		int update = jdbcTemplate.update(sql, student.getName(), student.getCity(), student.getId());
		System.out.println("Record Updated!");
		return update;
	}

	@Override
	public void delete(int  id) {
		
		String sql = "Delete from student where id = ?";
		int update = jdbcTemplate.update(sql, id);
		String msg = update == 1? ("Record(s) deleted : " + update) : "Failed to delete the record";
		System.out.println(msg);
	}

	@Override
	public Student getStudent(int id) {
		String sql = "Select * from student where id = ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		String sql = "Select * from student";
		List<Student> students = this.jdbcTemplate.query(sql, new RowMapperImpl());
		return students;
	}

	
}
