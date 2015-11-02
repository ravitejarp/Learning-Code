package com.ravi.learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseArrayWithSepcial {
	public static void main(String[] args) {
		Pattern patt = Pattern.compile("[a-zA-Z]");
		// String str = "a,b$c";
		String str = "Ab,c,de!$";
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			Matcher matcher = patt.matcher(str.charAt(i) + "");
			if (!matcher.matches()) {
				temp = str.charAt(str.length() - 1 - i) + temp;
			} else {
				temp = str.charAt(i) + temp;
			}

		}
		System.out.println(temp);
	}
}
