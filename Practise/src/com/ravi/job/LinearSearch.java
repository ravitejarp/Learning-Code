package com.ravi.job;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LinearSearch {

	public boolean search(ArrayList<Integer> array, int value) {
		for (int i : array) {
			if (i == value)
				return true;

		}
		return false;
	}

	public static void main(String[] args) throws IOException {

		LinearSearch ls = new LinearSearch();
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
