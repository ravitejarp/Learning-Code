package com.ravi.learn.sortAlgo;

public class XFormat {

	public static void printTheNumbers(int[] arr) {
		int k = 0;
		for (int i = 0; i <= arr.length - 1; i++) {

			if (i < arr.length / 2) {
				for (k = 0; k < i; k++)
					System.out.print("\t");
				System.out.print(arr[i]);

				for (int j = k + 1; j < arr.length - i; j++) {
					System.out.print("\t");
				}
				System.out.print(arr[arr.length - 1 - i]);
			} else {
				if (arr[arr.length - 1 - i] != arr[i]) {
					for (k = arr.length - 1; k > i; k--)
						System.out.print("\t");
					System.out.print(arr[arr.length - 1 - i]);
					for (int j = arr.length/2; j < arr.length; j++) {
						System.out.print("\t");
					}
					System.out.print(arr[i]);
				} else {
					for (k = 1; k <= i; k++)
						System.out.print("\t");	
					System.out.println(arr[i]);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		printTheNumbers(arr);
	}

}
