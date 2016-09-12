package edu.sjsu.collections;

import java.util.*;

public class ItemDetailRetrievalSystem {
	
	public static Item getProdDetails(ItemDetailManagement itmDetmng, Scanner user_ip)
	{
		
		System.out.println("Add Product Name : ");
		String itmName = user_ip.nextLine();
		System.out.println("Add Product Category : ");
		String itmCategory = user_ip.nextLine();
		System.out.println("Add Product Price : ");
		double itmPrice = Double.parseDouble(user_ip.nextLine());
		System.out.println("Discount offered % : ");
		double itmdiscPercent = Double.parseDouble(user_ip.nextLine());
		System.out.println("Add Tax % : ");
		double itmTaxPercent= Double.parseDouble(user_ip.nextLine());
		Item itmNew = itmDetmng.createItem(itmName, itmCategory, itmPrice, itmdiscPercent, itmTaxPercent);
		return itmNew;
	}
	

	public static void main(String[] args) {
		
		
		ItemDetailManagement itmDetmng = new ItemDetailManagement();
		Scanner user_ip = new Scanner(System.in);
		
		System.out.println("Product Details Retrieval System");
			
		String ip ="";
		do
		{
			System.out.println("Select Role : \n1. Admin\n2. Customer");
			ip = user_ip.nextLine();
			switch(Integer.valueOf(ip))
			{
				case 1:
					ip ="";
					boolean admFlg=false;
					int count = 0;
					do
					{
						if(count == 0)
						{
							System.out.println("Do you want to add a product");
							ip = user_ip.nextLine();
						}
					
						if(ip.equals("yes")||ip.equals("Yes")||ip.equals("Y")||ip.equals("y"))
						{
							ip="";
							admFlg=true;
							System.out.println("Add Product Key");
							String itmKey = user_ip.nextLine();
							itmDetmng.addItems(itmKey, getProdDetails(itmDetmng,user_ip));
						}
						if(admFlg)
						{
							System.out.println("Do you want to add another product(Y/N)");
							ip = user_ip.nextLine();
							++count;
						}
					}while(ip.equals("yes")||ip.equals("Yes")||ip.equals("Y")||ip.equals("y"));
					break;
				case 2:
					ip="";
					itmDetmng.addDummyItems();
					do
					{
						int count1 = 0;
						if (count1 == 0)
						{
							System.out.println("Do you want to view product Details");
							ip = user_ip.nextLine();
							++count1;
						}
					
						if(ip.equals("yes")||ip.equals("Yes")||ip.equals("Y")||ip.equals("y"))
						{
							System.out.println("Enter Product key : ");
							String itmKey = user_ip.nextLine();
							Item itmRet = itmDetmng.viwProductDetails(itmKey);
							if(itmRet != null)
							{
								System.out.println(itmRet);
							}
							else
							{
								System.out.println("Search other items");
							}
						}
						System.out.println("Do you want to Continue");
						ip = user_ip.nextLine();
					}while(ip.equals("yes")||ip.equals("Yes")||ip.equals("Y")||ip.equals("y"));
					break;
				default:
					System.out.println("Selected the wrong option");
					break;
			}
			ip="";
			System.out.println("Do you want to Continue");
			ip = user_ip.nextLine();
		}while(ip.equals("yes")||ip.equals("Yes")||ip.equals("Y")||ip.equals("y"));
		
		
		
		
		
		user_ip.close();

		
		
	}
	
}
