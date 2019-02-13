package com.autoscan.javabasedconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	
	@Value("CS4012")
	private String courseCode;
	@Value("Machine Learning")
	private String courseTitle;
	@Value("3")
	private int creditHour;
	
	public Course(){
		
	}
	public Course(String courseCode, String courseTitle, int creditHour) {
		super();
		this.courseCode = courseCode;
		this.courseTitle = courseTitle;
		this.creditHour = creditHour;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public int getCreditHour() {
		return creditHour;
	}
	public void setCreditHour(int creditHour) {
		this.creditHour = creditHour;
	}
	@Override
	public String toString(){
		return (courseCode+" Title: "+ courseTitle + " Credit Hour: " + creditHour);
	}
}
