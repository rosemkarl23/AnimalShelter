import java.util.Random;
import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*double PI = 3.14;
		double area;
		double radius;
		
		Scanner firstScanner = new Scanner(System.in);
		System.out.println("Enter radius: ");
		radius = firstScanner.nextDouble();
			
			if (radius > 0) {
				area = radius * radius * PI;
				System.out.println("The area for the circle of radius " + radius + " is " + area + ".");
			}
			
			else if (radius == 0) {
				System.out.println("No need to compute. The area of radius 0 is also 0.");
			}
			
			else {
				System.out.println("Value of radius cannot be negative.");
			}
		Scanner firstScanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int x = firstScanner.nextInt();
		if ((x % 3 == 0) && (x % 4 == 0)) {
			System.out.println("The number is divisible by 12.");
		}
		if (x % 12 == 0) {
			System.out.println("The number is divisible by 12.");
		}
		else {
			System.out.println("The number is not divisible by 12.");
		}
		Scanner firstScanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int x = firstScanner.nextInt();
		if ((x>0)^(x<10)) {
			System.out.println("Out of range");
		}
		else {
			System.out.println("Within range");
		}
		Scanner firstScanner = new Scanner(System.in);
		System.out.println("Gender: ");
		String gender = firstScanner.nextLine();
		
		Scanner secondScanner = new Scanner(System.in);
		System.out.println("Age: ");
		int age = secondScanner.nextInt();
		
		if (((gender.equals("M")) || (gender.equals("m")) && (age >= 21))) {
			System.out.println("Legal age");
		}
		else if (((gender.equals("F")) || (gender.equals("f"))&& (age >= 18))) {
			System.out.println("Legal age");
		}
		else {
			System.out.println("Not legal age");
		}
		if ((gender.equals("M") && (age >= 21)) || ((gender.equals("F")&& (age >= 18)))) {
			System.out.println("Legal age");
		}
		else {
			System.out.println("Not legal age");
		}
		int i = 0;
		do {
			System.out.println("Welcome to Java!");
			i++;
		}
		while (i<100);
		int range = 10;
		for (int x = 1; x <= range; x++) {
			for (int y = 1; y <= range; y++) {
				System.out.print(x*y + "\t");
			}
		System.out.print("\n");
		}*/
		int sum = 0;
		for (int number = 0; x < 100; number++) {
			sum += number;
			if sum()
		}
	}
}



int userNumber;
String userAnswer = "Y";
Random rand = new Random();
int magicNumber = rand.nextInt(25) + 1;
do {
	do {
		Scanner firstScanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		userNumber = firstScanner.nextInt();
		
		if (magicNumber == userNumber) {
			System.out.println("Congrats! You won!");
		}
		else if (magicNumber != userNumber) {
			System.out.println("Wrong! You haven’t guessed the magic number");
			System.out.println("Do you want to guess again or sirit? [Y/sirit]: ");
			userAnswer = firstScanner.next();
				if (userAnswer == "sirit") {
					System.out.println("Aww.. Oh well.. Here’s the magic number: " + magicNumber);
					break;
				}
		}
	}
	while (magicNumber != userNumber);
}
while (userAnswer == "Y" || userAnswer == "y");