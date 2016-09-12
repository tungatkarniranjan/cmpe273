package edu.sjsu.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.sjsu.arrays.Student;
import edu.sjsu.arrays.StudentInfo;

public class StudentInfoTest {

	StudentInfo stdInfo = new StudentInfo();
	@Test
	public void testAddStdDetails() {
		//fail("Not yet implemented");
		System.out.println("\n\nTesting AddStdDetails \n\n" );
		stdInfo.addStdDetails("John", "Hophkins", "6692655142", "329 North First Street #211", "SE", "A+");
		stdInfo.addStdDetails("Kenneth", "Go", "1234567891", "San Jose, California", "CS", "A");
		stdInfo.addStdDetails("Justin", "Lee", "9876543211", "San Francisco, California", "SE", "B");
		stdInfo.addStdDetails("Bret", "Michaels", "5647383920", "Fremont, California", "SE", "C");
		assertEquals(4,Student.gettNoStds());
	}

	@Test
	public void testDltStudentRecord() {
		System.out.println("\n\nTesting dltStdDetails \n\n" );
		stdInfo.addStdDetails("Justin", "Hampe", "10293847561", "San Francisco, California", "SE", "B");
		assertEquals(5, Student.gettNoStds());
		stdInfo.dltStudentRecord(6);
		assertEquals(4, Student.gettNoStds());
	}

	@Test
	public void testDispStdDetails() {
		System.out.println("\n\nTesting viwStdDetails \n\n" );
		stdInfo.addStdDetails("Frank", "Hamacher", "10293847561", "San Mateo", "EE", "B");
		assertEquals(true, stdInfo.dispStdDetails(5));
		stdInfo.dltStudentRecord(1);
		assertEquals(false, stdInfo.dispStdDetails(1));
		
	}

	@Test
	public void testUpdStudentRecord() {
		System.out.println("\n\nTesting updStdDetails \n\n" );
		stdInfo.dispStdDetails(4);
		stdInfo.updStudentRecord(4, 1, "Tyler");
		stdInfo.updStudentRecord(4, 2, "Durden");
		stdInfo.updStudentRecord(4, 3, "6691234567");
		stdInfo.updStudentRecord(4, 4, "United States");
		stdInfo.updStudentRecord(4, 5, "CS");
		stdInfo.updStudentRecord(4, 6, "A+");
		stdInfo.dispStdDetails(4);
	}

	@Test
	public void testCalStdGrade() {
		String stdGrade = stdInfo.calStdGrade(500,495);
		assertEquals("A+",stdGrade);
	}

}
