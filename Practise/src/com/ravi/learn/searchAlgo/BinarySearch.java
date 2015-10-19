package com.ravi.learn.searchAlgo;

public class BinarySearch {

	public static int binarySearch(int arr[], int searchKey) {
		int first = 0;
		int last = arr.length - 1;
		while (first <= last) {
			int middle = (first + last) / 2;
			if (searchKey == arr[middle]) {
				return middle;
			} else {
				if (searchKey > arr[middle]) {
					first = middle + 1;
				} else {
					last = middle - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Value found at:" + binarySearch(arr, 5));
		System.out.println("Value found at:" + binarySearch(arr, 6));
		System.out.println("Value found at:" + binarySearch(arr, 8));
		System.out.println("Value found at:" + binarySearch(arr, 9));
		System.out.println("Value found at:" + binarySearch(arr, 1));
		System.out.println("Value found at:" + binarySearch(arr, 841));

	}

}
