package com.ravi.learn;

public class MergeSort {
	private long[] numbers;
	private long[] helper;
	int counter = 0;
	private int number;

	public long sort(long[] values) {
		this.numbers = values;
		number = values.length;
		this.helper = new long[number];
		long mergesort = mergesort(0, number - 1);
		return mergesort;
	}

	private long mergesort(int low, int high) {
		// check if low is smaller then high, if not then the array is sorted
		if (low < high) {
			// Get the index of the element which is in the middle
			int middle = low + (high - low) / 2;
			// Sort the left side of the array
			long left = mergesort(low, middle);
			// Sort the right side of the array
			long right = mergesort(middle + 1, high);
			// Combine them both
			long split = merge(low, middle, high);

			return left + right + split;
		}
		if (high - low == 1) {
			if (numbers[high] < numbers[low]) {
				long l = numbers[high];
				numbers[high] = numbers[low];
				numbers[low] = l;
				return 1;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}

	private int merge(int low, int middle, int high) {

		// Copy both parts into the helper array
		for (int i = low; i <= high; i++) {
			helper[i] = numbers[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= high) {

			if (helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;

			} else {
				numbers[k] = helper[j];
				j++;
				counter = counter + (middle - i);
			}

			k++;
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			numbers[k] = helper[i];
			k++;
			i++;
		}

		return counter;

	}
}