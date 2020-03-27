package com.cognizant.dao;

import java.util.List;

import com.cognizant.model.Student;

public interface StudentDao {

	public String create(Student s);
	
	public String delete(Student s);
	
	public String update(Student s);
	
	public List<Student> getAll();
	
}
