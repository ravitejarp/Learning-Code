package com.ravi.learn.sortAlgo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternCheck {

	public static void main(String[] args) {

		String s = "*ca11[*";
		String s2 = "ca11";

		String pattern = "^[0-9,a-z,A-Z\\*]*$";
		// Aphanum + symbol *
		//

		// final static String LPAR_FILTER_PATTERN_STRING =
		// "^[^+-.!@#$%^&();\\/\\|<>\"'=_:{}\\[\\]`]$";

		// // final String pattern =
		// "^[^+-.!@#$%^&();\\/\\|<>\"'=_:{}\\[\\]`]$";
		// final Pattern compile = Pattern.compile(pattern);
		// Matcher matcher = compile.matcher(s);
		//
		// System.out.println(matcher.find());
		//
		// s = s.replaceAll("\\*", "[a-z,A-Z,0-9]*");
		// System.out.println(s);
		//
		// System.out.println("Match:" + s2.matches(s));

		String s12 = "systemType=ZOS, UUID=12937192752, sysplexName=PLEXC1, lparName=CA11, zosName=CA11, cecSerialNumber=44D07";
		s12 = s12.replaceAll(" ", "");
		System.out.println(s12.trim());

		String sample = "CA11, ";
		String[] split = sample.split(",", -1);
		for (String s256 : split)
			System.out.println(s256 + ",");
	}

	// lpar*1 *lpar1 lpar1* lp*1* **lpar*1**23a*={}[]`

}
