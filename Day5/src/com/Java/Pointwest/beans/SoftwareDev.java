package com.Java.Pointwest.beans;

public class SoftwareDev extends Employee{
	public void computeSalary() {
		if (hoursWorked == 0.0) {
			totalSalary = 0.0;
		} else {
			totalSalary = (salary * hoursWorked) * tax;
		}
	}
}