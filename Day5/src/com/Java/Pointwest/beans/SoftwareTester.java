package com.Java.Pointwest.beans;

public class SoftwareTester extends Employee{
	public void computeSalary() {
		if (hoursWorked == 0.0) {
			totalSalary = 0.0;
		} else {
			totalSalary = ((salary * hoursWorked) * nightDiff) * tax;
		}
	}
}