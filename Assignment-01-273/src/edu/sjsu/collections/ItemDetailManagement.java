package edu.sjsu.collections;

import java.util.HashMap;


public class ItemDetailManagement {
	
	HashMap<String,Item> map = new HashMap<String,Item>();
	
	public Item viwProductDetails(String itmKey)
	{
	
		if(map.get(itmKey) == null)
		{
			System.out.println("The product you requested does not exist");
			return null;
		}
		else
		{
			return this.map.get(itmKey);
		}
	}
	
	public void addDummyItems()
	{
		Item itmDummy1 = new Item();
		itmDummy1.setitmName("Home Life Black Study Table");
		itmDummy1.setitmCategory("Furniture");
		itmDummy1.setitmPrice(80.0);
		itmDummy1.setitmdiscPercent(4);
		itmDummy1.setitmTaxPercent(38);
		
		String itmDummy1Key = "HLBST10";
		this.map.put(itmDummy1Key, itmDummy1);
		
		Item itmDummy2 = new Item();
		itmDummy2.setitmName("Beats Surround Sound 5.1 Channel");
		itmDummy2.setitmCategory("Electronics");
		itmDummy2.setitmPrice(199.0);
		itmDummy2.setitmdiscPercent(15);
		itmDummy2.setitmTaxPercent(38);
		String itmDummy2Key = "BSS5C";
		this.map.put(itmDummy2Key, itmDummy2);
		
		Item itmDummy3 = new Item();
		itmDummy3.setitmName("Mapro Mixed Fruit Jam");
		itmDummy3.setitmCategory("Food");
		itmDummy3.setitmPrice(5.0);
		itmDummy3.setitmdiscPercent(0);
		itmDummy3.setitmTaxPercent(10);
		String itmDummy3Key = "MMFJ";
		this.map.put(itmDummy3Key, itmDummy2);
	}
	
	public boolean addItems(String itmKey, Item itmNew)
	{
		if(this.map.containsKey(itmKey))
		{
			System.out.println("This product is already present in the system");
			return false;
		}
		else
		{
			System.out.println("Product Successfully added");
			this.map.put(itmKey,itmNew);
			return true;
		}
		
	}
	
	public Item createItem(String itmName, String itmCategory, double itmPrice, double itmdiscPercent,double itmTaxPercent)
	{
			
		Item itmNew = new Item();
			
		itmNew.setitmName(itmName);
				
		itmNew.setitmCategory(itmCategory);
						
		itmNew.setitmPrice(itmPrice);
				
		itmNew.setitmdiscPercent(itmdiscPercent);
				
		itmNew.setitmTaxPercent(itmTaxPercent);
		
		return itmNew;
	}
}
