package edu.sjsu.interfaces;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.sjsu.interfaces.Apartment;
import edu.sjsu.interfaces.aptSanFernando;

public class aptSanFernandoTest {

	@Test
	public void testGenerateLeaseClause() {
		Apartment apt = new aptSanFernando();
		//Previous rent > rent(3400)
		boolean chkEligible = apt.generateLeaseClause(3400, 7000, "yes");
		assertEquals(true,chkEligible);
		//Previous history is null
		chkEligible = apt.generateLeaseClause(3400, 0, "yes");
		assertEquals(false,chkEligible);
		//Previous rent < rent
		chkEligible = apt.generateLeaseClause(3400, 2000, "yes");
		assertEquals(true,chkEligible);
	}

	@Test
	public void testSignLeaseDoc() {
		Apartment apt = new aptSanFernando();
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
