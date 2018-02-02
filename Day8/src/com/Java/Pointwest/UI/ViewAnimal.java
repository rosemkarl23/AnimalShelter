package com.Java.Pointwest.UI;

import com.Java.Pointwest.beans.Animal;
import com.Java.Pointwest.beans.Dog;
import com.Java.Pointwest.beans.Cat;
import com.Java.Pointwest.beans.Parrot;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.Java.Pointwest.Manager.Manager.AnimalType;
import com.Java.Pointwest.UI.UserInterface;

public class ViewAnimal {
	public static void viewAnimal(Animal animal) {
		if (animal.type.equalsIgnoreCase("Dog")) {
			((Dog) animal).getSound();
		} else if (animal.type.equalsIgnoreCase("Cat")) {
			((Cat) animal).getSound();
		} else if (animal.type.equalsIgnoreCase("Parrot")) {
			((Parrot) animal).getSound();
		}
		return;
	}
	
	public static void displayAnimal(Map<AnimalType, List<Animal>> animalList, String animalType) {	
		Iterator animalIterator = null;
		
		System.out.println();
		System.out.println("Meet our lovely " + animalType + " friends!");
		
		if (animalType.equalsIgnoreCase("dog")) {
			List<Animal> dogList = animalList.get(AnimalType.Dog);
			animalIterator = dogList.iterator();
		} else if (animalType.equalsIgnoreCase("cat")) {
			List<Animal> catList = animalList.get(AnimalType.Cat);
			animalIterator = catList.iterator();
		} else if (animalType.equalsIgnoreCase("parrot")) {
			List<Animal> parrotList = animalList.get(AnimalType.Parrot);
			animalIterator = parrotList.iterator();
		}
		
		while(animalIterator.hasNext()) {			
			Animal animal = (Animal) animalIterator.next();
			
			viewAnimal(animal);
			
			System.out.print(animal.referenceID + " : " + 
			animal.animalSound + " ... Hi I'm " + animal.name + 
			" the " + animal.type + ", " + animal.age + " years old.");
			System.out.println();
			
		}
		System.out.println();
	}
}
