package edu.sjsu.interfaces;

import java.util.*;

public class AptLeasingSystem {

	public static void legPldet(Apartment legPl, Scanner user_ip)
	{
		System.out.println("Apartment Details");
		if(!legPl.getaptAvlFlag()){
			System.out.println("!!! The Apartment is booked but You can view the details !!!");
		}
		System.out.println(legPl);
		System.out.println("Enter your monthly Income");
		int mnthlyInc = Integer.valueOf(user_ip.nextLine());
		System.out.println("Do you have a SSN");
		String ip = user_ip.nextLine();
		System.out.println("Checking if you are eligible to lease this apartment");
		boolean eligible = legPl.generateLeaseClause(legPl.getaptRent(), mnthlyInc,ip );
		if(eligible)
		{
			System.out.println("\nYou are eligible to book this Apartment");
			aptManagement(legPl,user_ip);
			if(legPl.getaptAvlFlag())
			{
				System.out.println("Do you want to book this Apartment");
				ip = user_ip.nextLine();
				if (ip.equals("yes")|| ip.equals("Yes")||ip.equals("y")||ip.equals("Y"))
				{
					System.out.println("Enter Credit Card Details");
					String creditNumber = user_ip.nextLine();
					boolean booked = legPl.signLeaseDoc(creditNumber);
					if(booked)
					{
						System.out.println("Apartment has been booked!!");
						System.out.println("Complete the next Steps!!");
						legPl.setaptAvlFlag(false);
					}
				}
			}
			else
			{
				System.out.println("!!!You are eligible to book this Apartment but it is already booked!!!");
			}
		}
		else
		{
			System.out.println("You are not  eligible to book this Apartment!!");
		}
	}
	
	public static void vilTordet(Apartment vilTor, Scanner user_ip)
	{
		System.out.println("Apartment Details");
		if(!vilTor.getaptAvlFlag()){
			System.out.println("!!! The Apartment is booked but You can view the details !!!");
		}
		System.out.println(vilTor);
		System.out.println("Enter your monthly Income");
		int mnthlyInc = Integer.valueOf(user_ip.nextLine());
		String ip = "NA";
		System.out.println("Checking if you are eligible to lease this apartment");
		boolean eligible = vilTor.generateLeaseClause(vilTor.getaptRent(), mnthlyInc,ip);
		if(eligible)
		{
			System.out.println("\nYou are eligible to book this Apartment");
			aptManagement(vilTor,user_ip);
			if(vilTor.getaptAvlFlag())
			{
				System.out.println("Do you want to book this Apartment");
				ip = user_ip.nextLine();
				if (ip.equals("yes")|| ip.equals("Yes")||ip.equals("y")||ip.equals("Y"))
				{
					System.out.println("Enter Credit Card Details");
					String creditNumber = user_ip.nextLine();
					boolean booked = vilTor.signLeaseDoc(creditNumber);
					if(booked)
					{
						System.out.println("Apartment has been booked!!");
						System.out.println("Complete the next Steps!!");
						vilTor.setaptAvlFlag(false);
					}
				}
			}
			else
			{
				System.out.println("!!!You are eligible to book this Apartment but it is already booked!!!");
			}
		}
		else
		{
			System.out.println("You are not  eligible to book this Apartment!!");
		}
	}
	
	public static void sanFer(Apartment sanFer, Scanner user_ip)
	{
		System.out.println("Apartment Details");
		if(!sanFer.getaptAvlFlag()){
			System.out.println("!!! The Apartment is booked but You can view the details !!!");
		}
		System.out.println(sanFer);
		System.out.println("Enter your Avg rent of your previous Apartments");
		int mnthlyInc = Integer.valueOf(user_ip.nextLine());
		String ip = "NA";
		System.out.println("Checking if you are eligible to lease this apartment");
		boolean eligible = sanFer.generateLeaseClause(sanFer.getaptRent(), mnthlyInc,ip);
		if(eligible)
		{
			System.out.println("\nYou are eligible to book this Apartment");
			aptManagement(sanFer,user_ip);
			if(sanFer.getaptAvlFlag())
			{
				System.out.println("Do you want to book this Apartment");
				ip = user_ip.nextLine();
				if (ip.equals("yes")|| ip.equals("Yes")||ip.equals("y")||ip.equals("Y"))
				{
					System.out.println("Enter Credit Card Details");
					String creditNumber = user_ip.nextLine();
					boolean booked = sanFer.signLeaseDoc(creditNumber);
					if(booked)
					{
						System.out.println("Apartment has been booked!!");
						System.out.println("Complete the next Steps!!");
						sanFer.setaptAvlFlag(false);
					}
				}
			}
			else
			{
				System.out.println("!!!You are eligible to book this Apartment but it is already booked!!!");
			}
		}
		else
		{
			System.out.println("You are not  eligible to book this Apartment!!");
		}
	}
	
	public static void aptManagement(Apartment apt, Scanner user_ip)
	{
		/*
		 * Calculate Monthly Expense for each person Sharing the apartment
		 */
		System.out.println("\nEnter the no. of people sharing the apartment");
		int persons = Integer.valueOf(user_ip.nextLine());
		
		double avgMnthlyexp = apt.calculateMnthlyexp(persons);
		System.out.println("\nAverage expenditure for "+persons+" persons will be : "+avgMnthlyexp);
		
		/*
		 * Calculate Total rent for respective months
		 */
		System.out.println("\nEnter the months you want to Stay");
		int mnths = Integer.valueOf(user_ip.nextLine());
		int actRent = apt.calculateRentMnths(mnths);
		System.out.println("\nMonthly Rent will be : "+actRent);
		
	}
	
	public static void main (String args[]){
		
		System.out.println("Welcome to Apartment leasing System");
		System.out.println("Following are Our Apartments : ");
		System.out.println("1. 101 San Fernando\n2. Legacy Fountain Plaza\n3. Villa Torino");
		
		Scanner user_ip = new Scanner(System.in);
		String ip ="";
		Apartment sanFer = new aptSanFernando();
		Apartment legPl = new aptLegacyPlaza();
		Apartment vilTor = new aptVillaTorino();
		
		do
		{
			System.out.println("Enter Apartment No. to see Leasing process");
			
			switch(Integer.valueOf(user_ip.nextLine()))
			{
			case 1:
				sanFer(sanFer,user_ip);
				break;
			case 2:
				legPldet(legPl,user_ip);
				break;
			case 3: 
				vilTordet(vilTor,user_ip);
				break;
			default:
				System.out.println("You have entered the wrong option");
				break;
			}
			System.out.println("Do you want to browse other apartments");
			
			ip = user_ip.nextLine();
		}while(ip.equals("yes")||ip.equals("Yes")||ip.equals("Y")||ip.equals("y"));
		
		
		user_ip.close();
	}
	
}
