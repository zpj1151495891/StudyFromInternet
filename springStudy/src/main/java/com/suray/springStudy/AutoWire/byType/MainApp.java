package com.suray.springStudy.AutoWire.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*byType 匹配指bean的属性类型和连接bean的Java类名匹配，并非和ID匹配*/
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/suray/springStudy/AutoWire/byType/Beans.xml");
		TextEditor tx=(TextEditor) context.getBean("TextEditor");
		tx.spellChecker();
	}
}     
