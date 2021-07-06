package com.springWeb.Controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springWeb.Exception.SpringException;

//设置全局异常监控，现有配置文件配置全局，则这项配置不需使用
@ControllerAdvice
public class AdviceExceptionController {
	@ExceptionHandler(SpringException.class)
	@ResponseBody
	public void runException(SpringException e) {
		e.printStackTrace();
		throw new SpringException("some wrong is happen:"+e.toString());
		
	}
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public void exception(Exception e) throws Exception  {
		e.printStackTrace();
		throw new Exception(e);
	} 
}
