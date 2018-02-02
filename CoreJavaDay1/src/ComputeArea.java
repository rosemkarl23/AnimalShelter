import java.text.DecimalFormat;
import java.util.Scanner;

public class ComputeArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double PI;
		double radius;
		double area;
		
		/**PI = 3.14;
		radius = 3;
		area = PI * (radius * radius);
		System.out.println("Area = " + area);
		
		int firstNumber = 10;
		int secondNumber = 3;
		
		//int answer = firstNumber % secondNumber;
		//System.out.println("Remainder = " + answer);
		
		firstNumber %= secondNumber;
		System.out.println("Remainder = " + firstNumber);
		
		int i = 10;
		int j = 13;
		System.out.println(++i + j++);
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String yourName = myScanner.nextLine();
		System.out.println("Hello, " + yourName);**/
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int yourAge = myScanner.nextInt();
		System.out.println("Age: " + yourAge);
		
		Scanner firstScanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double firstNumber = firstScanner.nextDouble();
		
		Scanner secondScanner = new Scanner(System.in);
		System.out.println("Enter second number: ");
		double secondNumber = secondScanner.nextDouble();
		
		DecimalFormat numberFormat = new DecimalFormat("#");
		DecimalFormat divideFormat = new DecimalFormat("#.00");
	}

}