package com.suray.springStudy.JDBC.Base;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDao {
	
	public void createTable(TableModel tableModel);
	public void setDataSource(DataSource ds) ;
	public void create(String name,Integer age);
	public Student getStudent(Integer id);
	public List<Student> listStudents();
	public void delete(Integer id);
	public void update(Integer id ,Integer age);
	
}
