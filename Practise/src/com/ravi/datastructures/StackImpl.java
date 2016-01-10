package com.ravi.datastructures;

public class StackImpl {

	public static void main(String[] args) {
		Stack<String> stac = new Stack<String>();
		stac.push("12");
		System.out.println("Peek:" + stac.peek());
		try {
			System.out.println("POP:" + stac.pop());
			System.out.println("POP:" + stac.pop());
		} catch (StackEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stac.push("Ravi");
		System.out.println("Is empty:" + stac.isEmpty());
		System.out.println("Size:" + stac.size());
		stac.printData();
		stac.push("1");
		stac.push("11");
		System.out.println(stac.getMinElement());

	}

}
