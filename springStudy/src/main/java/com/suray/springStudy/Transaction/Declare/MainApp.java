package com.suray.springStudy.Transaction.Declare;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/suray/springStudy/Transaction/Declare/Beans.xml");
		StudentDao studentJDBCTemplate=(StudentDao) context.getBean("studentJDBCTemplate");
		System.out.println("-------创建记录-------------");
		studentJDBCTemplate.create("linda", 21, 87, 1997);
		studentJDBCTemplate.create("marlin", 22, 86, 1996);
		studentJDBCTemplate.create("selina", 20, 90, 1995);
		System.out.println("---------列出记录---------------");
		List<StudentMarks> studentMarks=studentJDBCTemplate.listStudents();
		for(StudentMarks record:studentMarks) {
	         System.out.print("ID : " + record.getId() );
	         System.out.print("SID:"+record.getSid());
	         System.out.print(", Name : " + record.getName() );
	         System.out.print(", Marks : " + record.getMarks());
	         System.out.print(", Year : " + record.getYear());
	         System.out.println(", Age : " + record.getAge());
		}
	}

}
