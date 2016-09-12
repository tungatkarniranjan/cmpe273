package edu.sjsu.generics;

public class BookDescriptor {

	private String bkName;
	private String bkAuthor;
	private String bkcategory;
	
	BookDescriptor(String bkName, String bkAuthor, String bkcategory)
	{
		this.bkName = bkName;
		this.bkAuthor = bkAuthor;
		this.bkcategory = bkcategory;
	}
	
	public String getbkName()
	{
		return this.bkName;
	}
	
	public String getbkAuthor()
	{
		return this.bkAuthor;
	}
	
	public String getbkcategory()
	{
		return this.bkcategory;
	}
	
	public String toString()
	{
		String bkDetails = "";
		bkDetails = "Name : "+this.bkName+"\nAuthor : "+this.bkAuthor+"\nCategory : "+this.bkcategory;
		return bkDetails;
	}
}
