package com.ravi.job;

import java.util.ArrayList;
import java.util.HashSet;

public class CustomDataStructure<T> {

	T t;
	HashSet<T> hash = new HashSet<>();

	public CustomDataStructure(T type) {
		this.t = type;
	}

	public void insert(T o) {

	}

	public static void main(String[] args) {
		CustomDataStructure cds = new CustomDataStructure(Integer);
	}
}
