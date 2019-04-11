package com.suray.springStudy.JDBC.Base;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDao{
	private JdbcTemplate jdbcTemplateObject;
	@Override
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	@Override
	public void createTable(TableModel tableModel) {
		StringBuffer sql=new StringBuffer("CREATE TABLE "+tableModel.getTableName()+ 
				" (\r\n" + 
				tableModel.getId()+"   INT NOT NULL identity(1,1),\r\n");
		if(tableModel.getColumnList()!=null&&tableModel.getColumnList().size()>0) {
			for(Column column:tableModel.getColumnList()) {
				sql.append(" "+column.getColumnName()+"  "+column.getDataType()+" "+column.getIsNull()+" "+((column.getaLimit()==null)?"":column.getaLimit())+" ,\r\n");
			}
		}
		if(tableModel.getLimit()!=null&&tableModel.getLimit().length()>0) {
			sql.append(" "+tableModel.getLimit()+"\r\n");
		}
		sql.append(");");
		System.out.println(sql);
		jdbcTemplateObject.execute(sql.toString());
		System.out.println("创建表");
	}
	@Override
	public void create(String name, Integer age) {
		String SQL = "insert into Student (name, age) values (?, ?)";     
		jdbcTemplateObject.update( SQL, name, age);
		System.out.println("Created Record Name = " + name + " Age = " + age);
		return;
	}
	@Override
	public Student getStudent(Integer id) {
		String SQL = "select * from Student where id = ?";
		Student student = jdbcTemplateObject.queryForObject(SQL, 
				new Object[]{id}, new StudentMapper());
		return student;
	}
	@Override
	public List<Student> listStudents() {
		String SQL = "select * from Student";
		List <Student> students = jdbcTemplateObject.query(SQL, 
				new StudentMapper());
		return students;
	}
	@Override
	public void delete(Integer id){
		String SQL = "delete from Student where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id );
		return;
	}
	@Override
	public void update(Integer id, Integer age){
		String SQL = "update Student set age = ? where id = ?";
		jdbcTemplateObject.update(SQL, age, id);
		System.out.println("Updated Record with ID = " + id );
		return;
	}

}
