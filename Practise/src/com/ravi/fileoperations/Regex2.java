package com.ravi.fileoperations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex2 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d*");
		Matcher m = p.matcher("ab34ef");
		boolean b = false;
		while (b = m.find()) {
			System.out.println(m.start() +"Patter"+ m.group());
		}
	}
}