package com.ravi.learn;

public class ReOrderArray {
	public static void main(String[] args) {
		int[] arr = { 10, 11, 12 };
		int[] index = { 1, 0, 2 };
		if (arr.length != index.length) {
			System.out.println("Arrays length doesnt match");
		}
		for (int i = 0; i < index.length; i++) {
			int indexToReplace = arr[index[i]];
			int temp = arr[indexToReplace];
			int tobeReplaced = arr[i];
			arr[i] = temp;

		}
	}

}
