package com.ravi.learn;

public class InsertionSort {

	public static int[] insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int toCheck = arr[i];
			int indexMoved = i;
			for (int j = i; j >= 0; j--) {
				if (toCheck < arr[j]) {

					int temp = arr[j];
					arr[j] = arr[indexMoved];
					arr[indexMoved] = temp;
					indexMoved = j;
				}
			}
			System.out.println("Iteration:" + i);
			for (int k = 0; k < arr.length; k++) {
				System.out.print(arr[k] + "\t");
			}
			System.out.println();
		}

		return arr;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 1, 43, 21, 9, 234, 44, 56, 8, 222 };
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + "\t");
		}
		System.out.println();
		insertionSort(arr);
	}

}
