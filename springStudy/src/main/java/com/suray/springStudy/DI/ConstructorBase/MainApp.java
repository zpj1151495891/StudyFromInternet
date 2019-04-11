package com.suray.springStudy.DI.ConstructorBase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/suray/springStudy/DI/ConstructorBase/Beans.xml");
		TextEditor tx=(TextEditor) context.getBean("TextEditor");
		tx.spellChecker();
		
	}

}
