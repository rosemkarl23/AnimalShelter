package com.Java.Pointwest.com.UI;

import com.Java.Pointwest.beans.Employee;
import com.Java.Pointwest.beans.HRPersonnel;
import com.Java.Pointwest.beans.SoftwareDev;
import com.Java.Pointwest.beans.SoftwareTester;

public class ComputeSalary {
	public static void computeSalary(Employee[] employeeArray) {
		for (int i = 0; i < employeeArray.length; i++) {
			if (employeeArray[i] == null) {
				System.out.println();
				break;
			}
			else {
				Employee employee = employeeArray[i];
				if (employee.type.equalsIgnoreCase("Software Dev")) {
					((SoftwareDev) employeeArray[i]).computeSalary();
				} else if (employee.type.equalsIgnoreCase("Software Tester")) {
					((SoftwareTester) employeeArray[i]).computeSalary();
				} else if (employee.type.equalsIgnoreCase("HR Personnel")) {
					((HRPersonnel) employeeArray[i]).computeSalary();
				}
			}
		}
		return;
	}
	
	public static void displaySalary(Employee[] employeeArray) {		
		mainLoop: for (int i = 0; i < employeeArray.length;) {
			if (employeeArray[i] == null) {
				if (i == 0) {
					System.out.println();
					System.out.println("** NO EMPLOYEES IN THE ARRAY. PLEASE ADD AN EMPLOYEE BEFORE COMPUTING FOR SALARY. **");
					System.out.println();
					UserInterface.MainMenu();
				}
				System.out.println();
				break;
			} else {
				computeSalary(employeeArray);
				subLoop: for (int j = 0; j < employeeArray.length; j++) {
					if (employeeArray[j] == null) {
						System.out.println();
						break subLoop;
					} else {
						if (employeeArray[j].hoursWorked == 0.0) {
							System.out.println("Employee " + employeeArray[j].firstName + " " + employeeArray[j].lastName + " hasn't worked yet.");
						} else {
							System.out.println(employeeArray[j].type + ": " + employeeArray[j].firstName + " " + employeeArray[j].lastName + "'s salary is " + employeeArray[j].totalSalary);
						}
					}
				}
				break mainLoop;
			}
		}
	}
}