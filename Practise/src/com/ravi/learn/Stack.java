package com.ravi.learn;

public class Stack {

	private char[] arr;
	private int maxSize;
	private int top = -1;

	public Stack(int maxSize) {
		this.arr = new char[maxSize];
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

	public void push(char value) {
		if (++top <= maxSize) {
			arr[top] = value;

		} else {
			System.out.println("Stack overflow");
		}

	}

	@SuppressWarnings("null")
	public char pop() {
		if (top >= 0) {
			return (arr[top--]);
		}
		return (Character) null;

	}

	@SuppressWarnings("null")
	public char peek() {
		if (top >= 0)
			return arr[top];
		return (Character) null;
	}

	public void display() {
		System.out.println("The items in stack are:");
		for (int i = top; i >= 0; i--) {
			System.out.print(arr[i]);

		}
	}
}
