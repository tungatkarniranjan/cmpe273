package edu.sjsu.generics;

import java.util.ArrayList;

public class BookStore<K,V> {

	ArrayList<BookDet<K,V>> bkDetails = new ArrayList<BookDet<K, V>>();
	
	public int addBook(K key, V bkDescription)
	{
		this.bkDetails.add(new BookDet<K, V>(key,bkDescription));
		return bkDetails.size();
	}
	
	public void dispBooks()
	{
		for(int i = 0; i < bkDetails.size(); i++)
		{
			System.out.println("Book Key : "+bkDetails.get(i).getbkId());
			System.out.println("Description : \n"+bkDetails.get(i).getbkDescription());
			System.out.println();
		}
	}
	
	public boolean fetchBk(K key)
	{
		boolean bkprFlg = false;
		for(int i = 0; i<bkDetails.size();i++)
		{
			if(bkDetails.get(i).getbkId().equals(key))
			{
				bkprFlg = true;
				System.out.println(bkDetails.get(i).getbkDescription());
				break;
			}
			else
			{
				continue;
			}
		}
		if(!bkprFlg)
		{
			System.out.println("Book Not Found");
			return false;
		}
		else
			return true;
		
	}
}
