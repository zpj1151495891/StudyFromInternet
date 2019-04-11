package com.suray.springStudy.Annotation.EventDefine;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{
	public CustomEvent(Object source) {
		super(source);
	}
	@Override
	public String toString() {
		return "my Custom Event";
	}

}
