package com.Java.Pointwest.UI;

import com.Java.Pointwest.beans.Animal;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.Java.Pointwest.UI.UserInterface;

public class RemoveAnimal {
	public static void removeAnimal(List<Animal> animalList) {
		boolean animalFound = false;
	
		Iterator iterator = animalList.iterator();
		while(iterator.hasNext()) {			
			Animal animal = (Animal) iterator.next();
			
			ViewAnimal.viewAnimal(animal);
			
			System.out.println("Reference ID: " + animal.referenceID + "\t" + animal.name + "\t" + animal.type + "\t" + animal.age + "\t" + animal.gender);
		}
		Scanner deleteScanner = new Scanner(System.in);
		System.out.println();
		System.out.print("Please enter the reference ID of the animal to remove: ");
		int deleteChoice = deleteScanner.nextInt();
		
		Iterator iterator2 = animalList.iterator();
		while(iterator2.hasNext()) {
			Animal animal2 = (Animal) iterator2.next();
			if(animal2.referenceID == deleteChoice) {
				iterator2.remove();
				System.out.println();
				System.out.println("Pet No. " + animal2.referenceID + " [" + animal2.name + "] has been removed.");
				System.out.println();
				animalFound = true;
			}
		}
		if (animalFound == false) {
			System.out.println();
			System.out.println("Animal ID not found.");
			System.out.println();
		}
	UserInterface.HomePage();
	}			
}