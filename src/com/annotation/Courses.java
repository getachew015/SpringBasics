package com.annotation;



public class Courses {
	
	private int creditHour;
	private String courseTitle, courseCode;

	public Courses(){
		
	}
	public Courses(String courseCode, String courseTitle, int creditHour) {
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
	public int getCreditHour() {
		return creditHour;
	}
	public void setCreditHour(int creditHour) {
		this.creditHour = creditHour;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

}
