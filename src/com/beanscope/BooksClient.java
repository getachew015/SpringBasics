package com.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BooksClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Book book = (Book)context.getBean("book");
		Author author = (Author)context.getBean("author");
		
		
		System.out.println("Book Title - " +book.getBookTitle() +
				"\nBook Price - " + book.getPrice() +
				"\nAuthor Id - " +author.getAuthId() +
				"\nAuthor Name - " +author.getAuthorName() );

		System.out.println("\nTesting Singelton And as you see with scope singleton both Author object will have same name \n");
		Author author2Fake = (Author)context.getBean("author");
		
		author.setAuthorName("One Stupid");
		author2Fake.setAuthorName("Stephen Hawking");
		
		System.out.println("Author-1 Name - "+author.getAuthorName());
		System.out.println("Author-2 Name - " +author2Fake.getAuthorName() );
		
		
		((AbstractApplicationContext)context).close();

	}

}
