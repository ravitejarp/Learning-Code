package com.ravi.learn.sortAlgo;

import java.util.ArrayList;
import java.util.List;

public class ForK {
	public static void main(String[] args) {
		List<String> aList= new ArrayList<String>();
		aList.add("Kethi");
		aList.add("Swetha");
		ForK1.testForRet(aList);
		System.out.println(aList);
		
		String s="Ravi";
		testCode(s);
		System.out.println(s);
		
		Integer a = 100;
		ForK.testCode(a);
		System.out.println(a);
	}

	public static void testCode(Integer a) {
		a = 50;
	}
	
	public static void testCode(String a) {
		a = "Hello";
	}
	
	
}
