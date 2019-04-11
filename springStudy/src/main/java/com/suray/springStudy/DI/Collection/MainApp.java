package com.suray.springStudy.DI.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/suray/springStudy/DI/Collection/Beans.xml");
		JavaCollection jc=(JavaCollection) context.getBean("JavaCollection");
		jc.getAddressList();
		jc.getAddressMap();
		jc.getAddressSet();
		jc.getAddressProp();
		
	}

}
