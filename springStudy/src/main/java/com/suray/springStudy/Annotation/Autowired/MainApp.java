package com.suray.springStudy.Annotation.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//autowired注解基于byType
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/suray/springStudy/Annotation/Autowired/Beans.xml");
		TextEditor tx=(TextEditor) context.getBean("TextEditor");
		tx.spellChecker();
	}
}     
