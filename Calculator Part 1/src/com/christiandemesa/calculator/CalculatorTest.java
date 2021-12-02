package com.christiandemesa.calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		
		// New instance
		Calculator calculation = new Calculator();
		
		// Tests
		calculation.setOperandOne(10.5);
		calculation.setOperation("+");
		calculation.setOperandTwo(5.2);
		calculation.performOperation();
		
	}
}
