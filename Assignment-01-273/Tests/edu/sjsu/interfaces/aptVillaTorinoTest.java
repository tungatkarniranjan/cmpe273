package edu.sjsu.interfaces;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.sjsu.interfaces.Apartment;
import edu.sjsu.interfaces.aptVillaTorino;

public class aptVillaTorinoTest {


	@Test
	public void testSignLeaseDoc() {
		Apartment apt = new aptVillaTorino();
		//Credit card number is correct
		boolean chkCreditNumber = apt.signLeaseDoc("1234123412341234");
		assertEquals(true,chkCreditNumber);
		//Credit card number < 16
		chkCreditNumber = apt.signLeaseDoc("123412341234123");
		assertEquals(false,chkCreditNumber);
		//Credit card number > 16
		chkCreditNumber = apt.signLeaseDoc("12341234123412345555");
		assertEquals(false,chkCreditNumber);
	}

}
