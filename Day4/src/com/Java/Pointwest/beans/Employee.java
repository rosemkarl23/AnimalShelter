package com.Java.Pointwest.beans;

public class Employee {
	public int id;
	public String name;
	public String department;
	public String jobTitle;
	public double salary;
	public static int employeeCount;
	public boolean isPaidByTheHour;
	
	public static final String COMPANY_NAME = "Pointwest";
	
	public boolean isPaidByTheHour() {
		if ("IT".equals(this.department) && "Contractual".equals(this.jobTitle)) {
			isPaidByTheHour = true;
		}
		else {
			isPaidByTheHour = false;
		}
		return isPaidByTheHour;
	}
}
