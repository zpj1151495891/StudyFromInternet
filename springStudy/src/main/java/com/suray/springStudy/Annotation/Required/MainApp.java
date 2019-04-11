package com.suray.springStudy.Annotation.Required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/suray/springStudy/Annotation/Required/Beans.xml");
		Student student=(Student) context.getBean("Student");
		System.out.println("the student name :"+student.getName());
		System.out.println("the student age:"+student.getAge());
	}

}
