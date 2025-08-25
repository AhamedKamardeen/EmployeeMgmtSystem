package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

@Aspect
@Component
public class DemoAspect {
	
	@Before("execution(* com.aop.serviceimpl.EmployeeServiceImpl.getAllEmployee(..))")
	public void beforeCall() {
		System.err.println("BeforAspect");
	}
	
	@After("execution(* com.aop.serviceimpl.EmployeeServiceImpl.*(..))")
	public void afterCall() {
		System.err.println("After Aspect");
	}
	
//	public PlatformTransactionManager

}
