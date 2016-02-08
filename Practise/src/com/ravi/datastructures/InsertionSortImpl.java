package com.ravi.datastructures;

public class InsertionSortImpl {
	public static void main(String[] args) {
		InsertionSortGeneric<Integer> sel = new InsertionSortGeneric<>(
				Integer.class);
		Integer[] a = { 3, 4, 1, 0, 1213, 80 };
		Integer[] sortTheList = sel.insertionSort(a);
		sel.print(sortTheList);

		InsertionSortGeneric<String> sel1 = new InsertionSortGeneric<>(
				String.class);
		String[] a1 = { "Ra", "Vi", "Te", "As" };

		String[] sortTheList1 = sel1.insertionSort(a1);
		sel1.print(sortTheList1);
	}
}
