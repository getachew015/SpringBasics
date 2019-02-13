package com.javabasedconfig;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

public class Renter {
	
	private String renterName;
	private LocalDate rentalDate;
	@Autowired
	private Movie movie;
	
	public Renter(){
		
	}
	public Renter(String renterName, LocalDate rentalDate, Movie movie) {
		super();
		this.renterName = renterName;
		this.rentalDate = rentalDate;
		this.movie = movie;
	}
	public String getRenterName() {
		return renterName;
	}
	public void setRenterName(String renterName) {
		this.renterName = renterName;
	}
	public LocalDate getRentalDate() {
		return rentalDate;
	}
	public void setRentalDate(LocalDate rentalDate) {
		this.rentalDate = rentalDate;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

}
