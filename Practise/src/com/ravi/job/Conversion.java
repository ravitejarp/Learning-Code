package com.ravi.job;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Conversion {

	public static Object getFormat() {

		// return "0.0";
		return "10.258e4";
	}

	public long[] get() {
		long a = 10;
		return new long[] { a };
	}

	public static void main(String[] args) {
		System.out.println(BigDecimal.valueOf(Double.parseDouble(Conversion
				.getFormat().toString())));
		Double d = 90.0;
		System.out.println(BigDecimal.valueOf(12.32));
		System.out.println(Math.ceil(Math.cos(d.intValue())));
		System.out.println(Math.ceil(0.5));
	}
}
