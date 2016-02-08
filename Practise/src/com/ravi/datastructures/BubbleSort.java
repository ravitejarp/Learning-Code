package com.ravi.datastructures;

import java.lang.reflect.Array;

public class BubbleSort<T> {

	T[] a;
	public static final int MAX_SIZE = 20;
	int size = 0;

	public BubbleSort(Class<T> clazz) {
		a = (T[]) Array.newInstance(clazz, MAX_SIZE);
	}

	public T[] bubbleSort(T[] bubbleArray) {
		boolean flag = false;
		a = bubbleArray;
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = a.length - 1; j >= i + 1; j--)
				if (((Comparable<T>) a[j]).compareTo((T) a[j - 1]) < 0) {
					T temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
					flag = true;
				}
			
			if (!flag)
				break;
		}

		return bubbleArray;
	}

	public void print(T[] listOfSort) {
		for (T el : listOfSort) {
			System.out.print(el + "\t");
		}
		System.out.println();
	}

}
