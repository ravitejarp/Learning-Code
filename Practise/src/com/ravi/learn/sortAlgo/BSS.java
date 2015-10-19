package com.ravi.learn.sortAlgo;

public class BSS {

	public static long[] bSS(long[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					long temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println();
			System.out.println(i + " Iteration");
			for (int k = 0; k < arr.length; k++)
				System.out.print(arr[k] + "\t");
		}

		return arr;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long[] arr1 = new long[10000];

		for (int j = 0; j < 10000; j++) // fill array with
		{ // random numbers
			long n = (long) (Math.random() * (10000 - 1));
			arr1[j] = n;
		}
		for (int i = 0; i < arr1.length; i++)
			System.out.print(arr1[i] + "\t");
		System.out.println("Original data");

		System.out.println();
		long[] bubbleSort = bSS(arr1);
		System.out.println();
		System.out.println("Final");
		for (int i = 0; i < bubbleSort.length; i++)
			System.out.print(bubbleSort[i] + "\t");

		long end = System.currentTimeMillis();

		System.out.println("Time taken is" + (end - start));
	}
}
