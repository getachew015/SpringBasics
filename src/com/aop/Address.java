package com.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("1501 Hawthorne Ave")
	private String street;
	@Value("Minneapolis")
	private String city;
	@Value("MN")
	private String state;
	@Value("55403")
	private String zipCode;
	
	public Address(){
		
	}
	public Address(String street, String city, String state, String zipCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public void display(){
		System.out.println(getStreet()+
				"\n"+getCity() +
				"\n" +getState() +
				", "+getZipCode());
	}
	
}
