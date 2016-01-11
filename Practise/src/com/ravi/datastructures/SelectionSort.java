package com.ravi.datastructures;

import java.lang.reflect.Array;

public class SelectionSort<T> {

	T a[];
	private static final int MAX_SIZE = 10;

	public SelectionSort(Class<T> clazz) {
		a = (T[]) Array.newInstance(clazz, MAX_SIZE);
	}

	public T[] sortTheList(T[] array) {

		for (int i = 0; i < array.length; i++) {
			int indexToSwap = i;
			T small = array[i];
			for (int j = i + 1; j < array.length; j++) {
				if ((((Comparable<T>) array[j]).compareTo((T) small)) < 0) {

					small = array[j];
					indexToSwap = j;
				}
			}
			array = swap(array, i, indexToSwap);
		}

		return array;
	}

	public void print(T[] listOfSort) {
		for (T el : listOfSort) {
			System.out.print(el + "\t");
		}
		System.out.println();
	}

	public T[] swap(T[] list, int first, int second) {
		T temp = list[first];
		list[first] = list[second];
		list[second] = temp;

		return list;
	}

}
