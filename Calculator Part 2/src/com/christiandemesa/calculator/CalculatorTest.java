package com.christiandemesa.calculator;

public class CalculatorTest {
	public static void main(String[] args) {

		// New instance
		Calculator calculation = new Calculator();
				
		// Tests
		calculation.performOperation(10.5);
		calculation.performOperation("+");
		calculation.performOperation(5.2);
		calculation.performOperation("*");
		calculation.performOperation(10);
		calculation.performOperation("=");
		calculation.getResults();

	}
}
