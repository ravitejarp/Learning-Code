package com.ravi.datastructures;

public class Queue<T> {
	Element<T> head;
	Element<T> tail;
	private static final int MAX_SIZE = 40;
	private static int size = 0;

	public Queue() {
		head = new Element<T>();
		tail = new Element<T>();
	}

	public void enqueue(T data) throws QueueFullException {
		if (size <= MAX_SIZE) {
			if (head == null) {
				head.setData(data);
				tail = head;
			} else {
				Element<T> temp = new Element<>();
				temp.setData(data);
				temp.setNext(tail);
				tail = temp;
			}
		} else {
			throw new QueueFullException("Queue is full");
		}

	}

	public T deQueue() throws QueueFullException {
		if (size != 0) {
			if (head != null) {
				T data = head.getData();
				Element<T> temp = tail;
				while (temp.getNext() != head) {
					temp = temp.getNext();

				}
				head = temp;

				return data;
			}
		}
		throw new QueueFullException("Queue is Empty");
	}

	public T peek() {
		return head.getData();
	}

	public boolean offer(T data) {
		try {
			enqueue(data);
		} catch (QueueFullException e) {
			// TODO Auto-generated catch block
			return false;
		}

		return true;
	}

	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	public boolean isFull() {
		return MAX_SIZE == size ? true : false;
	}

}
