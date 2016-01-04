package com.ravi.datastructures;

public class Node<T> {
	Node<T> next;
	T data;

	public Node() {
		next = null;
		data = null;
	}

	public Node(Node<T> next, T data) {
		this.next = next;
		this.data = data;
	}
}
