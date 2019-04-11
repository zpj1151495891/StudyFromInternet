package com.suray.springStudy.Transaction.Program;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class StudentJDBCTemplate implements StudentDao{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	private PlatformTransactionManager transactionManager;
	
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
	}
	
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager=transactionManager;
	}
	
	@Override
	public void create(String name,Integer age,Integer marks,Integer year) {
		DefaultTransactionDefinition def=new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		def.setIsolationLevel(TransactionDefinition.ISOLATION_SERIALIZABLE);
		TransactionStatus status=transactionManager.getTransaction(def);
		try {
			String SQL1=" insert into Student(name,age) values(?,?)";
			jdbcTemplateObject.update(SQL1,name,age);
			String SQL2="select max(id) from Student";
			int sid=jdbcTemplateObject.queryForObject(SQL2, Integer.class);
			String SQL3="insert into Marks(SID,MARKS,YEAR)values(?,?,?)";
			jdbcTemplateObject.update(SQL3, sid, marks,year);
			System.out.println("Create name="+name+" ,age="+age);
			transactionManager.commit(status);
		}
		catch(DataAccessException es) {
			System.out.println("error in create record,rolling back");
			transactionManager.rollback(status);
			throw es;
		}
	}
	@Override
	public List<StudentMarks> listStudents(){
		String SQL="select * from Student,Marks where Student.id=Marks.sid";
		List<StudentMarks> studentMarks=jdbcTemplateObject.query(SQL,new StudentMarksMapper());
		return studentMarks;
	}
	

}
