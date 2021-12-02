package com.christiandemesa.calculator;

public class Calculator implements java.io.Serializable {
	
	// Member variables
	private double operandOne;
	private String operation;
	private double operandTwo;
	private double results;
	
	// Constructor
	public Calculator() {
	}
	
	// Method
	public void performOperation() {
		if(getOperation() == "+") {
			this.results = getOperandOne() + getOperandTwo();
			getResults();
		}
		else {
			this.results = getOperandOne() - getOperandTwo();
			getResults();
		}
	}
	
	// operandOne getter
	public double getOperandOne() {
		System.out.println(this.operandOne);
		return operandOne;
	}
	
	// operandOne setter
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
		getOperandOne();
	}
	
	// operation getter
	public String getOperation() {
		System.out.println(this.operation);
		return operation;
	}
	
	// operation setter
	public void setOperation(String operation) {
		if(operation == "+" || operation == "-") {
			this.operation = operation;
			getOperation();
		}
		else {
			System.out.println("Please choose + or -");
		}
	}
	
	// operandTwo getter
	public double getOperandTwo() {
		System.out.println(this.operandTwo);
		return operandTwo;
	}
		
	// operandOne setter
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
		getOperandTwo();
	}
	
	// results getter
	public double getResults() {
		System.out.println(this.results);
		return results;
	}
	
	// results setter
	public void setResults(double results) {
		this.results = results;
		getResults();
	}
	
}
