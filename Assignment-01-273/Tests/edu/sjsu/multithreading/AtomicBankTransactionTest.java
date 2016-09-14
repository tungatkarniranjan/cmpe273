package edu.sjsu.multithreading;

import static org.junit.Assert.*;

import org.junit.Test;

public class AtomicBankTransactionTest {

	@Test
	public void testTransact() {
		AtomicBankTransaction atmBanktran = new AtomicBankTransaction(20000);
		atmBanktran.transact("w", 12000, 1);
		assertEquals(8000, atmBanktran.accAmount, 0.01);
		atmBanktran.transact("d", 4000, 2);
		assertEquals(12000, atmBanktran.accAmount, 0.01);
		atmBanktran.transact("w", 13000, 3);
		assertEquals(12000, atmBanktran.accAmount, 0.01);
		atmBanktran.transact("w", -13000, 3);
		assertEquals(12000, atmBanktran.accAmount, 0.01);
	}

}
