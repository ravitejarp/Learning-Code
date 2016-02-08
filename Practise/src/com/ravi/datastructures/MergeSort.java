package com.ravi.datastructures;

import java.lang.reflect.Array;

public class MergeSort<T> {
	private T[] arr;
	public static final int MAX_SIZE = 40;

	public MergeSort(Class<T> clazz) {
		arr = (T[]) Array.newInstance(clazz, MAX_SIZE);
	}

	public T[] mergeSort(T[] array, int startIndex, int finalIndex) {

		if (startIndex == finalIndex) {
			// return
		}

		int middle = (finalIndex - startIndex) / 2;

		return array;
	}

}
