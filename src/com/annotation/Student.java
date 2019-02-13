package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String studName;
	private String studId;
	
/*	A reference type/Object can be Autowired or it can be Autowired at the setter Method level
	incase of multiple objects of the same type are defined in the config file we have to specify which
	one to Autowire by using the @Qualifier annotation
*/	
	@Autowired 
	@Qualifier("course1")
	private Courses course;
	
	public Student(){
		
	}
	
	public Student(String studId, String studName, Courses course) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.course = course;
	}
	
	public Courses getCourse() {
		return course;
	}
	/*@Autowired*/
	public void setCourse(Courses course) {
		this.course = course;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudId() {
		return studId;
	}
	public void setStudId(String studId) {
		this.studId = studId;
	}

}