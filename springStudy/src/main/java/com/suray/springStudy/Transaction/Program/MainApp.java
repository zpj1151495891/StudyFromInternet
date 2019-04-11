package com.suray.springStudy.Transaction.Program;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/suray/springStudy/Transaction/Program/Beans.xml");
		StudentJDBCTemplate studentJDBCTemplate=(StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
		System.out.println("---------创建记录------------");
		studentJDBCTemplate.create("zara", 13, 98, 2012);
		studentJDBCTemplate.create("kate", 14, 90, 2012);
		studentJDBCTemplate.create("stevin", 15, 93, 2011);
		System.out.println("------列出所有记录");
		List<StudentMarks> studentMarks=studentJDBCTemplate.listStudents();
		for(StudentMarks record:studentMarks) {
			System.out.print("ID:"+record.getId());
			System.out.print(",Sid:"+record.getSid());
			System.out.print(",Name:"+record.getName());
			System.out.print(",Marks:"+record.getMarks());
			System.out.print(",Year:"+record.getYear());
			System.out.println(",Age:"+record.getAge());
		}
	}
}
