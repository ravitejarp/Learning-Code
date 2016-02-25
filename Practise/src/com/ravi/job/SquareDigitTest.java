package com.ravi.job;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareDigitTest {

	@Test
	public void test() {
		assertEquals(9414, new SquareDigit().squareDigits(3212));
	}

}
