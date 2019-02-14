package com.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {
	
	@Value("Curtis Jackson")
	private String name;
	@Value("Prod4587")
	private String empId;
	private double salary;
	@Value("Manager")
	private String role;

	@Autowired
	private Address address;
	
	public Employee(){
		
	}
	public Employee(String name, String empId, Address address) {
		super();
		this.name = name;
		this.empId = empId;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void display(){
		System.out.println("Emp Name - " +getName() +
				"\nEmp Id - "+getEmpId()+
				"\nAddress - ");
		getAddress().display();
	}
	
	public void displayName() throws Exception {
		//This method is to Demonstrate @AfterThrowing advice
		if(getName()==null)
			throw new Exception("Invalid Name ..");
		else
			System.out.println("Employee Name - "+getName());
		
	}
	
	public double calculateSalary(String role){		
		if(role.equalsIgnoreCase("Manager"))
			salary=75000;
		else if(role.equalsIgnoreCase("Engineer"))
			salary=85000;
		else 
			salary=60000;
		
		return salary;
	}

}
