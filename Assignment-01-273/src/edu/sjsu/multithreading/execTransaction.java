package edu.sjsu.multithreading;

public class execTransaction implements Runnable {

	String transaction;
	double amount;
	int tCount;
	Thread t;
	AtomicBankTransaction atTransc;
	
	public execTransaction(String transaction, double amount, AtomicBankTransaction atTrn, int tCount)
	{
		this.atTransc = atTrn;
		this.amount = amount;
		this.transaction = transaction;
		this.tCount = tCount;
		t = new Thread(this);
		t.start();
	}
	
	execTransaction()
	{
		this.atTransc = null;
		this.amount = 0;
		this.transaction = "";
	}
	
	public void run()
	{
		this.atTransc.transact(this.transaction, this.amount,this.tCount);
	}
	

}
