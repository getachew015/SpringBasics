package com.autoscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //if no Bean name is given Spring will create Bean using default name of Bean
public class Patient {
	
	@Value("Dagim Getachew")
	private String patientName;
	@Value("kurtimat")
	private String patientCase;
	@Value("58")
	private int age;
	@Autowired
	private Physician physician;

	public Patient(){
		
	}
	public Patient(String patientName, String patientCase, int age, Physician physician) {
		super();
		this.patientName = patientName;
		this.patientCase = patientCase;
		this.age = age;
		this.physician = physician;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientCase() {
		return patientCase;
	}
	public void setPatientCase(String patientCase) {
		this.patientCase = patientCase;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Physician getPhysician() {
		return physician;
	}
	public void setPhysician(Physician physician) {
		this.physician = physician;
	}
	
}
