package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAspect {
	
	//Before Advice: executed before jointpoint execution and will continue with jointpoint execution.
	//After Advice: will be executed after a jointpoint returns with or without throwing an exception.
	//AfterReturning: executed only after a Joinpoint executes and returns successfully without exception.
	//AfterThrowing: executed only when a jointpoint exits by throwing exception.
	//AroundAdvice: has some logic which gets executed before Joinpoint invocation and some logic which gets executed after the Joinpoint returns.
	
	@Around("execution(* com.aop.Employee.calculateSalary(String))")
	public double performanceIncentive(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around Advice : before executing the business logic ");
		Object returnValue = pjp.proceed();//get return value of the calculateSalary method as an object
		double salary = ((Double)returnValue).doubleValue();
		System.out.println("Around Advice : after executing the business logic");
		Object[] object = pjp.getArgs();//getArgs() returns list of arguments passed to the joinpoint method i.e. calculateSalary()
		String role = object[0].toString();
		if(role.equalsIgnoreCase("Manager"))
			salary = salary + (salary*0.25);
		else
			salary = salary + (salary*0.2);
		System.out.println("Incentive is - "+salary);
		return salary;
	}
/*
	@AfterThrowing(pointcut="execution(* com.aop.Employee.displayName(..))", throwing="exception")
	public void afterThrowingAdvice(Exception exception){
		System.out.println(exception);
		
	}
	
	@AfterReturning(pointcut="execution(* com.aop.Employee.get*(..))", returning="returnValue")
	public void afterReturningAdvice(String returnValue){
		System.out.println("Return value in advice - "+returnValue);		
	}

	@Before("execution(* com.aop.Employee.display(..))")
	public void beforeAdvice(){
		System.out.println("*** Aspect Before Advice is executing ***");
	}
	
	@After("execution(* com.aop.Employee.display(..))")
	public void afterAdvice(){
		System.out.println("*** Aspect After Advice is executing ***");
	}
	
*/
}
