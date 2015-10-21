package com.ravi.learn;

public class CircularQueue {
	int[] arr;
	int front = -1;
	int rear = -1;
	int maxSize = 0;

	public CircularQueue(int size) {
		arr = new int[size];
		maxSize = size;
	}

	public void enQueue(int value) {
		if (rear < maxSize - 1) {
			arr[++rear] = value;
			if (front == -1)
				front++;
		} else if (front != 0 && front != rear) {
			rear = -1;
			arr[++rear] = value;
		} else {
			System.out.println("Queue is full");
		}

	}

	public int deQueue() {
		if (front >= 0) {
			return arr[front++];
		}
		return -1;
	}

	public int getHead() {
		if (front >= 0)
			return arr[front];

		return -1;

	}

	public int getTail() {
		if (rear >= 0)
			return arr[rear];

		return -1;

	}

	public void display() {
		int first = front;
		int tail = rear;
		System.out.println();

		if (first != -1)
			while (first < maxSize) {
				System.out.print(arr[first] + ",");
				first++;
			}
		if (first == maxSize) {
			first = 0;
			while (first <= tail) {
				System.out.print(arr[first] + ",");
			}
		}
	}
}
