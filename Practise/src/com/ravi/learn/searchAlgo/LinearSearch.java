package com.ravi.learn.searchAlgo;

public class LinearSearch {

	public static int linearSearch(int[] arr, int searchKey) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchKey) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {10,20,15,184,05,946,158,94,151,9};
		int linearSearch = linearSearch(arr, 152);
		isValueFound(linearSearch);
	}

	private static void isValueFound(int linearSearch) {
		if(linearSearch==-1)
		{
			System.out.println("Value not found");
		}
		else
		{
			System.out.println("Value found at location:"+linearSearch);
		}
	}

}
