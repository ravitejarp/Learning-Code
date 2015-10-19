package com.ravi.learn.sortAlgo;

public class BS {

	public static int[] bso(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("Iteration:" + i);
			for (int k = 0; k < arr.length; k++) {
				System.out.print(arr[k] + "\t");
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 8, 7, 9, 5, 2, 1, 6, 95, 3, 651, 2, 3, 51, 5 };
		System.out.println("Original data");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + "\t");
		}
		System.out.println();
		bso(arr);

	}
}
