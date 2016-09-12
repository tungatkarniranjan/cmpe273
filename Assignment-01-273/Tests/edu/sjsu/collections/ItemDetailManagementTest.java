package edu.sjsu.collections;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.sjsu.collections.Item;
import edu.sjsu.collections.ItemDetailManagement;

public class ItemDetailManagementTest {

	@Test
	public void testViwProductDetails() {
		ItemDetailManagement itmDtMng =new ItemDetailManagement();
		Item a1 = itmDtMng.createItem("Home Life Memory Foam Mattress", "Furniture", 32, 12, 38);
		Item a2 = itmDtMng.createItem("Home Life Chair", "Furniture", 9.38 , 2, 38);
		Item a3 = itmDtMng.createItem("Garnier Hair Color", "Cosmetics", 13 , 0, 38);
		itmDtMng.addItems("101", a1);
		itmDtMng.addItems("102", a2);
		itmDtMng.addItems("103", a3);
		Item a4 = itmDtMng.viwProductDetails("103");
		assertEquals("Garnier Hair Color", a4.getitmdName());
		Item a5 = itmDtMng.viwProductDetails("104");
		assertEquals(null, a5);
	}

	@Test
	public void testAddItems() {
		ItemDetailManagement itmDtMng =new ItemDetailManagement();
		Item a1 = itmDtMng.createItem("Home Life Memory Foam Mattress", "Furniture", 32, 12, 38);
		Item a2 = itmDtMng.createItem("Home Life Chair", "Furniture", 9.38 , 2, 38);
		Item a3 = itmDtMng.createItem("Garnier Hair Color", "Cosmetics", 13 , 0, 38);
		boolean chkIfadded = itmDtMng.addItems("101", a1);
		assertEquals(true,chkIfadded);
		chkIfadded = itmDtMng.addItems("102", a2);
		assertEquals(true,chkIfadded);
		chkIfadded = itmDtMng.addItems("102", a3);
		assertEquals(false,chkIfadded);
	}

	@Test
	public void testCreateItem() {
		ItemDetailManagement itmDtMng =new ItemDetailManagement();
		Item a1 = new Item();
		a1 = itmDtMng.createItem("Home Life Memory Foam Mattress", "Furniture", 32, 12, 38);
		assertEquals(40.32,a1.getitmchkPrice(),0.01);
		assertEquals("Home Life Memory Foam Mattress",a1.getitmdName());
		assertEquals("Furniture",a1.getitmdCategory());
		
	}

}
