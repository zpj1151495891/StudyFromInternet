package com.suray.springStudy.Annotation.JavaBase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld hw=(HelloWorld) context.getBean("helloWorld");
		hw.setMessage("hello world!");
		hw.getMessage();
	}

}
