package com.ravi.learn;

public class ArrayDemo {

	public static void main(String[] args) {
		ArrayClass arr = new ArrayClass(20);
		arr.insert(10, 0);
		arr.insert(1, 2);
		arr.insert(2, 243);
		arr.insert(3, 29);
		arr.insert(4, 07);
		arr.insert(5, 1232);
		arr.insert(6, 12);
		arr.insert(7, 345);
		arr.insert(8, 4);
		arr.insert(9, 657);
		arr.insert(10, 2);
		System.out.println("Search is found at:" + arr.search(123));
		System.out.println("Deleted at:" + arr.delete(29));
		arr.display();
	}

}
