package com.ravi.datastructures;

public class LinkedListImpl {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insert(123);
		list.insert(34);
		list.printList();
		System.out.println(list.remove(12));
		list.printList();

		LinkedList<String> list1 = new LinkedList<String>();
		list1.insert("Teja");
		list1.insert("Ravuri");

		list1.printList();

		list1.remove("Ravi");
		list1.remove("Teja");
		list1.printList();
	}

}
