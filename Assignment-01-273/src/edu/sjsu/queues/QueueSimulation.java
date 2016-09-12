package edu.sjsu.queues;

import java.util.*;

public class QueueSimulation {
	
	public static void immigrationCheckoutFunc(QueueLinkedList q1, Scanner user_ip)
	{
		String nxtPasschkout = "";
		boolean imgFlg = true;
		String imgOfc = "";
		do 
		{				
			if(imgFlg)
			{
				System.out.println("Are you an immigration official");
				imgFlg = false;
				imgOfc = user_ip.nextLine();
			}
			else{
				System.out.println("Start Interview (Y/N)");
				imgOfc = user_ip.nextLine();
			}
			
			
			if(imgOfc.equals("yes")||imgOfc.equals("Yes")||imgOfc.equals("Y")||imgOfc.equals("y"))
			{	
				
				imgOfc = "";
				System.out.println("Immigration interview over : (Y/N) of passenger.");
				imgOfc = user_ip.nextLine();
				if(imgOfc.equals("yes")||imgOfc.equals("Yes")||imgOfc.equals("Y")||imgOfc.equals("y"))
				{
					if(!q1.CheckIfEmpty())
					{
						System.out.println("Checked out : "+q1.checkFirstElement());
						q1.deleteFirst();
					}
					else
					{
						System.out.println("All passengers interviewed");
						break;
					}
					
				}
			}
			System.out.println("Take in next passenger?(Y/N)");
			nxtPasschkout = user_ip.nextLine();

		}while(nxtPasschkout.equals("yes")||nxtPasschkout.equals("Yes")||nxtPasschkout.equals("Y")||nxtPasschkout.equals("y"));
	}
	
	public static int calTotalmins(QueueLinkedList q1)
	{
		QueueNode tempNode = q1.getHead();
		int totalMinstoDep = 0;
		while (tempNode != null)
		{
			//Add 5 minutes for every immigration interview
			totalMinstoDep = totalMinstoDep + 5;
			tempNode = tempNode.getnextNode();
		}
		return totalMinstoDep;
	}
	
	public static int calTotalminsv2(QueueNode chkNode, QueueLinkedList q1)
	{
		QueueNode tempNode = q1.getHead();
		int tmpminstoDep = 0;
		
		while(tempNode != chkNode)
		{
			tmpminstoDep = tmpminstoDep + 5;
			tempNode = tempNode.getnextNode();
		}
		return tmpminstoDep + 5;
	}

	public static boolean checkfeasiblity(QueueLinkedList q1)
	{
		QueueNode tempNode = q1.getHead();
		int minutes = 0;
		
		while(tempNode != null)
		{
			minutes = calTotalminsv2(tempNode,q1);
			if((tempNode.getminstodep()-10) >= minutes)
			{
				tempNode = tempNode.getnextNode();
			}
			else
			{
				return false;
			}
			
		}
		return true;
	}

	public static void getPassengerDetails(QueueLinkedList q1, Scanner user_ip)
	{
		String ip ="";
		do
		{
			System.out.println("Enter your name : ");
			String usrName = user_ip.nextLine();
			
		
			System.out.println("\nEnter the Mins remaining for your Departure");
			int usrMinstoDep = user_ip.nextInt();
			user_ip.nextLine();
		
			if(q1.CheckIfEmpty())
			{
				System.out.println("There are no people in Q1, please go to Q1 counter");
				q1.addLast(usrName,usrMinstoDep);
			}
			else
			{
				//if total time of queue is less than the new passengers dep time by 10 mins add him at the end of the queue
				if(calTotalmins(q1) <= (usrMinstoDep-10))
				{
					System.out.println("Total persons in Q1 line : "+q1.getSize());
					System.out.println("Total time required to complete the queue : "+calTotalmins(q1)+" mins");
					System.out.println("You will be able to complete the immigration process before your departure.");
					System.out.println("!!!!Go to Q1 counter!!!!");
					q1.addLast(usrName, usrMinstoDep);
				}
				else
				{
					if(checkfeasiblity(q1))
					{
						System.out.println("You will be served with priority");
						System.out.println("Please go to the start of counter Q1");
						q1.addFirst(usrName, usrMinstoDep);
					}
					else
					{
						System.out.println("Q1 counter will not be able to service you in time");
						System.out.println("!!!!Please go to the priority counter P1!!!!");
					}
				}
				
			}
			System.out.println("\nCurrent Line on counter Q1 : "+q1);
			System.out.println("\nNext User?");
			ip = user_ip.nextLine();
			
		}while(ip.equals("yes")||ip.equals("Yes")||ip.equals("Y")||ip.equals("y"));	
		
	}
	
	public static void main(String[] args) {
		QueueLinkedList q1 = new QueueLinkedList();
		Scanner user_ip = new Scanner(System.in);
		
		System.out.println("!!!!Welcome to San Jose Immigration Dept!!!!");
		
		System.out.println("\nPlease enter details for efficient scheduling of your immigration interview\n");
		
		getPassengerDetails(q1,user_ip);
		immigrationCheckoutFunc(q1, user_ip);
		user_ip.close();

	}

}
