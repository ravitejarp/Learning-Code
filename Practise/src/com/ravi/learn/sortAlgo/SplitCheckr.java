package com.ravi.learn.sortAlgo;

public class SplitCheckr {

	public static void main(String[] args) {
		String s = "ravi, ,test, ,hello";
		String[] split = s.split(",", 3);
		for (String s12 : split) {
			System.out.print(s12);
		}
	}

}
