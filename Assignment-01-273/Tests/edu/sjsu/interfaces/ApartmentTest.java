package edu.sjsu.interfaces;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.sjsu.interfaces.Apartment;
import edu.sjsu.interfaces.aptLegacyPlaza;
import edu.sjsu.interfaces.aptSanFernando;
import edu.sjsu.interfaces.aptVillaTorino;

public class ApartmentTest {

	@Test
	public void testCalculateMnthlyexp() {
		Apartment apt1 = new aptSanFernando();
		double mnthExp1 = apt1.calculateMnthlyexp(6);
		assertEquals(594.0,mnthExp1,0.01);
		
		Apartment apt2 = new aptLegacyPlaza();
		double mnthExp2 = apt2.calculateMnthlyexp(6);
		assertEquals(510.0,mnthExp2,0.01);
		
		Apartment apt3 = new aptVillaTorino();
		double mnthExp3 = apt3.calculateMnthlyexp(6);
		assertEquals(555.0,mnthExp3,0.01);
	}

	@Test
	public void testCalculateRentMnths() {
		Apartment apt1 = new aptSanFernando();
		int mnthRent1 = apt1.calculateRentMnths(3);
		assertEquals(10200,mnthRent1);
		
		Apartment apt2 = new aptLegacyPlaza();
		int mnthRent2 = apt2.calculateRentMnths(3);
		assertEquals(8700,mnthRent2);
		
		Apartment apt3 = new aptVillaTorino();
		int mnthRent3 = apt3.calculateRentMnths(3);
		assertEquals(9501,mnthRent3);
		
	}

	@Test
	public void testGetaptAvlFlag() {
		Apartment apt = new aptSanFernando();
		apt.setaptAvlFlag(false);
		boolean chkAvlFlg = apt.getaptAvlFlag();
		assertEquals(false,chkAvlFlg);
		apt.setaptAvlFlag(true);
		chkAvlFlg = apt.getaptAvlFlag();
		assertEquals(true,chkAvlFlg);
	}

}
