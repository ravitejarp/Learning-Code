package com.ravi.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClassesDemo {

	public static void main(String[] args) {

		String regex = "[abc]";
		String regex1 = "[^abc]";// Except a,b,c another
		String regex2 = "[A-Z]";// Any upper case Alphabet Symbol
		String regex3 = "[0-9]";// Any digit from 0-9
		String regex4 = "[a-zA-Z0-9]";// Any Alphanumeric
		String regex5 = "[^a-zA-Z0-9]";// All special characters i.e except
										// Alphanumeric characters
		Pattern pattern = Pattern.compile(regex3);
		Matcher matcher = pattern.matcher("a7b@z#9");
		while (matcher.find()) {
			System.out.println(matcher.start());
			System.out.println(matcher.group());
		}

	}

}
