package com.Java.Pointwest.com.UI;

import java.util.Scanner;

import com.Java.Pointwest.beans.Employee;
import com.Java.Pointwest.beans.HRPersonnel;
import com.Java.Pointwest.beans.SoftwareDev;
import com.Java.Pointwest.beans.SoftwareTester;

public class UserInterface {
	
	static Employee[] employeeArray = new Employee[10];
	static int ctr = 0;
	
	public static void MainMenu() {
		Scanner choiceScanner = new Scanner(System.in);
		System.out.println("MAIN MENU");
		System.out.println("[1] Create Employee");
		System.out.println("[2] Do Work");
		System.out.println("[3] Display salaries");
		System.out.print("Enter choice: ");
		int userChoice = choiceScanner.nextInt();
		UserChoice(userChoice);
	}
	
	public static void UserChoice(int userChoice) {
		if (userChoice == 1) {
			createEmployee();
		}
		else if (userChoice == 2) {
			DoWork.doWork(employeeArray);
		}
		else if (userChoice == 3) {
			ComputeSalary.displaySalary(employeeArray);
		}
		else {
			System.out.println();
			System.out.println("** INVALID INPUT. PLEASE TRY AGAIN **");
			System.out.println();
			MainMenu();
		}
	}
	
	public static void createEmployee() {
		Employee employee = new Employee();
		int employeeChoice;
		
		Scanner employeeScanner = new Scanner(System.in);
		System.out.println();
		System.out.println("Create Which Employee?");
		System.out.println("[1] Software Dev");
		System.out.println("[2] Software Tester");
		System.out.println("[3] HR Personnel");
		System.out.print("Enter choice: ");
		employeeChoice = employeeScanner.nextInt();
		
		if (employeeChoice == 1 || employeeChoice == 2 || employeeChoice == 3) {
			enterEmployeeDetails(employeeChoice);
		} else {
			System.out.println();
			System.out.println("** INVALID INPUT. PLEASE TRY AGAIN **");
			System.out.println();
			createEmployee();
		}
	}
	
	public static void enterEmployeeDetails(int employeeChoice) {
		String firstName;
		String lastName;
		
		if (ctr < 10) {		
			System.out.println();
			Scanner firstNameScanner = new Scanner(System.in);
			System.out.print("Enter first name: ");
			firstName = firstNameScanner.nextLine();
			Scanner lastNameScanner = new Scanner(System.in);
			System.out.print("Enter last name: ");
			lastName = lastNameScanner.nextLine();
			System.out.println();
			
			if (employeeChoice == 1) {
				Employee softwareDev = new SoftwareDev();
				softwareDev.type = "Software Dev";
				softwareDev.firstName = firstName;
				softwareDev.lastName = lastName;
				softwareDev.salary = 850.00;
				
				employeeArray[ctr] = softwareDev;
			} else if (employeeChoice == 2) {
				Employee softwareTester = new SoftwareTester();
				softwareTester.type = "Software Tester";
				softwareTester.firstName = firstName;
				softwareTester.lastName = lastName;
				softwareTester.salary = 850.00;
				
				employeeArray[ctr] = softwareTester;
			} else {
				Employee hrPersonnel = new HRPersonnel();
				hrPersonnel.type = "HR Personnel";
				hrPersonnel.firstName = firstName;
				hrPersonnel.lastName = lastName;
				hrPersonnel.salary = 400.00;
				
				employeeArray[ctr] = hrPersonnel;
			}
			
			ctr++;
		} else {
			System.out.println();
			System.out.println("** ARRAY IS FULL **");
		}
		
		MainMenu();
	}
	
	public static boolean computeAgain() {
		if (ctr <= 9) {
			while (true) {
				System.out.println("** ARRAY IS NOT YET FULL, DO YOU WANT TO ADD AN EMPLOYEE OR DO WORK? **");
				System.out.println("[1] YES");
				System.out.println("[2] NO");
				Scanner againScanner = new Scanner(System.in);
				if (againScanner.nextLine().equalsIgnoreCase("yes")) {
					System.out.println();
					MainMenu();
				} else if (againScanner.nextLine().equalsIgnoreCase("no")) {
					int count = ctr + 1;
					System.out.println();
					System.out.println("** LAST ARRAY CONSISTED OF " + count + " EMPLOYEE. **");
					System.out.println("** THANK YOU FOR USING THE SYSTEM **");
					return false;
				} else {
					System.out.println();
					System.out.println("** INVALID INPUT. PLEASE TRY AGAIN. **");
					continue;
				}
			}
		} else {
			while (true) {
				System.out.println("** ARRAY IS FULL. DO YOU WANT TO CLEAR THE ARRAY AND COMPUTE AGAIN? **");
				System.out.println("[1] YES");
				System.out.println("[2] NO");
				Scanner againScanner = new Scanner(System.in);
				if (againScanner.nextLine().equalsIgnoreCase("yes")) {
					System.out.println();
					ctr = 0;
					employeeArray = new Employee[10];
					MainMenu();
				} else if (againScanner.nextLine().equalsIgnoreCase("no")) {
					System.out.println();
					System.out.println("** PROGRAM ENDED. THANK YOU FOR USING THE SYSTEM. **");
					return false;
				} else {
					System.out.println();
					System.out.println("** INVALID INPUT. PLEASE TRY AGAIN. **");
					continue;
				}
			}
		}
	}
}