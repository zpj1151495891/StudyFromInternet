package com.suray.springStudy.Annotation.EventDefine;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("com/suray/springStudy/Annotation/EventDefine/Beans.xml");
		CustomEventPublisher cvp=(CustomEventPublisher) context.getBean("customEventPublisher");
		cvp.publish();
		cvp.publish();
	}
}