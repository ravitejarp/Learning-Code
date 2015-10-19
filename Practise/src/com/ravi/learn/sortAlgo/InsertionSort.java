package com.ravi.learn.sortAlgo;

public class InsertionSort {

	public static int[] insertionSort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (i + 1 == a.length) {
				break;
			}
			int current = a[i + 1];
			for (int j = i; j >= 0; j--) {
				if (a[j] > current) {
					int toReplace = a[j];
					a[j] = current;
					a[j + 1] = toReplace;

				}
			}
		}

		return a;
	}

	public static void main(String[] args) {
		int[] arr = { 8, 7, 9, 5, 2, 1, 6,95,3,651,2,3,51,5 };
		int[] insertionSort = insertionSort(arr);
		for (int i = 0; i < insertionSort.length; i++) {
			System.out.println(insertionSort[i]);
		}
	}

}
