package edu.sjsu.arrays;

import java.util.*;


public class StudentManagementSystem {
	
	public static void getStudentDetails(StudentInfo stdInfo, int sizeStdArray, Scanner read)
	{
		
		for(int i=0; i<sizeStdArray; i++)
		{
			System.out.println("Enter the following Details for Student : " +(i+1));
			System.out.println("First Name : \t");
			String fname = read.nextLine();
			System.out.println("Last Name : \t");
			String lname = read.nextLine();
			System.out.println("Contact Number : \t");
			String phnum = read.nextLine();
			System.out.println("Address : \t");
			String addr = read.nextLine();
			System.out.println("Major : \t");
			String Major = read.nextLine();
			System.out.println("Enter total Marks: \t");
			double tmarks = Double.parseDouble(read.nextLine());
			System.out.println("Enter Obtained Marks: \t");
			double obmarks = Double.parseDouble(read.nextLine());
			String Grade = stdInfo.calStdGrade(tmarks, obmarks);
			stdInfo.addStdDetails(fname,lname,phnum,addr,Major,Grade);
		}
	}
	
	public static void getStudentDetailsUpd(StudentInfo stdInfo, int stdId, Scanner read)
	{
		System.out.println("Enter field you want to edit : ");
		System.out.println("1. First Name\n2. Last Name\n3. Contact Number\n4. Address");
							
		switch(Integer.valueOf(read.nextLine()))
		{
		case 1 : 
			System.out.println("Enter new First Name");
			String fname = read.nextLine();
			stdInfo.updStudentRecord(stdId, 1, fname);
			System.out.println("First Name for Student : "+stdId+" has been updated");
			break;
		case 2 :
			System.out.println("Enter new Last Name");
			String lname = read.nextLine();
			stdInfo.updStudentRecord(stdId, 2, lname);
			System.out.println("Last Name for Student : "+stdId+" has been updated");
			break;
		case 3 :
			System.out.println("Enter new Contact Number");
			String cnumber = read.nextLine();
			stdInfo.updStudentRecord(stdId, 3, cnumber);
			System.out.println("Contact Number for Student : "+stdId+" has been updated");
			break;
		case 4 :
			System.out.println("Enter new Address");
			String adr = read.nextLine();
			stdInfo.updStudentRecord(stdId, 4, adr);
			System.out.println("Address for Student : "+stdId+" has been updated");
			break;
		case 5 :
			System.out.println("Enter new Major");
			String maj = read.nextLine();
			stdInfo.updStudentRecord(stdId, 5, maj);
			System.out.println("Address for Student : "+stdId+" has been updated");
			break;
		case 6 :
			System.out.println("Enter total marks");
			int tmarks = Integer.valueOf(read.nextLine());
			System.out.println("Enter Obtained marks");
			int marksob = Integer.valueOf(read.nextLine());
			String stdGrade = stdInfo.calStdGrade(tmarks, marksob);
			stdInfo.updStudentRecord(stdId, 6, stdGrade);
			System.out.println("Address for Student : "+stdId+" has been updated");
			break;
		default :
			System.out.println("You Entered the wrong option");
			break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter number of Student to Add : ");
		int sizeStdArray = read.nextInt();
		read.nextLine();
		StudentInfo stdInfo = new StudentInfo();
		
		getStudentDetails(stdInfo,sizeStdArray,read);
		
		for(int i = 0; i<Student.gettNoStds();i++)
		{
			System.out.println("Student : "+(i+1));
			System.out.println(StudentInfo.stdInfoArray[i]);
		}
		
		System.out.println("Do you want to delete Student Records(Y/N) : ");
		String ip = read.nextLine();
		if(ip.equals("yes")||ip.equals("Yes")||ip.equals("Y")||ip.equals("y"))
		{
			System.out.println("Enter Student id you want to delete : ");
			int stdId = read.nextInt();
			read.nextLine();
			stdInfo.dltStudentRecord(stdId);
		}
		ip = "";	
		
		System.out.println("Do you want view record of a student : ");
		ip = read.nextLine();
		if(ip.equals("yes")||ip.equals("Yes")||ip.equals("Y")||ip.equals("y"))
		{
			System.out.println("Enter Student id you want to view : ");
			int stdId = Integer.valueOf(read.nextLine());
			stdInfo.dispStdDetails(stdId);
		}
		ip ="";
		
		System.out.println("Do you want to update Student Records(Y/N) : ");
		Scanner user_ip = new Scanner(System.in);
		String ip2 = user_ip.nextLine();
		if(ip2.equals("yes")||ip2.equals("Yes")||ip2.equals("Y")||ip2.equals("y"))
		{
			System.out.println("Enter Student id you want to update : ");
			int stdId = Integer.valueOf(read.nextLine());
			getStudentDetailsUpd(stdInfo,stdId,read);
			stdInfo.dispStdDetails(stdId);
		}
		
		read.close();
		user_ip.close();
	}
	
		
}	
	


