package com.Java.Pointwest.UI;

import com.Java.Pointwest.beans.Employee;

public class EmployeeDisplay {
	
	public static String displayEmployee(Employee employee) {
		String output;
		if (employee.isPaidByTheHour == false) {
			output = (employee.id + " " + employee.name + " a " + employee.jobTitle + " in the " + employee.department + " dept., is paid by the hour with a salary of " + employee.salary);
		} else {
			output = (employee.id + " " + employee.name + " a " + employee.jobTitle + " in the " + employee.department + " dept., is not paid by the hour with a salary of " + employee.salary);
		}
		return output;

	}
	
	public static void displayEmployeeList (Employee [] employeeArray) {
		int ctr = 1;
		for(Employee employee: employeeArray) {
			System.out.println(ctr + ") " + displayEmployee(employee));
			ctr++;
		}
	}
}
