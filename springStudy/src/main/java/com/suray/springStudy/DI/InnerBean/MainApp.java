package com.suray.springStudy.DI.InnerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/suray/springStudy/DI/InnerBean/Beans.xml");
		TextEditor tx=(TextEditor) context.getBean("TextEditor");
		tx.spellChecker();
	}
}
