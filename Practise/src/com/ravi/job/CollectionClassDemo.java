package com.ravi.job;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionClassDemo {

	public static void main(String[] args) {
		List<Integer> lis = new ArrayList<Integer>();
		lis.add(123);
		lis.add(224);
		lis.add(99);
		lis.add(23);
		
		Iterator<Integer> itr = lis.iterator();
		
		
		
		
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
