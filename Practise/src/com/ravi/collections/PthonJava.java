package com.ravi.collections;

import java.util.HashMap;

public class PthonJava {
	public static void main(String[] args) {
		String s = "Raviteja";
		
		
		HashMap<String, String> map = new HashMap<>();
		map.put(s, "Teja");
		System.out.println(map.get("s"));
		
	}
}
