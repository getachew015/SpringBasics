package com.autoscan.javabasedconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student")
@Scope("prototype")
public class Student {
	
	@Value("Sheldon Cooper")
	private String studentName;
	@Value("CS0823")
	private String studentId;
	@Autowired
	private Address address;
	@Autowired
	private Course course;
	
	public Student(){
		
	}
	public Student(String studentName, String studentId, Address address, Course course) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.address = address;
		this.course = course;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}

}
