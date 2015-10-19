package com.ravi.innerClasses;

public class ArrayCreatorClass {
	private long[] a;

	public ArrayCreatorClass(int size) {
		a = new long[size];
	}

	public void setElem(int index, long value) {
		a[index] = value;
	}

	public long getElem(int index) {
		return a[index];
	}

}
