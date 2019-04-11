package com.suray.springStudy.Annotation.JSR250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
	
	private String message;
	
	public void setMessage(String message) {
		this.message=message;
	}
	public String getMessage() {
		System.out.println("your message:"+message);
		return message;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("bean is going to init");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("bean is going to destroy");
	}
	

}
