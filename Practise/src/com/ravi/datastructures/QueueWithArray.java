package com.ravi.datastructures;

import java.lang.reflect.Array;

public class QueueWithArray<T> {
	private int head = -1;
	private int tail = -1;
	private static final int MAX_SIZE = 40;
	private T[] elements;

	public QueueWithArray(Class<T> clazz) {
		elements = (T[]) Array.newInstance(clazz, MAX_SIZE);
	}

	public void enQueue(T data) throws QueueFullException {
		if (isFull()) {
			throw new QueueFullException("Queue is full");
		} else {
			elements[++tail] = data;
			if (head == -1)
				head = tail;

		}
	}

	public T deQueue() throws QueueFullException {
		if (isEmpty()) {
			throw new QueueFullException("Queue is empty");
		} else {
			if (head != tail) {
				T t = elements[head];
				head++;
				return t;
			} else {
				T t = elements[head];
				head = -1;
				return t;
			}
		}
	}

	private boolean isEmpty() {
		return head == -1;
	}

	private boolean isFull() {
		int nextIndex = (tail + 1) % elements.length;

		return nextIndex == head;
	}
}
