package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {

		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Employee employee = (Employee)context.getBean("employee");
/*		employee.display();
		System.out.println("*** Aspect AfterReturning Advice is executing for the methods called [getName(), getEmpId()] ***");
		employee.getName();
		employee.getEmpId();
		System.out.println("*** Aspect AfterThrowing Advice is executing ***");
		try {
			employee.setName(null);
			employee.displayName();
		} catch (Exception e) {
//			e.printStackTrace();
		}
*/
		System.out.println("*** Aspect Around Advice is executing ***");
		String role = employee.getRole();
		System.out.println("Employee Role - "+role);
		employee.calculateSalary(role);//invoking the calaculateSalary method will make the @Aroound advice to be executed
		employee.setRole("Engineer");
		role = employee.getRole();
		System.out.println("Employee Role - "+role);
		employee.calculateSalary(role);//invoking the calculateSalary for another role to check on the @Around advice method
		((AbstractApplicationContext)context).close();
		
	}

}
