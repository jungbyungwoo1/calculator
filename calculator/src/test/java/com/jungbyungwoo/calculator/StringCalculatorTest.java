package com.jungbyungwoo.calculator;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	private StringCalculator calculator0;
	private StringCalculator calculator1;
	private StringCalculator calculator2;

	@Before
	public void setUp() {
		calculator0 = new StringCalculator("1,2\n3");
		calculator1 = new StringCalculator("1,2\r\n3");
		calculator2 = new StringCalculator("1\n2\r\n3,4");
	}

	@Test
	public void testAddAll() {
		assertThat(calculator0.addAll(), is(6));
		assertThat(calculator1.addAll(), is(6));
		assertThat(calculator2.addAll(), is(10));
	}
}
