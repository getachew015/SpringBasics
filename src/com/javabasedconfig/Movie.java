package com.javabasedconfig;

import java.time.LocalDate;


public class Movie {
	
	private String genere;
	private String director;
	private LocalDate releaseDate;
	
	public Movie(){
		
	}
	public Movie(String genere, String director, LocalDate releaseDate) {
		super();
		this.genere = genere;
		this.director = director;
		this.releaseDate = releaseDate;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	
}
