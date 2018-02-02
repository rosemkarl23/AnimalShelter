package com.Java.Pointwest.UI;

import com.Java.Pointwest.beans.Animal;
import com.Java.Pointwest.beans.Dog;
import com.Java.Pointwest.beans.Cat;
import com.Java.Pointwest.beans.Parrot;

import java.util.Iterator;
import java.util.List;

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
	
	public static void displayAnimal(List<Animal> animalList) {	
		System.out.println();
		System.out.println("Meet our lovely animal friends!");
		
		Iterator iterator = animalList.iterator();
		while(iterator.hasNext()) {			
			Animal animal = (Animal) iterator.next();
			
			viewAnimal(animal);
			
			System.out.println(animal.referenceID + " : " + 
			animal.animalSound + " ... Hi I'm " + animal.name + 
			" the " + animal.type + ", " + animal.age + " years old.");
			
		}
		System.out.println();
	}
}
