package edu.sjsu.queues;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.sjsu.queues.QueueLinkedList;

public class QueueLinkedListTest {

	@Test
	public void testAddLast() {

		QueueLinkedList q1 = new QueueLinkedList();
		q1.addLast("Michael", 45);
		q1.addLast("Niranjan", 45);
		q1.addLast("Helena", 45);
		System.out.println("Add Last Test :"+q1);
		assertEquals(" | Michael  | Niranjan  | Helena ", q1.toString());
	}

	@Test
	public void testAddFirst() {
		QueueLinkedList q1 = new QueueLinkedList();
		q1.addFirst("Helena", 45);
		q1.addFirst("Michael", 55);
		q1.addFirst("Niranjan", 20);
		System.out.println("Add First Test :"+q1);
		assertEquals(" | Niranjan  | Michael  | Helena ", q1.toString());
	}

	@Test
	public void testDeleteFirst() {
		QueueLinkedList q1 = new QueueLinkedList();
		q1.addFirst("Helena", 45);
		q1.addFirst("Michael", 55);
		q1.addFirst("Niranjan", 20);
		q1.deleteFirst();
		System.out.println("Delete First Test :"+q1);
		assertEquals(" | Michael  | Helena ", q1.toString());
	}

	@Test
	public void testCheckFirstElement() {
		QueueLinkedList q1 = new QueueLinkedList();
		q1.addFirst("Helena", 45);
		q1.addFirst("Michael", 55);
		q1.addFirst("Niranjan", 20);
		String frstElement = q1.checkFirstElement();
		assertEquals("Niranjan", frstElement);
		q1.deleteFirst();
		q1.deleteFirst();
		q1.deleteFirst();
		String Element = q1.checkFirstElement();
		assertEquals("",Element);
	}

	@Test
	public void testCheckLastElement() {
		QueueLinkedList q1 = new QueueLinkedList();
		q1.addFirst("Helena", 45);
		q1.addFirst("Michael", 55);
		q1.addFirst("Niranjan", 20);
		String tailElement = q1.checkLastElement();
		assertEquals("Helena", tailElement);
	}

	@Test
	public void testCheckIfEmpty() {
		QueueLinkedList q1 = new QueueLinkedList();
		assertEquals(true, q1.CheckIfEmpty());
		q1.addFirst("Helena", 45);
		q1.addFirst("Michael", 55);
		q1.addFirst("Niranjan", 20);
		assertEquals(false, q1.CheckIfEmpty());
	}
	
	@Test
	public void testgetSize() {
		QueueLinkedList q1 = new QueueLinkedList();
		System.out.println("Queue Size Test, Queue Size :"+q1.getSize());
		assertEquals(0, q1.getSize());
		q1.addFirst("Helena", 45);
		q1.addFirst("Michael", 55);
		q1.addFirst("Niranjan", 20);
		System.out.println("Queue Size Test, Queue Size after addition :"+q1.getSize());
		assertEquals(3, q1.getSize());
	}

}
