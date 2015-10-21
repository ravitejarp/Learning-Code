package com.ravi.learn;

public class Queue {

	public static void main(String[] args) {
		QueueImpl q = new QueueImpl(30);
		q.enQueue(12);
		q.enQueue(32);
		System.out.println(q.deQueue());
		q.enQueue(3343);
		q.enQueue(3132);
		q.enQueue(2);
		q.enQueue(21324);
		q.enQueue(221);
		q.enQueue(322);
		q.enQueue(32213);
		q.display();

		CircularQueue c = new CircularQueue(5);
		c.enQueue(12);
//		c.enQueue(32);
//		c.enQueue(3343);
//		c.enQueue(3132);
//		c.enQueue(2);
//		c.enQueue(21324);
//		System.out.println(c.deQueue());
//		c.enQueue(221);
//		c.enQueue(322);
		c.display();
	}

}
