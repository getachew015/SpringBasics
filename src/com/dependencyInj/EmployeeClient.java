package com.dependencyInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* The two ways to achieve Dependency Injection
  	Constructor Injection - achieved when the container invokes parameterized constructor to initialize the properties of a class.
 	 . Container uses parameterized constructor to initialize the properties	 
 	 . Need parameterized constructor in POJO  class
 	 . <constructor-arg> tag is used in  configuration file	
 	 . <constructor-arg> tag “ref” attribute is  used to provide dependency for Object type	  	

	Setter Injection - achieved when the container invokes setter methods of a class to initialize the properties after invoking a default constructor.
	 . Container uses the default constructor followed by calls to the setter methods to initialize the properties
	 . Need default constructor and setter  methods in  POJO class
	 . <property> tag is used in configuration file
	 . <property> tag “ref” attribute is used to provide dependency for Object type
 */

public class EmployeeClient {
	
	public void empListByConstructor(){
		//BTW the magic is happening in config.xml just fyi
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee)context.getBean("employeeByConstructer");
		System.out.println("ID - "+emp.getEmpId() +
				"\nName " + emp.getEmpName() +
				"\nAddress " + ((Address)emp.getAddress()).getCity() +
				"\nSalary " + emp.getSalary());
		((AbstractApplicationContext) context).close();
	}

	public void empListBySetter(){
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee)context.getBean("employeeBySetter");
		System.out.println("ID - "+emp.getEmpId() +
				"\nName " + emp.getEmpName() +
				"\nAddress " + ((Address)emp.getAddress()).getCity() +
				"\nSalary " + emp.getSalary());
		((AbstractApplicationContext) context).close();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeClient client = new EmployeeClient();
		client.empListByConstructor();
		client.empListBySetter();
	}

}
