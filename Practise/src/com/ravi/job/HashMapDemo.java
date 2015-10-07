package com.ravi.job;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMapDemo = new HashMap<String, Integer>();
		hashMapDemo.put("Ravi", 75);
		hashMapDemo.put("Teja", 71);
		hashMapDemo.put("Rai", 72);
		hashMapDemo.put("Rvi", 74);
		hashMapDemo.put("Ri", 76);

		int markOf = hashMapDemo.get("Ravi");
		System.out.println("Roll no is:" + markOf);
		hashMapDemo.remove("Ri");
		if(hashMapDemo.containsKey("Ri"))
		{
			System.out.println("No more RI");
		}
		else
		{
			System.out.println("Some more faliure");
		}
	}

}
