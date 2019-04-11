package com.suray.springStudy.IoC.BeanLife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/suray/springStudy/IoC/BeanLife/Beans.xml");
		HelloWorld hw=(HelloWorld) context.getBean("HelloWorld");
		hw.setMessage("I'm object A");
		hw.getMessage();
		HelloWorld hw2=(HelloWorld) context.getBean("HelloWorld");
		hw2.getMessage();
		context.registerShutdownHook();
	}

}
