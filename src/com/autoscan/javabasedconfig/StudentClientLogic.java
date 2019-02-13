package com.autoscan.javabasedconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class StudentClientLogic {

	public static void main(String[] args) {
		//This package contains a java based spring configuration with auto-scan mode
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Student student = (Student)context.getBean("student");
		System.out.println("Student Name - " +student.getStudentName() +
				"\nStudent Id - " +student.getStudentId() +
				"\nStudent Address - " +student.getAddress().toString() +
				"\nStudent Course - " +student.getCourse().toString());
		Student student2 = (Student)context.getBean("student");
		System.out.println("\nChecking for Bean scope using '@prototype' Scope");
		student2.setStudentName("Tedd Mosby");
		System.out.println("Student-1 Name - "+student.getStudentName());
		System.out.println("Student-2 Name - "+student2.getStudentName());
		((AbstractApplicationContext)context).close();

	}

}
