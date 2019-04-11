package com.suray.springStudy.IoC.BeanLife;


public class HelloWorld {
	public void init() throws Exception{
		System.out.println("the bean is init");
	}
	public void destroy() throws Exception{
		System.out.println("the bean is destroy");
	}
	
	private String message;
	public void setMessage(String message) {
		this.message=message;
	}
	public void getMessage() {
		System.out.println("your message:"+message);
	}
}
