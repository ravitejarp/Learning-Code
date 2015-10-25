package com.ravi.learn;

public class LinkedListDemo {
	int data;
	LinkedListDemo next;

	public LinkedListDemo(int data) {
		this.data = data;
	}

	public static void main(String[] args) {
		LinkedListDemo head = new LinkedListDemo(12);
		head.next = null;
	}

}
