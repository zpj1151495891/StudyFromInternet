package com.suray.springStudy.IoC.PostManage;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

public class InitHelloWorld implements BeanPostProcessor{
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeforeInitialization:"+beanName);
		((HelloWorld)bean).getMessage();
		((HelloWorld)bean).setMessage("come here");
		return bean;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization:"+beanName);
		((HelloWorld)bean).getMessage();
		return bean;
	}
	

}
