package edu.sjsu.interfaces;


public class Apartment implements LeasingProcess {
	
	protected int aptArea;
	protected String aptAddress;
	protected int aptRent;
	protected double aptRating;
	protected boolean aptAvlFlag = true;
	
	
	/*
	 * Setter methods

	 */
	public void setaptArea(int aptArea)
	{
		this.aptArea = aptArea;
	}
	
	public void setaptAddress(String aptAddress)
	{
		this.aptAddress = aptAddress;
	}
	
	
	public void setaptRent(int aptRent)
	{
		this.aptRent = aptRent;
	}
	
	public void setaptRating(float aptRating)
	{
		this.aptRating = aptRating;
	}
	
	public void setaptAvlFlag(boolean flg)
	{
		this.aptAvlFlag = flg;
	}	
	/*
	 * Getter methods
	 */

	public int getaptArea()
	{
		return this.aptArea;
	}
	
	public String getaptAddress()
	{
		return this.aptAddress;
	}
	
	
	public int getaptRent()
	{
		return this.aptRent;
	}
	
	public double getaptRating()
	{
		return this.aptRating;
	}
	
	

	public double  calculateMnthlyexp(int persons)
	{
		double avgMnthlyexp =0.0;
		System.out.println("Average monthly expenditure on Water : $20");
		System.out.println("Average monthly expenditure on Electricity : $25");
		System.out.println("Average monthly expenditure on Garbage : $60");
		System.out.println("Average monthly expenditure on Internet : $60");
		if(persons > 0)
			avgMnthlyexp = (this.aptRent+20+25+60+60)/persons;
		else
			System.out.println("Enter Valid Data");
			
		return avgMnthlyexp;
	}
	

	public int calculateRentMnths(int mnths)
	{
		int actRent = 0; 
		if (mnths > 0 )
			actRent = this.aptRent*mnths;
		else
			System.out.println("Enter Valid Data");
		return actRent;
		
	}
	
	public boolean getaptAvlFlag()
	{
		return this.aptAvlFlag;
	}		
	
	public String toString()
	{
		return "Area : "+this.aptArea+"\nRent : "+this.aptRent+"\nLocation : "+this.aptAddress+"\nRating : "+this.aptRating; 
	}
		


	/*
	 * Methods of LeasingProcess Interface
	 */
	public boolean generateLeaseClause(int rent, int mnthlyInc, String ssn)
	{
		System.out.println("Will be implemented by the sub-classes");
		return true;
	}
	
	/*Displays the methods of signing the lease
	 * (non-Javadoc)
	 * @see Interfaces.LeasingProcess#signLeaseDoc()
	 */
	public boolean signLeaseDoc(String CreditNumber)
	{
		System.out.println("Will be implemented by the sub-classes");
		return true;
	}
}
