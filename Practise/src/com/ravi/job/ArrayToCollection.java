package com.ravi.job;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ArrayToCollection {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many elements you want to add to the array: ");
		int n = Integer.parseInt(in.readLine());
		String[] name = new String[n];
		for (int i = 0; i < n; i++) {
			name[i] = in.readLine();
		}
		List lii = Arrays.asList(name);
		System.out.println();
		/*for (String s : lii) {
			String str = s;

			System.out.println(str);
		}
*/
	}
}
