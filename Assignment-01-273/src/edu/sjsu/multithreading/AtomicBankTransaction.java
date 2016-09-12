package edu.sjsu.multithreading;

public class AtomicBankTransaction {
	
	double accAmount;
	
	
	public AtomicBankTransaction(double amount)
	{
		this.accAmount = amount;
		
	}

	synchronized public void transact(String transaction, double amount, int tCount)
	{
		System.out.println("Starting Transaction : "+tCount+" "+transaction);
		try 
		{
			if((transaction.equals("w")) &&(amount < this.accAmount))
			{
				this.accAmount = this.accAmount - amount;
				Thread.sleep(10000);
				System.out.println("Transaction : "+tCount+" is complete");
				
				
			}
			else if((transaction.equals("w")) &&(amount > this.accAmount))
			{
				Thread.sleep(10000);
				System.out.println("Transaction cannot be completed.");
				System.out.println("Available balance is less than the withdrawl amount.");
				
			}
			else if(transaction.equals("d"))
			{
				if(amount < 0.0)
				{
					System.out.println("Transaction cannot be completed.");
					System.out.println("Enter a valid amount.");
					
				}
				else
				{
					this.accAmount =  this.accAmount + amount;
					Thread.sleep(10000);
					System.out.println("Transaction : "+tCount+" is complete");
					
				}
			}
		}catch(InterruptedException e)
		{
			System.out.println("Interrrupted");
		}
		
	}
	
}
