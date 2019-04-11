package com.suray.springStudy.JDBC.Base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/suray/springStudy/JDBC/Base/Beans.xml");
		StudentJDBCTemplate studentJDBCTemplate=(StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
		TableModel tableModel=new TableModel("Marks");
		tableModel.setId("SID");
		tableModel.setLimit("primary key(SID)");
		Column column=new Column("MARKS","int");
		Column column1=new Column("YEAR","int");
		column.setIsNull("not null");
		column1.setIsNull("not null");
		List<Column> columnList=new ArrayList<Column>();
		columnList.add(column);
		columnList.add(column1);
		tableModel.setColumnList(columnList);
		studentJDBCTemplate.createTable(tableModel);
		/*System.out.println("-------记录创建-------");
		studentJDBCTemplate.create("zara", 11);
		studentJDBCTemplate.create("nana", 13);
		studentJDBCTemplate.create("ayan", 5);
		System.out.println("-------列出添加的记录----------");
		List<Student> students=studentJDBCTemplate.listStudents();
		for(Student record:students) {
			System.out.print("ID:"+record.getId());
			System.out.print(",Name:"+record.getName());
			System.out.println(",Age:"+record.getAge());
		}
		System.out.println("-------更新记录---------");
		studentJDBCTemplate.update(2, 20);
		System.out.println("-------列出ID为2的记录");
		Student student=studentJDBCTemplate.getStudent(2);
		System.out.print("ID:"+student.getId());
		System.out.print(",Name:"+student.getName());
		System.out.println(",Age:"+student.getAge());*/
	}

}
