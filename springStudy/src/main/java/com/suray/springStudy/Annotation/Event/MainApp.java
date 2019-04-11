package com.suray.springStudy.Annotation.Event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("com/suray/springStudy/Annotation/Event/Beans.xml");
		context.start();
		HelloWorld hw=(HelloWorld) context.getBean("HelloWorld");
		hw.getMessage();
		context.stop();
	}

}
