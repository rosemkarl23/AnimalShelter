import java.util.Random;
import java.util.Scanner;

public class BasicMagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userNumber;
		Random rand = new Random();
		int  magicNumber = rand.nextInt(25) + 1;
		
		Scanner firstScanner = new Scanner(System.in);
		System.out.println("Enter number from 1-25: ");
		userNumber = firstScanner.nextInt();
			if (magicNumber == userNumber) {
				System.out.println("Congrats! You won!");
			}
			else if (userNumber <= 0 || userNumber > 25) {
				System.out.println("Number is not within the range");
			}
			else {
				System.out.println("Wrong! You haven’t guessed the magic number");
			}
	}

}
