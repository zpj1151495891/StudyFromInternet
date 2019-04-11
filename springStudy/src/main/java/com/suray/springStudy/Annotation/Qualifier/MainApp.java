package com.suray.springStudy.Annotation.Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/suray/springStudy/Annotation/Qualifier/Beans.xml");
		Profile profile =(Profile) context.getBean("Profile");
		profile.printAge();
		profile.printName();
	}

}
