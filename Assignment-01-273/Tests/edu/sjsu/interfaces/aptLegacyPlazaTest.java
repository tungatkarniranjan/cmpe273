package edu.sjsu.interfaces;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.sjsu.interfaces.Apartment;
import edu.sjsu.interfaces.aptLegacyPlaza;

public class aptLegacyPlazaTest {

	@Test
	public void testGenerateLeaseClause() {
		Apartment apt = new aptLegacyPlaza();
		//below actual condition
		boolean chkEligible = apt.generateLeaseClause(2900, 7000, "yes");
		assertEquals(false,chkEligible);
		//3 times the income
		chkEligible = apt.generateLeaseClause(2900, 8700, "yes");
		assertEquals(true,chkEligible);
		//Above expected income
		chkEligible = apt.generateLeaseClause(2900, 9000, "yes");
		assertEquals(true,chkEligible);
		
	}

	@Test
	public void testSignLeaseDoc() {
		Apartment apt = new aptLegacyPlaza();
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

