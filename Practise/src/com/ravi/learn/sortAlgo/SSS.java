package com.ravi.learn.sortAlgo;

public class SSS {

	public static long[] sSort(long[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			long small = arr[i];
			int index = i;
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[j] < small) {
					index = j;
					small = arr[j];
				}
			}
			if (index != i) {
				long temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
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
		long[] selectionSort = sSort(arr1);
		System.out.println();
		for (int i = 0; i < selectionSort.length; i++) {
			System.out.print(selectionSort[i] + "\t");
		}

		long end = System.currentTimeMillis();

		System.out.println("Time taken is" + (end - start));

	}

}
