package com.Java.Pointwest.UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

import com.Java.Pointwest.UI.RemoveAnimal;
import com.Java.Pointwest.UI.ViewAnimal;
import com.Java.Pointwest.beans.Animal;
import com.Java.Pointwest.beans.Dog;
import com.Java.Pointwest.beans.Cat;
import com.Java.Pointwest.beans.Parrot;

public class UserInterface {

	static List<Animal> animalList = new ArrayList<Animal>();
	static int ctr = 0;
	
	public static void HomePage() {
		if (animalList.size() == 0) {
			Scanner choiceScanner = new Scanner(System.in);
			System.out.println("Welcome to Sem's Animal Shelter!");
			System.out.println("Please select an option: ");
			System.out.println("1. Add an Animal");
			System.out.print("Enter choice: ");
			int userChoice = choiceScanner.nextInt();
			UserChoice(userChoice);
		}
		else if (animalList.size() == 10) {
			Scanner choiceScanner = new Scanner(System.in);
			System.out.println("Welcome to Sem's Animal Shelter!");
			System.out.println("Please select an option: ");
			System.out.println("1. Remove an Animal");
			System.out.println("2. View all Animals");
			System.out.print("Enter choice: ");
			int userChoice = choiceScanner.nextInt();
			UserChoice(userChoice);
		}
		else {
			Scanner choiceScanner = new Scanner(System.in);
			System.out.println("Welcome to Sem's Animal Shelter!");
			System.out.println("Please select an option: ");
			System.out.println("1. Add an Animal");
			System.out.println("2. Remove an Animal");
			System.out.println("3. View all Animals");
			System.out.print("Enter choice: ");
			int userChoice = choiceScanner.nextInt();
			UserChoice(userChoice);
		}
	}
	
	public static void UserChoice(int userChoice) {
		if (animalList.size() == 0) {
			if (userChoice == 1) {
				addAnimal();
			}
			else {
				System.out.println();
				System.out.println("** INVALID INPUT. PLEASE TRY AGAIN **");
				System.out.println();
				HomePage();
			}
		}
		else if (animalList.size() == 10){
			if (userChoice == 1) {
				RemoveAnimal.removeAnimal(animalList);
			}
			else if (userChoice == 2) {
				ViewAnimal.displayAnimal(animalList);
			}
			else {
				System.out.println();
				System.out.println("** INVALID INPUT. PLEASE TRY AGAIN **");
				System.out.println();
				HomePage();
			}
		}
		else {
			if (userChoice == 1) {
				addAnimal();
			}
			else if (userChoice == 2) {
				RemoveAnimal.removeAnimal(animalList);
			}
			else if (userChoice == 3) {
				ViewAnimal.displayAnimal(animalList);
			}
			else {
				System.out.println();
				System.out.println("** INVALID INPUT. PLEASE TRY AGAIN **");
				System.out.println();
				HomePage();
			}
		}
	}
	
	public static void addAnimal() {
		Animal animal = new Animal();
		int animalChoice;
		
		Scanner animalScanner = new Scanner(System.in);
		System.out.println();
		System.out.println("What are you trying to add?");
		System.out.println("1. A Dog");
		System.out.println("2. A Cat");
		System.out.println("3. A Parrot");
		System.out.print("Enter choice: ");
		animalChoice = animalScanner.nextInt();
		
		if (animalChoice == 1 || animalChoice == 2 || animalChoice == 3) {
			enterAnimalDetails(animalChoice);
		} else {
			System.out.println();
			System.out.println("** INVALID INPUT. PLEASE TRY AGAIN **");
			System.out.println();
			addAnimal();
		}
	}
	
	public static void enterAnimalDetails(int animalChoice) {
		String name;
		String gender;
		int age;
		int referenceID;
		
		if (ctr < 11) {		
			System.out.println();
			System.out.print("Enter Name: ");
			Scanner nameScanner = new Scanner(System.in);
			name = nameScanner.nextLine();
			
			while (true) {
				System.out.print("Enter Age (In Years): ");
				Scanner ageScanner = new Scanner(System.in);
				age = ageScanner.nextInt();
				if (age < 0) {
					System.out.println();
					System.out.println("** INVALID AGE. PLEASE INPUT A VALID AGE. **");
					continue;
				} else {
					break;
				}
			}
			
			while (true) {
				System.out.print("Enter Gender (Male/Female): ");
				Scanner genderScanner = new Scanner(System.in);
				gender = genderScanner.nextLine();
				if (gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female")) {
					break;
				} else {
					System.out.println();
					System.out.println("** INVALID GENDER. PLEASE INPUT A VALID GENDER. **");
				}
			}
			
			if (animalChoice == 1) {
				Animal dog = new Dog();
				dog.type = "Dog";
				dog.name = name;
				dog.age = age;
				dog.gender = gender;
				dog.referenceID = 10000 + ctr;
				
				animalList.add(dog);
			} else if (animalChoice == 2) {
				Animal cat = new Cat();
				cat.type = "Cat";
				cat.name = name;
				cat.age = age;
				cat.gender = gender;
				cat.referenceID = 10000 + ctr;
				
				animalList.add(cat);
			} else {
				Animal parrot = new Parrot();
				parrot.type = "Parrot";
				parrot.name = name;
				parrot.age = age;
				parrot.gender = gender;
				parrot.referenceID = 10000 + ctr;
				
				animalList.add(parrot);
			}
			System.out.println();
			System.out.println(name + " is now added.");
			System.out.println();
			ctr++;
		} else {
			System.out.println();
			System.out.println("The animal shelter is now full. Thank you!");
		}
		
		runAgain();
	}
	
	public static boolean runAgain() {
		
		while (true) {
			if (animalList.size() < 10) {
				System.out.println("** ANIMAL SHELTER IS NOT YET FULL, DO YOU STILL WANT TO CONTINUE? **");
				System.out.println("1. YES");
				System.out.println("2. NO");
				System.out.println("Enter choice: ");
				Scanner againScanner = new Scanner(System.in);
				int again = againScanner.nextInt();
				if (again == 1) {
					System.out.println();
					HomePage();
				} else if (again == 2) {
					System.out.println();
					System.out.println("** PROGRAM ENDED. THANK YOU FOR USING THE SYSTEM. **");
				} else {
					System.out.println();
					System.out.println("** INVALID INPUT. PLEASE TRY AGAIN. **");
					continue;
				}
			}
			else {
				System.out.println("** ANIMAL SHELTER IS FULL. DO YOU STILL WANT TO VIEW ANIMAL SHELTER OR REMOVE AN ANIMAL? **");
				System.out.println("1. YES");
				System.out.println("2. NO");
				Scanner againScanner = new Scanner(System.in);
				int again = againScanner.nextInt();
				if (again == 1) {
					System.out.println();
					HomePage();
				} else if (again == 2) {
					System.out.println();
					System.out.println("** PROGRAM ENDED. THANK YOU FOR USING THE SYSTEM. **");
					break;
				} else {
					System.out.println();
					System.out.println("** INVALID INPUT. PLEASE TRY AGAIN. **");
					continue;
				}
			}
			return false;
		}
		return false;
	}
}
