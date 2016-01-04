package com.ravi.datastructures;

public class LinkedListImpl {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(12);
		list.insert(123);
		 list.insert(34);
		 list.printList();
//		 System.out.println(list.remove(12));
//		list.printList();

		LinkedList<String> list1 = new LinkedList<String>("Ravi");
		// System.out.println(list.remove(12));
		// System.out.println(list.remove(18));
		list1.insert("Teja");
		list1.insert("Ravuri");
		
		// list.insert(34);
		list1.printList();
	}

}
