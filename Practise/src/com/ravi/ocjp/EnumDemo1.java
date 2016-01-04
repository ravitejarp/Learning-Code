package com.ravi.ocjp;

enum CoffeSize1 {
	BIG(8), LARGE(10) {

		public String getLid() {
			return "A";
		}
	},
	HUGE(12);

	private int size;

	private CoffeSize1(int size) {
		this.size = size;
	}

	public String getLid() {
		return "C";
	}

}

public class EnumDemo1 {
	public static void main(String[] args) {
		System.out.println(CoffeSize1.BIG.getLid());
		System.out.println(CoffeSize1.LARGE.getLid());

	}
}
