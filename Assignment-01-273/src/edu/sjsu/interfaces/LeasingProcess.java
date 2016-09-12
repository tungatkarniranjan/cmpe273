package edu.sjsu.interfaces;


public interface LeasingProcess {
	
	public boolean generateLeaseClause(int rent,int mnthlyInc_PrevRent, String ssn);
	public boolean signLeaseDoc(String CreditNumber);

}
