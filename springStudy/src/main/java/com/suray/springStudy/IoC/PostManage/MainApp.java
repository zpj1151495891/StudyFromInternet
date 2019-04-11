package com.suray.springStudy.IoC.PostManage;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/suray/springStudy/IoC/PostManage/Beans.xml");
		HelloWorld hw=(HelloWorld) context.getBean("HelloWorld");
		hw.getMessage();
		context.registerShutdownHook();
	}

}
