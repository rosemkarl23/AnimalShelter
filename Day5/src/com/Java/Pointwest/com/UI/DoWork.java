package com.Java.Pointwest.com.UI;

import com.Java.Pointwest.beans.Employee;

public class DoWork {
	public static void doWork(Employee[] employeeArray) {
		for (int i = 0; i < employeeArray.length; i++) {
			if (employeeArray[i] == null) {
				if (i == 0) {
					System.out.println();
					System.out.println("** NO EMPLOYEES IN THE ARRAY. PLEASE ADD AN EMPLOYEE BEFORE DOING WORK. **");
					System.out.println();
					UserInterface.MainMenu();
				}
				System.out.println();
				break;
			} else {
				if (employeeArray[i].type.equalsIgnoreCase("HR Personnel")) {
					employeeArray[i].hoursWorked += 8.0;
				} else {
					employeeArray[i].hoursWorked += 6.5;
				}
				System.out.println("Work has been done.");
			}
		}
		
		UserInterface.MainMenu();
	}
}
