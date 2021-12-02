package com.christiandemesa.calculator;

import java.util.*;
public class Calculator implements java.io.Serializable {
	
	// Member variables
	
	// Create an ArrayList to hold multiple operands as doubles, and operations
	private ArrayList<Double> operands = new ArrayList<Double>();
	private ArrayList<String> operations = new ArrayList<String>();
	
	// int to keep track of the ArrayList's length
	private int operandsLength = 0;
	private int operationsLength = 0;
	
	// boolean to see if the ArrayLists or results are empty
	private boolean operandsExist = false;
	private boolean operationsExist = false;
	private boolean resultsExist = false;
	
	// results will be the final answer
	private double results = 0;
		
	// Constructor
	public Calculator() {
	}
		
	// Methods
	
	// Adds an operand to its array, and performs a function depending on the last operation in its array
	public void performOperation(double operand) {
		// If the ArrayList is empty, adds the operand, increments operandsLength, and switches operandsExist to true
		if(!operandsExist) {
			operands.add(operand);
			operandsLength++;
			operandsExist = true;
		}
		// Or if the ArrayList is not empty:
		else {
			// If the number of operands and operations is equal:
			if(operandsLength == operationsLength) {
				// Runs if the last element in the operations array is "*"
				if(operations.get(operandsLength - 1) == "*") {
					// Multiplies the last element in the operands array by the operand in the argument
					// .set() places the new above operand in the given index (operandsLength - 1), and removes the operand that was originally there
					operands.set(operandsLength - 1, (operands.get(operandsLength - 1) * operand));
					// Removes the "*" from the operations array because it was used above
					operations.remove(operationsLength - 1);
					// Decrements operationsLength because we removed a "*"
					operationsLength--;
				} 
				// Runs if the last element in the operations array is "/"
				else if(operations.get(operationsLength - 1) == "/") {
					// Divides the last element in the operands array by the operand in the argument
					// .set() places the new above operand in the given index (operandsLength - 1), and removes the operand that was originally there
					operands.set(operandsLength - 1, (operands.get(operandsLength - 1) / operand));
					// Removes the "/" from the operations array because it was used above
					operations.remove(operationsLength - 1);
					// Decrements operationsLength because we removed a "/"
					operationsLength--;
				} 
				// Runs if the last element in the operations array is "+", "-", or "="
				// We had "*" and "/" run immediately above because we are following the rules of PEMDAS
				else {
					operands.add(operand);
					operandsLength++;
				}
			}
		}
	}
	
	// Adds an operation to its array and performs a function depending on which operation was entered
	public void performOperation(String operation) {
		// If the operation in the argument is "=":
		if (operation == "=") {
			// If the operand array is not empty:
			if(operandsExist) {
				// Results is equal to the first operand in the array
				this.results = operands.get(0);
				for(int i = 1; i < operandsLength; i++) {
					// Adds the operand to results if operation is "+"
					if(operations.get(i - 1) == "+") {
						this.results += operands.get(i);
					} 
					// Subtracts the operand from results if the operation is "-"
					else {
						this.results -= operands.get(i);
					}
				}
				// Switches resultsExist to true
				this.resultsExist = true;
			}
		} 
		// If the operation in the argument is "+", "-", "*", or "/", and the operations array's length is one greater than the operands array length:
		else if((operation == "+" || operation == "-" || operation == "*" || operation == "/") && (operationsLength == operandsLength - 1)) {
			// Adds the operation to its array
			operations.add(operation);
			// Increments operationsLength
			operationsLength++;
			// Switches operationsExist to true
			operationsExist = true;
		} 
		// Runs if the operations array is not exactly one greater than the operands array, and/or the user entered a non-operation string
		else {
			System.out.println("Please enter another operand, or choose +, -, *, /, or =");
		}
	}
	
	// Returns the result
	public void getResults() {
		// Only runs if there is a result
		if(resultsExist == true) {
			System.out.println(this.results);
		}
	}
	
	// Did not include getters or setters for brevity
	
}
