package com.ravi.learn;

public class StackInt {

	private int[] arr;
	private int maxSize;
	private int top = -1;

	public StackInt(int maxSize) {
		this.arr = new int[maxSize];
		this.maxSize = maxSize;
	}

	public boolean isEmpty() {
		return top == -1 ? true : false;
	}

	// public void push(String value) {
	// if (top != 0) {
	// top++;
	// }
	// if (top < maxSize) {
	// arr[top] = value;
	//
	// } else {
	// System.out.println("Stack overflow");
	// }
	//
	// }

	public void push(int value) {
		if (++top <= maxSize) {
			arr[top] = value;

		} else {
			System.out.println("Stack overflow");
		}

	}

	public int pop() {
		if (top >= 0) {
			return (arr[top--]);
		}
		return 0;

	}

	public int peek() {
		if (top >= 0)
			return arr[top];
		return 0;
	}

	public void display() {
		System.out.println("The items in stack are:");
		for (int i = top; i >= 0; i--) {
			System.out.print(arr[i]);

		}
	}
}
