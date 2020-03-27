package com.cognizant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;



	public String create(Student s) {

		int row = jdbcTemplate.update("INSERT INTO STUDENT VALUES(?, ?, ?)", s.getId(), s.getName());

		if (row > 0)

			return "Success";

		return "Fail";

	}



	public String update(Student s) {

		int row = jdbcTemplate.update("UPDATE STUDENT SET name=? WHERE id=?", s.getName(), s.getId());

		if (row > 0)

			return "Success";

		return "Fail";

	}

	

	public String delete(Student s) {

		int row = jdbcTemplate.update("DELETE FROM STUDENT WHERE id=?", s.getId());

		if (row > 0)

			return "Success";

		return "Fail";
	}

	public List<Student> getAll() {

		List<Student> students = jdbcTemplate.query("SELECT * FROM STUDENT", new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

				Student student = new Student();

				student.setId(rs.getInt("id"));

				student.setName(rs.getString("name"));


				return student;

			}});

		return students;

	}


}