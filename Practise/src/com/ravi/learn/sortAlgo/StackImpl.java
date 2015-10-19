package com.ravi.learn.sortAlgo;

public class StackImpl {

	int[] arr;
	int pointerToTop = 0;
	int maxSize;

	public StackImpl(int[] arr, int size) {
		this.arr = arr;
		this.maxSize = size;
	}

	public void push(int value) {
		if (pointerToTop != maxSize) {
			arr[pointerToTop] = value;
			pointerToTop++;
		} else {
			System.out.println("Stack over flow");
		}
	}

	public int pop() {
		if (pointerToTop >= 0)
			return arr[pointerToTop--];

		return -1;
	}

	public int peek() {
		if (pointerToTop >= 0)
			return arr[pointerToTop];
		return -1;
	}

	public void display() {
		for (int i = 0; i <= pointerToTop; i++) {
			System.out.println(arr[i]);
		}
	}

}
