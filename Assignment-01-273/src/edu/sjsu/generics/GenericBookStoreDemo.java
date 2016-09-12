package edu.sjsu.generics;
import java.util.*;

public class GenericBookStoreDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookStore<String, String> bookStoreString = new BookStore<String,String>();
		BookStore<String, BookDescriptor> bookStoreDescriptor = new BookStore<String,BookDescriptor>();
		
		
		Scanner user_ip = new Scanner(System.in);
		String ip = "";
		System.out.println("Generics Demo");
		System.out.println("Following books are added in GenericBookStore<String, String> bkStore by addBook method");
		bookStoreString.addBook("ALCH", "Name : The Alchemist Author : Paulo Coelho Category : Fiction");
		bookStoreString.addBook("SCRB", "Name : The Secret Author : Rhonda Bryne Category : Philosophy");
		bookStoreString.addBook("EMPRMG", "Name : Empire of the Mughals Author : Alex Rutherford Category : History");
		bookStoreString.addBook("ANGD", "Name : Angels and Demons Author : Dan Brown Category : Suspense");
		
		bookStoreString.dispBooks();
		System.out.println("Enter any of the above keys to lookup its details");
		ip = user_ip.nextLine();
		bookStoreString.fetchBk(ip);
		
		do
		{
			System.out.println("Do you want to enter any books");
			ip = user_ip.nextLine();
			if(ip.equals("yes")||ip.equals("Yes")||ip.equals("Y")||ip.equals("y"))
			{
				System.out.println("Enter Book Key : ");
				String bkKey = user_ip.nextLine();
				System.out.println("Enter Book Name : ");
				String bkName = user_ip.nextLine();
				System.out.println("Enter Book Author : ");
				String bkAuthor = user_ip.nextLine();
				System.out.println("Enter Book Category : ");
				String bkCategory = user_ip.nextLine();
				BookDescriptor book = new BookDescriptor(bkName,bkAuthor,bkCategory);
				bookStoreDescriptor.addBook(bkKey, book);
				bookStoreDescriptor.fetchBk(bkKey);
			}
			System.out.println("Do you wish to continue(Y/N)");
			ip = user_ip.nextLine();
		}while(ip.equals("yes")||ip.equals("Yes")||ip.equals("Y")||ip.equals("y"));
				
		user_ip.close();
	}

}
