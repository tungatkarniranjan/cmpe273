package edu.sjsu.stacks;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.sjsu.stacks.StackLinkedList;

public class StackLinkedListTest {

	@Test
	public void testCheckIfEmpty() {
		StackLinkedList stck1 = new StackLinkedList();
		boolean chkEmpty = stck1.CheckIfEmpty();
		//Check if stck1.CheckIfEmpty returns true if stack is empty
		assertEquals(true, chkEmpty);
		
		stck1.push("3");
		stck1.push("4");
		
		//Check if stck1.CheckIfEmpty returns false if stack is not empty
		boolean chkEmptyfls = stck1.CheckIfEmpty();
		assertEquals(false, chkEmptyfls);
		
	}

	@Test
	public void testPush() {
		StackLinkedList stck1 = new StackLinkedList();
		stck1.push("3");
		stck1.push("4");
		String stckValues = stck1.toString();
		assertEquals("4 | 3 | ", stckValues);
	}

	@Test
	public void testPop() {
		StackLinkedList stck1 = new StackLinkedList();
		stck1.push("3");
		stck1.push("4");
		stck1.push("45");
		stck1.push("90");
		stck1.push("100000");
		stck1.push("223423453245345345");
		stck1.push("2");
		stck1.pop();
		String stckValues = stck1.toString();
		assertEquals("223423453245345345 | 100000 | 90 | 45 | 4 | 3 | ", stckValues);
		stck1.pop();
		String stckValues1 = stck1.toString();
		assertEquals("100000 | 90 | 45 | 4 | 3 | ", stckValues1);
	}

	@Test
	public void testGetFirst() {
		StackLinkedList stck1 = new StackLinkedList();
		stck1.push("3");
		stck1.push("4");
		stck1.push("45");
		stck1.push("90");
		stck1.push("100000");
		stck1.push("223423453245345345");
		stck1.push("2");
		assertEquals("2", stck1.getFirst());
		stck1.pop();
		assertEquals("223423453245345345", stck1.getFirst());
	}

}
