package com.pointwest.java.main;


import org.apache.log4j.Logger;

import com.pointwest.java.beans.Calculator;
import com.pointwest.java.manager.CalculatorInputException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger myLogger = Logger.getLogger(Main.class);
		int x = 0;
		while (x<15) {
		
		myLogger.trace("Trace Message!");
		myLogger.debug("Debug Message!");
		myLogger.info("Info Message!");
		myLogger.warn("Warn Message!");
		myLogger.error("Error Message!");
		myLogger.fatal("Fatal Message!");
		x++;
		}
//		Calculator calculator = new Calculator();
//		int firstNum = 25;
//		int secondNum = 0;
//		
//		System.out.println("Divide numbers: ");
//		System.out.println(firstNum + "/" + secondNum);
//		try {
//			System.out.println(calculator.divide(firstNum, secondNum));
//		} catch (CalculatorInputException e) {
//			// TODO Auto-generated catch block
//			//System.out.println("Cannot divide number by zero!");
//			System.out.println(e.getDisplayMessage());
//		}
//		System.out.println("Program Ends!");
		
	//CAll UI
	}

}
