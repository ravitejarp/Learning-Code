package com.ravi.job;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BinarySearchDemo {

	public boolean search(ArrayList<Integer> array, int value) {
		ArrayList<Integer> arrayCopy = (ArrayList<Integer>) array.clone();

		int first = 0;
		int last = arrayCopy.size();
		int middle = (first + last) / 2;
		while (first < last) {
			if (arrayCopy.get(middle) == value) {
				return true;
			}

			last = (first + last) / 2;

		}

		return false;

	}

	public static void main(String[] args) throws IOException {

		BinarySearchDemo ls = new BinarySearchDemo();
		ArrayList<Integer> listToSearch = ls.getValues();
		int value = 15;
		System.out.println(ls.search(listToSearch, value));

	}

	public ArrayList<Integer> getValues() throws IOException {
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while ((line = br.readLine()) != null) {
			if (line.equals("")) {
				break;
			} else {
				arr.add(Integer.parseInt(line));
			}
		}
		return arr;
	}

}
