package com.javabasedconfig;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {
	
	@Bean
	@Scope("prototype")
	Renter renter(){
		Renter renter = new Renter();
		renter.setRenterName("Billy Jean");
		renter.setRentalDate(LocalDate.now());
		//Used the setter methods to purposely autowire the movie dependency
		return renter;
	}
	
	@Bean
	Movie movie(){
		Movie movie = new Movie("Drama","Micheal Jacko",LocalDate.now());
		return movie;
	}
}
