package edu.sjsu.generics;

public class BookDet<K,V>
{
	
	private K bookId;
	private V bookDescription;
	
	public BookDet()
	{
		this.bookId = null;
		this.bookDescription = null;
	}
	
	public BookDet(K bkId, V bkDescription)
	{
		this.bookId = bkId;
		this.bookDescription = bkDescription;
	}
	
	public K getbkId()
	{
		return this.bookId;
	}
	
	public V getbkDescription()
	{
		return this.bookDescription;
	}
	public void setbkDescription(V bkDescription)
	{
		this.bookDescription = bkDescription;
	}
	public void setbkbkId(K bkId)
	{
		this.bookId = bkId;
	}
	
		
}
