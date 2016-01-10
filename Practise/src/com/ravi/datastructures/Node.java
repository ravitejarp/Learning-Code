package com.ravi.datastructures;

public class Node<T> {
	private Node<T> next;
	private T data;

	public Node() {
		setNext(null);
		setData(null);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}
