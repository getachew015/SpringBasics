package com.beanscope;

public class Book {
	
	private String bookTitle;
	private Author author;
	private double price;
	
	public Book(){
		
	}
	
	public Book(String bookTitle, Author author, double price) {
		super();
		this.bookTitle = bookTitle;
		this.author = author;
		this.price = price;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
