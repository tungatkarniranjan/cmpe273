package edu.sjsu.arrays;

public class Student {

	private String stdFirstname;
	private String stdLastName;
	private String stdPhnumber;
	private String stdGrade;
	private int stdId;
	private static int rollCount = 0;
	private String stdAddress;
	private String stdMajor;
	private static int tNoStds = 0;
	
	
	Student(String fname, String lname, String phnum, String addr, String Major,String Grade)
	{
		++rollCount;
		++tNoStds;
		this.stdFirstname = fname;
		this.stdLastName = lname;
		this.stdPhnumber = phnum;
		this.stdId = rollCount;
		this.stdAddress = addr;
		this.stdMajor = Major;
		this.stdGrade = Grade;
		
	}
	
	Student()
	{
		//++rollCount;
		//++tNoStds;
		this.stdFirstname = "";
		this.stdLastName = "";
		this.stdPhnumber = "";
		this.stdId = rollCount;
		this.stdAddress = "";
		this.stdMajor = "";
		
		
	}
	public int getId()
	{
		return this.stdId;
	}
	
	public String getstdFirstname()
	{
		return this.stdFirstname;
	}
	
	public String getstdLastName()
	{
		return this.stdLastName;
	}
	
	public String getstdPhnumber()
	{
		return this.stdPhnumber;
	}
	
	public String getstdAddress()
	{
		return this.stdAddress;
	}
	
	public String getstdMajor()
	{
		return this.stdMajor;
	}

	public String getStdGrade()
	{
		return this.stdGrade;
	}

	public static int gettNoStds()
	{
		return Student.tNoStds;
	}

	/*
	 * Setter methods
	 */
	public void setstdFirstname(String stdFirstname)
	{
		this.stdFirstname = stdFirstname;
	}
	
	public void setstdLastName(String stdLastName)
	{
		this.stdLastName = stdLastName;
	}
	
	public void setstdPhnumber(String stdPhnumber)
	{
		this.stdPhnumber = stdPhnumber;
	}
	
	public void setstdAddress(String stdAddress)
	{
		this.stdAddress = stdAddress;
	}
	
	public void setstdMajor(String stdMajor)
	{
		this.stdMajor = stdMajor;
	}

	public static void settNoStds(int noStds)
	{
		tNoStds = noStds;
	}

	public void setstdGrade(String stdGrade)
	{
		this.stdGrade = stdGrade;
	}
	/*
	 * Helper Methods
	 */
	public String toString()
	{
		String stdDetails = "";
		stdDetails = "Name : \t"+this.stdFirstname+" "+this.stdLastName+"\nContact Number : \t"+this.stdPhnumber+"\nAddress : \t"+this.stdAddress+"\nMajor : \t"+this.stdMajor+"\nGrade : \t"+this.stdGrade;
		return stdDetails;
	}
	
}
