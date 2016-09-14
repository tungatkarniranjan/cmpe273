package edu.sjsu.multithreading;

import java.util.Scanner;

public class MultiThreadingDemo {

	public static void main(String[] args) {
		System.out.println("Initial balance : $20000" );
		AtomicBankTransaction atbTrans = new AtomicBankTransaction(20000);
		String ip ="";
		Scanner user_ip = new Scanner(System.in);
		int tID = 0;
		execTransaction exTransaction = new execTransaction();
		boolean trFlg = false;
		try
		{
			do 
			{
				++tID;
				
				System.out.println("Do you want to withdraw or deposit money");
				ip = user_ip.nextLine();
				
				
				if(ip.equals("yes")||ip.equals("Yes")||ip.equals("Y")||ip.equals("y"))
				{
					trFlg = true;
					System.out.println("1. Withdraw(w)\n2. Deposit(d)");
					ip = user_ip.nextLine();
					if(ip.equals("d"))
					{
						System.out.println("Enter the amount you want to deposit(New Thread)");
						exTransaction = new execTransaction("d",Double.parseDouble(user_ip.nextLine()),atbTrans,tID);
						Thread.sleep(10);
					}
					else if(ip.equals("w"))
					{
						System.out.println("Enter the amount you want to withdraw");
						exTransaction = new execTransaction("w",Double.parseDouble(user_ip.nextLine()),atbTrans,tID);
						Thread.sleep(10);
					}
					
				}
				else
					break;
				System.out.println("Do you want to continue(Y/N)");
				ip=user_ip.nextLine();
			
			}while(ip.equals("yes")||ip.equals("Yes")||ip.equals("Y")||ip.equals("y"));
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
		try 
		{
			if(trFlg)
			{
				exTransaction.t.join();
				System.out.println("Closing balance : "+atbTrans.accAmount);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
		
		user_ip.close();
	}

}
