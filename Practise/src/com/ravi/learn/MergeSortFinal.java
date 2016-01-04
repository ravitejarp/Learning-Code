package com.ravi.learn;

import java.util.Random;

public class MergeSortFinal {
	int[] original;
	int[] temp;

	public MergeSortFinal(int size) {
		this.original = new int[size];
		this.temp = new int[size];

	}

	public void merge(int[] arr, int first, int last) {
		if (first < last) {
			int middle = (first + last) / 2;
			merge(arr, first, middle);
			merge(arr, middle + 1, last);
			arr = sortAndMerge(arr, first, middle, last);
		}
	}

	private int[] sortAndMerge(int[] arr, int first, int middle, int last) {
		for (int count = 0; count < arr.length; count++) {
			temp[count] = arr[count];
		}
		int i = first;
		int k = 0;
		int j = middle + 1;
		int toUpdate = 0;
		int endValue = 0;
		while (i <= middle && j <= last && j < arr.length) {
			if (temp[i] > temp[j]) {
				arr[k] = temp[j];
				j++;
			} else {
				arr[k] = temp[i];
				i++;
			}
			k++;
		}

		if (i >= middle) {
			toUpdate = j;
			endValue = last - 1;
		} else {
			toUpdate = i;
			endValue = middle;
		}

		while (toUpdate <= endValue) {
			arr[++k] = temp[++toUpdate];
		}
		System.out
				.println("Iteration Start--------------------------------------------------------------");
		for (int count = 0; count < arr.length; count++) {

			System.out.println(arr[count]);
		}
		System.out
				.println("Iteration End--------------------------------------------------------------");
		return arr;
	}

	public static void main(String[] args) {
		MergeSortFinal msf = new MergeSortFinal(15);
		Random r = new Random();
		System.out.println("Original");
		System.out.println("---------------------");
		for (int i = 0; i < 15; i++) {
			msf.original[i] = r.nextInt(100);
		}
		for (int k = 0; k < msf.original.length; k++) {
			System.out.println(msf.original[k]);
		}
		System.out.println("---------------------");
		msf.merge(msf.original, 0, msf.original.length - 1);

	}
}
