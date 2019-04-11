package com.suray.springStudy.Transaction.Declare;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDao{
	
	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
	}
	
	@Override
	public void create(String name, Integer age, Integer marks, Integer year) {
		try {
			String SQL1="insert into Student(name,age)values(?,?)";
			jdbcTemplateObject.update(SQL1,name,age);
			String SQL2="select max(id) from Student";
			int sid=jdbcTemplateObject.queryForObject(SQL2, Integer.class);
			String SQL3="insert into Marks(sid,marks,year)values(?,?,?)";
			jdbcTemplateObject.update(SQL3,sid,marks,year);
			System.out.println("Create Name="+name+", Age="+age);
			throw new RuntimeException("simulate error condition");	
		}
		catch(DataAccessException e) {
			System.out.println("error in create record,rolling back");
			throw e;
		}
	}
	
	@Override
	public List<StudentMarks> listStudents() {
		String SQL="select * from Student,Marks where Student.id=Marks.sid";
		List<StudentMarks> studentMarks=jdbcTemplateObject.query(SQL,new StudentMarksMapper());
		return studentMarks;
	}
	

}
