package com.ravi.innerClasses;

public class ArraysDS {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 15, 40, 50, 60, 70, 80 };
		boolean searchStatus = false;
		int search = 98;
		int i;
		int toDelete = 15;
		int size = a.length;
		System.out.println("Size is:" + size);
		for (int a1 : a)
			System.out.println(a1);

		for (i = 0; i < size; i++) {
			if (a[i] == search)
				searchStatus = true;
		}
		if (searchStatus)
			System.out.println("Search text found and is at location:" + i);
		else
			System.out.println("Search text not found");

		for (i = 0; i < size; i++) {
			if (a[i] == toDelete) {
				System.out.println("Found and deleting");
				for (int j = i; j < size - 1; j++) {
					if (!(j + 1 > size - 1))
						a[j] = a[j + 1];
					else
						a[j] = 0;
				}
				break;
			}
		}

		for (int k = 0; k < size; k++)
			System.out.println(a[k]);

	}
}
