package com.suray.springStudy.AOP.AspectJ;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class Logging {
	//注意:execution(*空格com......    空格不可缺少
	@Pointcut("execution(* com.suray.springStudy.AOP.AspectJ.*.*(..))")
	private void selectAll() {}
	@Pointcut("execution(* com.suray.springStudy.AOP.AspectJ.Student.getAge(..))")
	private void select() {}
	@Before("selectAll()")
	public void beforeAdvice() {
		System.out.println("Going to setup student profile.");
	}
	@After("selectAll()")
	public void afterAdvice() {
		System.out.println("student profile has been setup.");
	}
	@AfterReturning(pointcut="selectAll()",returning="retVal")
	public void afterReturningAdvice(Object retVal) {
		System.out.println("Returning:"+retVal.toString());
	}
	@AfterThrowing(pointcut="selectAll()",throwing="ex")
	public void AfterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("There has been an exception:"+ex.toString());
	}
	@Before("select()")
	public void advice() {
		System.out.println("实例化之前");
	}
}
