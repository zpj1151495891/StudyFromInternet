package com.suray.springStudy.Annotation.JSR250;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/suray/springStudy/Annotation/JSR250/Beans.xml");
		HelloWorld hw=(HelloWorld) context.getBean("HelloWorld");
		hw.getMessage();
		context.registerShutdownHook();
	}

}
