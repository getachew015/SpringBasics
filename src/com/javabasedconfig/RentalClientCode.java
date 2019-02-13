package com.javabasedconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class RentalClientCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Renter renter = (Renter)context.getBean("renter");
		System.out.println("Renter Name - " +renter.getRenterName() +
				"\nRental Date - " +renter.getRentalDate() +
				"\nMovie Director - " +renter.getMovie().getDirector() +
				"\nMovie Genere - " +renter.getMovie().getGenere());
		System.out.println("\nCheck for scope of Bean Renter being @Scope('prototype')");
		Renter renter2 = (Renter)context.getBean("renter");
		renter.setRenterName("Micheal Angelo");
		renter2.setRenterName("Begashaw Ginfile");
		System.out.println("Renter-1 Name - " +renter.getRenterName());
		System.out.println("Renter-2 Name - " +renter2.getRenterName());
		((AbstractApplicationContext)context).close();

	}

}
