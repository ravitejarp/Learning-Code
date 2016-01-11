package com.ravi.datastructures;

public class SelectionSortImpl {
	public static void main(String[] args) {

		SelectionSort<Integer> sel = new SelectionSort<>(Integer.class);
		Integer[] a = { 3, 4, 1, 0, 1213, 80 };
		Integer[] sortTheList = sel.sortTheList(a);
		sel.print(sortTheList);

		SelectionSort<String> sel1 = new SelectionSort<>(String.class);
		String[] a1 = { "Ra", "Vi", "Te" };

		String[] sortTheList1 = sel1.sortTheList(a1);
		sel1.print(sortTheList1);
	}
}
