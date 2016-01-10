package com.ravi.datastructures;

public class Stack<T> {
	private LinkedList<T> top;
	private static final int MAX_SIZE = 40;
	private int size = 0;
	private T minElement = null;

	public T getMinElement() {
		return minElement;
	}

	public void setMinElement(T minElement) {
		this.minElement = minElement;
	}

	Stack() {
		top = new LinkedList<T>();
	}

	public void push(T data) {
		top.insert(data);
		size++;

		if (getMinElement() != null) {

			if (((Comparable<T>) data).compareTo((T) getMinElement()) < 0) {
				setMinElement(data);
			}
		} else {
			setMinElement(data);
		}
	}

	public T pop() throws StackEmptyException {

		if (!top.isEmpty()) {
			size--;
			return top.remove();
		}
		throw new StackEmptyException("Empty stack exception");
	}

	public T peek() {

		if (!top.isEmpty()) {
			return top.getHeadData();
		}
		return null;
	}

	public Boolean isEmpty() {
		if (size() != 0)
			return false;

		return true;
	}

	public Boolean isFull() {
		if (size() >= MAX_SIZE) {
			return true;
		}
		return false;
	}

	public int size() {
		return size;
	}

	public void printData() {
		top.printList();
	}

}
