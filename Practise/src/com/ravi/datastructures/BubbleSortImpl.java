package com.ravi.datastructures;

public class BubbleSortImpl {
public static void main(String[] args) {
	BubbleSort<Integer> sel = new BubbleSort<>(Integer.class);
	Integer[] a = { 3, 4, 1, 0, 1213, 80 };
	Integer[] sortTheList = sel.bubbleSort(a);
	sel.print(sortTheList);

		BubbleSort<String> sel1 = new BubbleSort<>(String.class);
	String[] a1 = { "Ra", "Vi", "Te" ,"As"};

	String[] sortTheList1 = sel1.bubbleSort(a1);
	sel1.print(sortTheList1);
}
}
