package com.ravi.learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RearrangeList {

	public static List<Integer> getRearranged(int[] arr) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0, j = arr.length - 1; i < arr.length && j >= 0; i++, j--) {
			if (i == j) {
				list.add(arr[i]);
				break;
			}
			if (i > j) {
				break;
			}
			list.add(arr[i]);
			list.add(arr[j]);
		}

		return list;
	}

	public static void main(String[] args) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr = { 1, 2, 3, 4 };
		List<Integer> rearranged = getRearranged(arr);
		Iterator<Integer> iterator = rearranged.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
