package edu.sjsu.generics;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.sjsu.generics.BookDescriptor;
import edu.sjsu.generics.BookStore;

public class BookStoreTest {

	@Test
	public void testAddBook() {
		BookStore<String, String> bookStoreString = new BookStore<String,String>();
				
		bookStoreString.addBook("ALCH", "Name : The Alchemist Author : Paulo Coelho Category : Fiction");
		bookStoreString.addBook("SCRB", "Name : The Secret Author : Rhonda Bryne Category : Philosophy");
		bookStoreString.addBook("EMPRMG", "Name : Empire of the Mughals Author : Alex Rutherford Category : History");
		bookStoreString.addBook("ANGD", "Name : Angels and Demons Author : Dan Brown Category : Suspense");
		assertEquals(4, bookStoreString.bkDetails.size());
		
		
		BookDescriptor book1 = new BookDescriptor("Harry Potter","J.K Rowling","Fiction");
		BookDescriptor book2 = new BookDescriptor("The Lord of the Rings","J.R.R Tolkein","Fiction");
		BookDescriptor book3 = new BookDescriptor("The Shiva Triology","Amish Tripati","Mythology");
		BookStore<String, BookDescriptor> bookStoreDescriptor = new BookStore<String, BookDescriptor>();
		bookStoreDescriptor.addBook("101", book1);
		bookStoreDescriptor.addBook("102", book2);
		bookStoreDescriptor.addBook("103", book3);
		
		assertEquals(3, bookStoreDescriptor.bkDetails.size());
	}


	@Test
	public void testFetchBk() {
BookStore<String, String> bookStoreString = new BookStore<String,String>();
		
		bookStoreString.addBook("ALCH", "Name : The Alchemist Author : Paulo Coelho Category : Fiction");
		bookStoreString.addBook("SCRB", "Name : The Secret Author : Rhonda Bryne Category : Philosophy");
		bookStoreString.addBook("EMPRMG", "Name : Empire of the Mughals Author : Alex Rutherford Category : History");
		bookStoreString.addBook("ANGD", "Name : Angels and Demons Author : Dan Brown Category : Suspense");
		assertEquals(true, bookStoreString.fetchBk("EMPRMG"));
	}

}
