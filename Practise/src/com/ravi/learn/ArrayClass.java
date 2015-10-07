package com.ravi.learn;

public class ArrayClass {
	private int[] arr;

	ArrayClass(int size) {
		arr = new int[size];
	}

	public void insert(int index, int value) {
		arr[index] = value;
	}

	public int search(int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value)
				return i;
		}
		return -1;
	}

	public int getValue(int index) {
		return arr[index];
	}

	public int delete(int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				for (int j = i; j < arr.length; j++) {
					if (!(j + 1 == arr.length))
						arr[j] = arr[j + 1];
				}
				return i;
			}
		}
		return -1;

	}

	public void display() {
		System.out.println("Value in array are:");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
	}
}
