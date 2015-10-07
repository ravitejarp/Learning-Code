package com.ravi.job;

import java.util.Arrays;

public class ComparingTwoArrays {

	public static void main(String[] args) {
	int[][] arr1 = {{1,2},{1,2},{1,2},{1,2},{1,2},{1,2}};
	int[][] arr2 = {{1,2},{1,2},{1,2},{1,2},{1,2},{1,2}};
	for(int i=0;i<arr1.length;i++)
	{
		System.out.println(arr1[i]);
	}
	System.out.println(arr1==arr2);
	System.out.println(Arrays.deepEquals(arr1, arr2));
	}

}
