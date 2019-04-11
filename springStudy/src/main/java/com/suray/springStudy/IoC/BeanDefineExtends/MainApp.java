package com.suray.springStudy.IoC.BeanDefineExtends;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/suray/springStudy/IoC/BeanDefineExtends/Beans.xml");
		HelloWorld hw=(HelloWorld) context.getBean("HelloWorld");
		hw.getMessage1();
		hw.getMessage2();
		HelloIndia hi=(HelloIndia) context.getBean("HelloIndia");
		hi.getMessage1();
		hi.getMessage2();
		hi.getMessage3();
		
	}

}
