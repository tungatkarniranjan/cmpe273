package edu.sjsu.arrays;

//import java.util.Scanner;

public class StudentInfo {

	static Student stdInfoArray[] = new Student[20];
	
	
	public void addStdDetails(String fname, String lname, String phnum, String addr, String Major, String Grade)
	{
		int noStds = Student.gettNoStds();
			
	    if(noStds == 0)
	    {
	    	stdInfoArray[0] = new Student(fname,lname,phnum,addr,Major,Grade);
	    }
	    else
	    {
	    	stdInfoArray[noStds] = new Student(fname,lname,phnum,addr,Major,Grade);
	    	
	    }
	    Student.settNoStds(++noStds);
	    
	}
	
	public void dltStudentRecord(int stdId)
	{
		boolean stdpresentFlg = false;
		if(chkStdNo())
		{
			System.out.println("No student records to delete");
			return;
		}
		else
		{
			
			for(int i = 0; i < Student.gettNoStds(); i++)
			{
				if (stdId == stdInfoArray[i].getId())
				{	
					System.out.println("Student Record Deleted :");
					dispStdDetails(stdId);
					stdpresentFlg = true;
					for(int k=i;k<Student.gettNoStds()-1;k++)
					{
						stdInfoArray[k] = stdInfoArray[k+1];
					}
					Student.settNoStds(Student.gettNoStds()-1);
					
					break;
				}
				else
				{
					continue;
				}
			}
		}
		if(stdpresentFlg == false)
		{
			System.out.println("The student record is not present");
		}
		
	}
	
	public boolean dispStdDetails(int stdId)
	{
		boolean stdpresentFlg = false;
		
		if (chkStdNo())
		{
			System.out.println("No student records to display");
			return false;
		}
		else
		{
			for(int i = 0; i < Student.gettNoStds(); i++)
			{
				if (stdId == stdInfoArray[i].getId())
				{
					System.out.println(stdInfoArray[i]);
					stdpresentFlg = true;
					break;
					
				}
				
			}
			if(stdpresentFlg == false)
			{
				System.out.println("The student record is not present");
				return false;
			}
		}
		return true;
		
	}
	
	public boolean chkStdNo()
	{
		return (Student.gettNoStds() == 0);
	}

	public void updStudentRecord(int stdId, int op, String updfield)
	{
		boolean stdpresentFlg = false;
				
		if(chkStdNo())
		{
			System.out.println("No student records to update");
			return;
		}
		else
		{
			for(int i = 0; i < Student.gettNoStds(); i++)
			{
				if (stdId == stdInfoArray[i].getId())
				{
					stdpresentFlg = true;
					if(op == 1)
					{
						stdInfoArray[i].setstdFirstname(updfield);
					}
					else if(op == 2)
					{
						stdInfoArray[i].setstdLastName(updfield);
					}
					else if(op ==3)
					{
						stdInfoArray[i].setstdPhnumber(updfield);
					}
					else if(op ==4)
					{
						stdInfoArray[i].setstdAddress(updfield);
					}
					else if(op ==5)
					{
						stdInfoArray[i].setstdMajor(updfield);
					}
					else if(op ==6)
					{
						stdInfoArray[i].setstdGrade(updfield);
					}
					
				}
				else
				{
					continue;
				}
			}
			if(stdpresentFlg == false)
			{
				System.out.println("The student record you want to update is not present");
			}
		}
	}

	public String calStdGrade(double totalMarks, double marksObtained)
	{
				
		if((marksObtained/totalMarks)<=0.7)
		{
			return "C";
		}
		else if (((marksObtained/totalMarks)<=0.75)&&((marksObtained/totalMarks)>0.70))
		{
			return "B-";
			
		}
		else if (((marksObtained/totalMarks)<=0.80)&&((marksObtained/totalMarks)>0.75))
		{
			return "B";
			
		}
		else if (((marksObtained/totalMarks)<=0.85)&&((marksObtained/totalMarks)>0.80))
		{
			return "A-";
		}
		else if (((marksObtained/totalMarks)<=0.90)&&((marksObtained/totalMarks)>0.85))
		{
			return "A";
		}
		else 
		{
			return "A+";
		}
						
	}
}
