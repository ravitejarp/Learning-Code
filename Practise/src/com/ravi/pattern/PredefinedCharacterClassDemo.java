package com.ravi.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedCharacterClassDemo {

	public static void main(String[] args) {
		/*
		 * \s-->Space character \S-->Except space character match anyother
		 * characters \d-->Digit(Any digit from 0-9) \D-->Except digit any
		 * character \w-->Any word character(Any alphanumeric) \W-->Except word
		 * character(Any alphanumeric)-->Special characters .-->Any
		 * character(Alphanumeric or special character) a+-->At least 1.
		 * abaabaaab
		 * a+-->At least one a
		 * a*-->Any number of a including 0
		 */

		String regex = "a?";
		Pattern pattern = Pattern.compile(regex);
		// Matcher match = pattern.matcher("a7b k@9");
		Matcher match = pattern.matcher("abaabaaab");
		while (match.find()) {
			System.out.println(match.start() + "..." + match.group());
		}
	}
}
