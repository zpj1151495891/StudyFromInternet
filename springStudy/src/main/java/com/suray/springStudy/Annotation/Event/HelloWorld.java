package com.suray.springStudy.Annotation.Event;

public class HelloWorld {
	private String message;
	
	public void setMessage(String message) {
		this.message=message;
	}
	public void getMessage() {
		System.out.println("your message:"+message);
	}

}
