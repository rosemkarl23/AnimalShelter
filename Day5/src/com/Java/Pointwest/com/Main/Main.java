package com.Java.Pointwest.com.Main;

import com.Java.Pointwest.com.UI.UserInterface;

public class Main {

	public static void main(String[] args) {
		boolean again = true;
		
		// TODO Auto-generated method stub
		while (again) {
			UserInterface.MainMenu();
			again = UserInterface.computeAgain();
		}
	}

}
