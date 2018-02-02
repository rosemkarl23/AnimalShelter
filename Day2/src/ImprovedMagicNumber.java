import java.util.Random;
import java.util.Scanner;

public class ImprovedMagicNumber {

	public static void main(String[] args) {

		int userNumber;
		String userAnswer;
		Random rand = new Random();
		int magicNumber = rand.nextInt(25) + 1;
		Scanner firstScanner = new Scanner(System.in);
		Scanner secondScanner = new Scanner(System.in);
		System.out.println(magicNumber);
		do {

		System.out.println("Enter number from 1-25: ");
		userNumber = firstScanner.nextInt();
			if (magicNumber == userNumber) {
				System.out.println("Congrats! You won!");
				break;
			}
			else if (userNumber <= 0 || userNumber > 25) {
				System.out.println("Number is not within the range");
			}
			else {
				System.out.println("Wrong! You haven�t guessed the magic number");
			}
			do {
			System.out.println("Do you want to guess again or sirit? [Y/sirit]: ");
			userAnswer = secondScanner.nextLine();

				if (userAnswer.equalsIgnoreCase("sirit")) {
					System.out.println("Aww.. Oh well.. Here�s the magic number: " + magicNumber);
					break;
				}
				else if (!userAnswer.equalsIgnoreCase("Y")) {
					System.out.println("Please enter proper format");
				}
			}
			while (!(userAnswer.equalsIgnoreCase("Y")) || (userAnswer.equalsIgnoreCase("sirit")));
		}
		while ((magicNumber != userNumber) && (userAnswer.equalsIgnoreCase("Y")));
	}

}