package com.tns.client;

import com.tns.entity.Book;
import com.tns.service.BookService;
import com.tns.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		BookService service = new BookServiceImpl();
		
		System.out.println("**********Listing total number of books**********");
		System.out.println("Total books:"+service.getBookCount());
		
		System.out.println("**********Listing book with id 105**********");
		System.out.println("Book with ID 105:"+service.getBookById(105));
		
		System.out.println("**********Listing all books**********");
		for(Book book:service.getAllBooks()) {
			System.out.println(book);
		}
		
		System.out.println("**********Listing book written by Danny Coward**********");
		for(Book book:service.getAuthorBooks("Danny Coward")) {
			System.out.println(book);
		}
		
		System.out.println("**********Listing book on Andriod**********");
		for(Book book:service.getBookByTitle("Andriod")) {
			System.out.println(book);
		}
		
		System.out.println("**********Listing all books between 500 and 600**********");
		for(Book book:service.getBooksInPriceRange(500, 600)) {
			System.out.println(book);
		}		
	}
}
