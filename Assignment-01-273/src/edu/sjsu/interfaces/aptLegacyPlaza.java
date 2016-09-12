package edu.sjsu.interfaces;



public class aptLegacyPlaza extends Apartment {

	aptLegacyPlaza()
	{
		this.aptRent = 2900;
		this.aptAddress = "190 Ryland Street, San Jose, CA 95110";
		this.aptArea = 1100;
		this.aptRating = 4.2;
		this.aptAvlFlag = true;
	}
	public boolean generateLeaseClause(int rent,int mnthlyInc, String ip)
	{
		
		System.out.println("SSN/Income Leasing Procedure");
		System.out.println("Clauses : ");
		System.out.println("1. Renter will have to deposit $500 as deposit.");
		System.out.println("2. Renter needs to have a Social Security Number.");
		if (ip.equals("yes")||ip.equals("Yes")||ip.equals("Y")||ip.equals("y"))
		{
			
			System.out.println("3. Renter's income should be 3 times the monthly rent.");
			if((rent*3) <= mnthlyInc)
			{
				System.out.println("You fulfil all the leasing criteria!!!");
				return true;
			}
			else
			{
				System.out.println("You do not fulfil the leasing criteria");	
				System.out.println("Please have a look at our other apartments");
				return false;
			}
		}
		else
		{
			System.out.println("Sorry, you need to have a SSN number to lease this apartment!!");
			System.out.println("Please have a look at our other apartments");
			return false;
		}
	}

	/*Method displays the ways of signing the lease
	 * (non-Javadoc)
	 * @see Interfaces.LeasingProcess#signLeaseDoc()
	 */
	public boolean signLeaseDoc(String CreditNumber)
	{
		System.out.println("Manual signing of Lease");
		System.out.println("1. Renter has to apply online for booking and holding the apartment.");
		if(CreditNumber.length() != 16)
		{
			System.out.println("--> Credit Card Number is not Valid");
			return false;
		}
		else
		{
			System.out.println("--> $42 and $91 Application fee will be deducted from your credit Card");
			System.out.println("--> Payment Successful");
			System.out.println("3. Renter verification will be done after he/she has booked the apartment.");
			System.out.println("4. After verification Renter will have to personally come to leasing office to sign the lease.");
			this.setaptAvlFlag(false);
			return true;
		}
		
	}
}
