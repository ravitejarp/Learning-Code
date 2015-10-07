package com.ravi.fileoperations;

import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {
		Console c = System.console();
		char[] pw;
		pw = c.readPassword("%s","pw:");
		for(char ch:pw)
			System.out.println(ch);

	}

}
