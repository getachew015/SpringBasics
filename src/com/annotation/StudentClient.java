package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student = (Student)context.getBean("student");
		System.out.println("Name - " +student.getStudName() +
				"\nStud Id - " +student.getStudId() +
				"\nCourse - " +student.getCourse().getCourseTitle() +
				"\nCredit Hour - " +student.getCourse().getCreditHour() +
				"\nCourse Code - " +student.getCourse().getCourseCode());
		
		((AbstractApplicationContext)context).close();

	}

}
