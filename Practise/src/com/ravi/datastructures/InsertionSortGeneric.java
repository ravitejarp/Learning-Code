package com.ravi.datastructures;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSortGeneric<T> {

	T[] arr;
	T[] sublist;
	public static final int MAX_SIZE = 20;

	public InsertionSortGeneric(Class<T> clazz) {
		arr = (T[]) Array.newInstance(clazz, MAX_SIZE);
		sublist = (T[]) Array.newInstance(clazz, MAX_SIZE);
	}

	public T[] insertionSort(T[] array) {
		arr = array;
		// for (int i = 1; i < arr.length; i++) {
		// flag = false;
		// for (int j = size - 1; j >= 0; j--) {
		// if (((Comparable<T>) arr[i]).compareTo((T) sublist[j]) < 0) {
		// T temp = sublist[j];
		// sublist[j] = arr[i];
		// sublist[j + 1] = temp;
		// flag = true;
		// } else {
		// if (!flag)
		// sublist[size++] = arr[i];
		// break;
		// }
		// }
		// if (flag)
		// size++;
		//
		// }

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (((Comparable<T>) arr[j]).compareTo((T) arr[j - 1]) < 0) {
					T temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break;
				}

			}
		}

		return arr;
	}

	public void print(T[] listOfSort) {
		for (T el : listOfSort) {
			System.out.print(el + "\t");
		}
		System.out.println();
	}
}
