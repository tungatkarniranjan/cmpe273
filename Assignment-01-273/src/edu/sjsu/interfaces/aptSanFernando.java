package edu.sjsu.interfaces;

public class aptSanFernando extends Apartment {
	
	aptSanFernando()
	{
		this.aptRent = 3400;
		this.aptAddress = "101 San Fernando Street, San Jose, CA 95112";
		this.aptArea = 1200;
		this.aptRating = 3.8;
		this.aptAvlFlag = true;
	}

	
	public boolean generateLeaseClause(int rent, int prevRent, String ssn)
	{
		System.out.println("Deposit Leasing Procedure");
		System.out.println("Clauses : ");
		System.out.println("1. Renter will have to deposit $800 - $3500 as deposit.");
		System.out.println("2. This deposit will be decided on your previous leasing history.");
		if(prevRent>0)
		{
			if(prevRent>rent)
			{
				System.out.println("-->Your deposit will be  : $800 as you have sufficient leasing history");
			}
			else if(prevRent<=rent-1000)
			{
				System.out.println("-->Your deposit will be  : $1500");
			}
			else if(prevRent<=rent)
			{
				System.out.println("-->Your deposit will be  : $1000");
			}
			
			System.out.println("Next Clauses : ");
			System.out.println("3. Renter does not need to have Social Security Deposit.");
			System.out.println("4. No gurantor required.");
			System.out.println("5. No income restriction.");
			return true;

		}
		else
		{
			System.out.println("You do not have any previous Leasing history");
			System.out.println("You do not fulfil the Leasing criteria!!!!");
			return false;
		}
		
	
	}
	
	/*
	 * Display the methods in which lease can be signed
	 * (non-Javadoc)
	 * @see Interfaces.LeasingProcess#signLeaseDoc()
	 */
	public boolean signLeaseDoc(String CreditNumber)
	{
		System.out.println("Digital signing of Lease");
		System.out.println("1. Renter has to apply online for booking and holding the apartment.");
		System.out.println("1. Renter has to pay $42 + Deposit mentioned above to book the apartment.");
		if(CreditNumber.length() != 16)
		{
			System.out.println("--> Credit Card Number is not Valid");
			return false;
		}
		else
		{	
			System.out.println("--> Payment Successful");
			System.out.println("4. After verification digital lease will be emailed to Renter's verified email address");
			return true;
		}
			
	}
}
