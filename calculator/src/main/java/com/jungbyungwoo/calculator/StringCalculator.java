package com.jungbyungwoo.calculator;

import java.util.ArrayList;

public class StringCalculator {
	private static final String REGEX_DELIMITER = "(\r\n)|\n|,";
	
	private ArrayList<Integer> values;

	public StringCalculator(String input) {
		values = split(input);
	}

	private ArrayList<Integer> split(String input) {
		ArrayList<Integer> intValues = new ArrayList<Integer>();

		for (String strValue : input.split(REGEX_DELIMITER)) {
			intValues.add(Integer.parseInt(strValue));
		}

		return intValues;
	}

	public int addAll() {
		int sum = 0;

		for (int value : values) {
			sum += value;
		}

		return sum;
	}
}
