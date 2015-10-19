package com.ravi.learn.searchAlgo;

public class RecursiveBinary {

	public static int binaryRecursion(int[] arr, int searchKey, int first,
			int last) {
		int middle = (first + last) / 2;
		if (first < last) {
			if (searchKey > arr[middle]) {
				return binaryRecursion(arr, searchKey, middle + 1, last);
			} else if (searchKey < arr[middle]) {
				return binaryRecursion(arr, searchKey, first, middle - 1);
			} else
				return middle;
		}
		if (first == last && first < arr.length) {
			if (searchKey == arr[first])
				return first;

		}

		return -1;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Value found at:"
				+ binaryRecursion(arr, 5, 0, arr.length));
		System.out.println("Value found at:"
				+ binaryRecursion(arr, 6, 0, arr.length));
		System.out.println("Value found at:"
				+ binaryRecursion(arr, 8, 0, arr.length));
		System.out.println("Value found at:"
				+ binaryRecursion(arr, 9, 0, arr.length));
		System.out.println("Value found at:"
				+ binaryRecursion(arr, 1, 0, arr.length));
		System.out.println("Value found at:"
				+ binaryRecursion(arr, 895, 0, arr.length));
	}

}
