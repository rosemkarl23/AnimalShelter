package com.pointwest.java.beans;

import com.pointwest.java.manager.CalculatorInputException;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public double sum(int a, int b) {
		return a+b;
	}
	
	//TODO
	//multiply
	//subtract
	
	public double divide(int a, int b) throws CalculatorInputException {
		
		double quotient = 0;
		
		try {
			quotient = a/b;	
		}catch(ArithmeticException e){
			CalculatorInputException ex = new CalculatorInputException(CalculatorInputException.CANNOT_DIVIDE_BY_ZERO_MESSAGE);
			throw ex;
		}catch(Exception e) {
			
		}
		return quotient;
	}

}
