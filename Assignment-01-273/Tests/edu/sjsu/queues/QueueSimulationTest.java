package edu.sjsu.queues;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.sjsu.queues.QueueLinkedList;
import edu.sjsu.queues.QueueSimulation;

public class QueueSimulationTest {

	@Test
	public void testCalTotalmins() {
		QueueLinkedList q1 = new QueueLinkedList();
		
		q1.addLast("Helena", 45);
		q1.addLast("Michael", 55);
		q1.addLast("Niranjan", 20);
		System.out.println("Total Mins : "+QueueSimulation.calTotalmins(q1));
		assertEquals(15, QueueSimulation.calTotalmins(q1));
	}

	@Test
	public void testCheckfeasiblity() {
		//fail("Not yet implemented");
		QueueLinkedList q1 = new QueueLinkedList();
		q1.addLast("Helena", 45);
		q1.addLast("Michael", 55);
		q1.addLast("Niranjan", 20);
		assertEquals(false,QueueSimulation.checkfeasiblity(q1));
		System.out.println(QueueSimulation.checkfeasiblity(q1));
		q1.deleteFirst();
		q1.deleteFirst();
		q1.deleteFirst();
		q1.addLast("Helena", 45);
		q1.addLast("Michael", 55);
		System.out.println(QueueSimulation.checkfeasiblity(q1));
		assertEquals(true,QueueSimulation.checkfeasiblity(q1));
	}

}
