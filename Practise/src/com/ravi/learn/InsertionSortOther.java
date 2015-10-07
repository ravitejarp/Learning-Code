package com.ravi.learn;

public class InsertionSortOther {

	public static void insertionSort(int[] arr) {
		int pivot = arr.length / 2;
		int[] arrSorted = selectionSort(arr);
		for (int i = arr.length / 2; i < arr.length; i++) {
			for (int k = 0; k < arrSorted.length; k++) {
				if (arr[i] < arrSorted[k]) {
				}
			}
		}
	}

	private static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int index = 0;
			int temp = arr[i];
			for (int j = i + 1; j < arr.length / 2; j++) {
				if (arr[j] < temp) {
					temp = arr[j];
					index = j;
				}
			}
			arr = swap(arr, i, index);
		}

		return arr;
	}

	private static int[] swap(int[] arr, int i, int index) {
		int dummy = arr[i];
		arr[i] = arr[index];
		arr[index] = dummy;
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
