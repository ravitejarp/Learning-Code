package com.ravi.ocjp;

enum CoffeSize {
	BIG(8), LARGE(10), HUGE(12);
	private int size;

	CoffeSize(int size) {
		this.size = size;

	}

	public int getSize() {
		return size;
	}
}

public class EnumDemo {
	public static void main(String[] args) {
		System.out.println(CoffeSize.BIG.getSize());
		System.out.println(CoffeSize.BIG);
		CoffeSize[] values = CoffeSize.values();
		for (CoffeSize c1 : values) {
			System.out.println(c1);
		}

	}

}
