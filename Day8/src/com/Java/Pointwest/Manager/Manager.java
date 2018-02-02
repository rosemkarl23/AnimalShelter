package com.Java.Pointwest.Manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.Java.Pointwest.UI.ViewAnimal;
import com.Java.Pointwest.beans.Animal;
import com.Java.Pointwest.beans.Cat;
import com.Java.Pointwest.beans.Dog;
import com.Java.Pointwest.beans.Parrot;
import com.Java.Pointwest.UI.UserInterface;

public class Manager {
	static Map<AnimalType, List<Animal>> animalList = new HashMap<>();
	static int ctr = 0;
	static String code;
	
	public enum AnimalType{
		Dog,
		Cat,
		Parrot;
	}
	
	public static void initializeLists() {
		animalList.put(AnimalType.Dog, new ArrayList<Dog>());
		animalList.put(AnimalType.Cat, new ArrayList<Cat>());
		animalList.put(AnimalType.Parrot, new ArrayList<Parrot>());
	}

	public static void dogMenu() {
		loop: while (true) {
			if (animalList.get(AnimalType.Dog).size() == 0) {
				System.out.println();
				System.out.println("DOG MENU PAGE");
				System.out.println("Please select an option: ");
				System.out.println("1. Add a Dog");
				System.out.println("2. Go Back to Home Page");
				System.out.print("Enter choice: ");

				Scanner choiceScanner = new Scanner(System.in);
				int userChoice = choiceScanner.nextInt();
				
				if (userChoice == 1) {
					code = "add";
				} else if (userChoice == 2) {
					code = "back";
				} else {
					System.out.println();
					System.out.println("** INVALID INPUT. PLEASE TRY AGAIN **");
					System.out.println();
					continue loop;
				}
				
				UserInterface.UserChoice(code, "dog");
			}
			else if (animalList.get(AnimalType.Dog).size() == 5) {
				System.out.println();
				System.out.println("DOG MENU PAGE");
				System.out.println("Please select an option: ");
				System.out.println("1. Remove a Dog");
				System.out.println("2. View all Dogs");
				System.out.println("3. Go Back to Home Page");
				System.out.print("Enter choice: ");
				
				Scanner choiceScanner = new Scanner(System.in);
				int userChoice = choiceScanner.nextInt();
				
				if (userChoice == 1) {
					code = "remove";
				} else if (userChoice == 2) {
					code = "view";
				} else if (userChoice == 3) { 
					code = "back";
				} else {
					System.out.println();
					System.out.println("** INVALID INPUT. PLEASE TRY AGAIN **");
					System.out.println();
					continue loop;
				}
				
				UserInterface.UserChoice(code, "dog");
			}
			else {
				System.out.println();
				System.out.println("DOG MENU PAGE");
				System.out.println("Please select an option: ");
				System.out.println("1. Add a Dog");
				System.out.println("2. Remove a Dog");
				System.out.println("3. View all Dogs");
				System.out.println("4. Go Back to Home Page");
				System.out.print("Enter choice: ");

				Scanner choiceScanner = new Scanner(System.in);
				int userChoice = choiceScanner.nextInt();
				
				if (userChoice == 1) {
					code = "add";
				} else if (userChoice == 2) {
					code = "remove";
				} else if (userChoice == 3) { 
					code = "view";
				} else if (userChoice == 4) {
					code = "back";
				} else {
					System.out.println();
					System.out.println("** INVALID INPUT. PLEASE TRY AGAIN **");
					System.out.println();
					continue loop;
				}
				
				UserInterface.UserChoice(code, "dog");
			}
		}
	}
	
	public static void catMenu() {
		loop: while (true) {
			if (animalList.get(AnimalType.Cat).size() == 0) {
				System.out.println();
				System.out.println("CAT MENU PAGE");
				System.out.println("Please select an option: ");
				System.out.println("1. Add a Cat");
				System.out.println("2. Go Back to Home Page");
				System.out.print("Enter choice: ");
				
				Scanner choiceScanner = new Scanner(System.in);
				int userChoice = choiceScanner.nextInt();
				
				if (userChoice == 1) {
					code = "add";
				} else if (userChoice == 2) {
					code = "back";
				} else {
					System.out.println();
					System.out.println("** INVALID INPUT. PLEASE TRY AGAIN **");
					System.out.println();
					continue loop;
				}
				
				UserInterface.UserChoice(code, "cat");
			}
			else if (animalList.get(AnimalType.Cat).size() == 5) {
				System.out.println();
				System.out.println("CAT MENU PAGE");
				System.out.println("Please select an option: ");
				System.out.println("1. Remove a Cat");
				System.out.println("2. View all Cats");
				System.out.println("3. Go Back to Home Page");
				System.out.print("Enter choice: ");

				Scanner choiceScanner = new Scanner(System.in);
				int userChoice = choiceScanner.nextInt();
				
				if (userChoice == 1) {
					code = "remove";
				} else if (userChoice == 2) {
					code = "view";
				} else if (userChoice == 3) { 
					code = "back";
				} else {
					System.out.println();
					System.out.println("** INVALID INPUT. PLEASE TRY AGAIN **");
					System.out.println();
					continue loop;
				}
				
				UserInterface.UserChoice(code, "cat");
			}
			else {
				System.out.println();
				System.out.println("CAT MENU PAGE");
				System.out.println("Please select an option: ");
				System.out.println("1. Add a Cat");
				System.out.println("2. Remove a Cat");
				System.out.println("3. View all Cats");
				System.out.println("4. Go Back to Home Page");
				System.out.print("Enter choice: ");

				Scanner choiceScanner = new Scanner(System.in);
				int userChoice = choiceScanner.nextInt();
				
				if (userChoice == 1) {
					code = "add";
				} else if (userChoice == 2) {
					code = "remove";
				} else if (userChoice == 3) { 
					code = "view";
				} else if (userChoice == 4) {
					code = "back";
				} else {
					System.out.println();
					System.out.println("** INVALID INPUT. PLEASE TRY AGAIN **");
					System.out.println();
					continue loop;
				}
				
				UserInterface.UserChoice(code, "cat");
			}
		}
	}
	
	public static void parrotMenu() {
		loop: while (true) {
			if (animalList.get(AnimalType.Parrot).size() == 0) {
				System.out.println();
				System.out.println("PARROT MENU PAGE");
				System.out.println("Please select an option: ");
				System.out.println("1. Add a Parrot");
				System.out.println("2. Go Back to Home Page");
				System.out.print("Enter choice: ");

				Scanner choiceScanner = new Scanner(System.in);
				int userChoice = choiceScanner.nextInt();
				
				if (userChoice == 1) {
					code = "add";
				} else if (userChoice == 2) {
					code = "back";
				} else {
					System.out.println();
					System.out.println("** INVALID INPUT. PLEASE TRY AGAIN **");
					System.out.println();
					continue loop;
				}
				
				UserInterface.UserChoice(code, "parrot");
			}
			else if (animalList.get(AnimalType.Parrot).size() == 5) {
				System.out.println();
				System.out.println("PARROT MENU PAGE");
				System.out.println("Please select an option: ");
				System.out.println("1. Remove a Parrot");
				System.out.println("2. View all Cats");
				System.out.println("3. Go Back to Home Page");
				System.out.print("Enter choice: ");

				Scanner choiceScanner = new Scanner(System.in);
				int userChoice = choiceScanner.nextInt();
				
				if (userChoice == 1) {
					code = "remove";
				} else if (userChoice == 2) {
					code = "view";
				} else if (userChoice == 3) { 
					code = "back";
				} else {
					System.out.println();
					System.out.println("** INVALID INPUT. PLEASE TRY AGAIN **");
					System.out.println();
					continue loop;
				}
				
				UserInterface.UserChoice(code, "parrot");
			}
			else {
				System.out.println();
				System.out.println("PARROT MENU PAGE");
				System.out.println("Please select an option: ");
				System.out.println("1. Add a Parrot");
				System.out.println("2. Remove a Parrot");
				System.out.println("3. View all Parrots");
				System.out.println("4. Go Back to Home Page");
				System.out.print("Enter choice: ");

				Scanner choiceScanner = new Scanner(System.in);
				int userChoice = choiceScanner.nextInt();
				
				if (userChoice == 1) {
					code = "add";
				} else if (userChoice == 2) {
					code = "remove";
				} else if (userChoice == 3) { 
					code = "view";
				} else if (userChoice == 4) {
					code = "back";
				} else {
					System.out.println();
					System.out.println("** INVALID INPUT. PLEASE TRY AGAIN **");
					System.out.println();
					continue loop;
				}
				
				UserInterface.UserChoice(code, "parrot");
			}
		}
	}
	
	public static void addAnimal(String animalType) {
		String name;
		String gender;
		int age;
		
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
				System.out.println();
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
				System.out.println();
			}
		}
	
		ctr++;
			
		if (animalType.equalsIgnoreCase("dog")) {
			Animal dog = new Dog();
			dog.type = "Dog";
			dog.name = name;
			dog.age = age;
			dog.gender = gender;
			dog.referenceID = 10000 + ctr;
			
			animalList.get(AnimalType.Dog).add(dog);
			
			System.out.println();
			System.out.println(name + " is now added.");
			System.out.println();
			
			dogMenu();
		} else if (animalType.equalsIgnoreCase("cat")) {
			Animal cat = new Cat();
			cat.type = "Cat";
			cat.name = name;
			cat.age = age;
			cat.gender = gender;
			cat.referenceID = 10000 + ctr;
			
			animalList.get(AnimalType.Dog).add(cat);
			
			System.out.println();
			System.out.println(name + " is now added.");
			System.out.println();
			
			catMenu();
		} else {
			Animal parrot = new Parrot();
			parrot.type = "Parrot";
			parrot.name = name;
			parrot.age = age;
			parrot.gender = gender;
			parrot.referenceID = 10000 + ctr;
			
			animalList.get(AnimalType.Dog).add(parrot);
			
			System.out.println();
			System.out.println(name + " is now added.");
			
			parrotMenu();
		}
	}
	
	public static void removeAnimal(String animalType) {
		boolean animalFound = false;
		Iterator animalDisplayIterator = null;
		
		if (animalType.equalsIgnoreCase("dog")) {
			List<Animal> dogList = animalList.get(AnimalType.Dog);
			animalDisplayIterator = dogList.iterator();
		} else if (animalType.equalsIgnoreCase("cat")) {
			List<Animal> catList = animalList.get(AnimalType.Cat);
			animalDisplayIterator = catList.iterator();
		} else if (animalType.equalsIgnoreCase("parrot")) {
			List<Animal> parrotList = animalList.get(AnimalType.Parrot);
			animalDisplayIterator = parrotList.iterator();
		}
		
		System.out.println();
		System.out.println("List of " + animalType + "s in the Shelter");
		while(animalDisplayIterator.hasNext()) {
			Animal animal = (Animal) animalDisplayIterator.next();
			System.out.println("Reference ID: " + animal.referenceID + "\t" + animal.name + "\t" + animal.type + "\t" + animal.age + "\t" + animal.gender);
		}
		
		Scanner deleteScanner = new Scanner(System.in);
		System.out.println();
		System.out.print("Please enter the reference ID of the animal to remove: ");
		int deleteChoice = deleteScanner.nextInt();
		
		if (animalType.equalsIgnoreCase("dog")) {
			List<Animal> dogList = animalList.get(AnimalType.Dog);
			Iterator dogIterator = dogList.iterator();
			
			while(dogIterator.hasNext()) {
				Animal animal = (Animal) dogIterator.next();
				if(animal.referenceID == deleteChoice) {
					dogIterator.remove();
					System.out.println();
					System.out.println("Pet No. " + animal.referenceID + " [" + animal.name + "] has been removed.");
					System.out.println();
					animalFound = true;
				}
			}
			
			dogMenu();
		} else if (animalType.equalsIgnoreCase("cat")) {
			List<Animal> catList = animalList.get(AnimalType.Cat);
			Iterator catIterator = catList.iterator();
			
			while(catIterator.hasNext()) {
				Animal animal = (Animal) catIterator.next();
				if(animal.referenceID == deleteChoice) {
					catIterator.remove();
					System.out.println();
					System.out.println("Pet No. " + animal.referenceID + " [" + animal.name + "] has been removed.");
					System.out.println();
					animalFound = true;
				}
			}
			
			catMenu();
		} else if (animalType.equalsIgnoreCase("parrot")) {
			List<Animal> parrotList = animalList.get(AnimalType.Parrot);
			Iterator parrotIterator = parrotList.iterator();
			
			while(parrotIterator.hasNext()) {
				Animal animal = (Animal) parrotIterator.next();
				if(animal.referenceID == deleteChoice) {
					parrotIterator.remove();
					System.out.println();
					System.out.println("Pet No. " + animal.referenceID + " [" + animal.name + "] has been removed.");
					System.out.println();
					animalFound = true;
				}
			}
			
			parrotMenu();
		}
	
		if (animalFound == false) {
			System.out.println();
			System.out.println("Animal ID not found.");
			System.out.println();
		}
	}
	
	public static void viewAnimal (String animalType) {
		ViewAnimal.displayAnimal(animalList, animalType);
	}
}
