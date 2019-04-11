package com.suray.springStudy.AutoWire.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/suray/springStudy/AutoWire/Constructor/Beans.xml");
		TextEditor tx=(TextEditor) context.getBean("TextEditor");
		tx.spellChecker();
	}

}
