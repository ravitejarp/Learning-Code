package com.ravi.job;

public class ArrayFinalDemo {

	public static void main(String[] args) {
		final int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = arr1;
		System.out.println(arr1 == arr2);
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i] * 12;
			System.out.println(arr2[i]);
			arr1[i] = 12;
		}

	}

}
