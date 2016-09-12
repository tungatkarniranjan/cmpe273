package edu.sjsu.interfaces;



public class aptVillaTorino extends Apartment {

	aptVillaTorino()
	{
		this.aptRent = 3167;
		this.aptAddress = "29/39 West Julian Street, San Jose, CA 95110";
		this.aptArea = 1225;
		this.aptRating = 4.6;
		this.aptAvlFlag = true;
	}
	
	
	public boolean generateLeaseClause(int rent, int mnthlyInc, String ssn)
	{
		System.out.println("Gurantor Leasing Procedure");
		System.out.println("Clauses : ");
		System.out.println("1. Renter will have to deposit $800 - $3500 as deposit.");
		System.out.println("2. This deposit will be decided on your Income.");

		if(mnthlyInc < 3500)
			System.out.println("-->Your deposit will be 1 month rent : "+rent+" as your Income is < 3500");
		else if(mnthlyInc <= 6000)
			System.out.println("-->Your deposit will be : "+(rent-1000)+" as your Income is < 6000");
		else if(mnthlyInc > 6000)
			System.out.println("-->Your deposit will be : "+(rent-1000)+" as your Income is > 6000");

		System.out.println("3. Renter does not need to have Social Security Deposit.");
		System.out.println("4. Alongwith Deposit Renter will have to produce a Gurantor");
		System.out.println("5. Montly income of the gurantor should be 2 times the monthtly rent");
		System.out.println("6. No income restriction on the Renter.");
		return true;

	}
	
	/*Displays the methods of signing the lease
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
			System.out.println("--> Only $42 Application fee will be deducted from your credit Card");
			System.out.println("--> Payment Successful");
			System.out.println("3. RenterVerify agency will do your background verification");
			System.out.println("4. After verification Renter will have to personally come to leasing office to sign the lease.");
			this.setaptAvlFlag(false);
			return true;
		}
	}
}
