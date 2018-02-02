import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		//to let user input operand values up to two decimal places and limit the answers up to two decimal places as well
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		
		//firstNumber is the variable name for the first number
		Scanner firstScanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double firstNumber = firstScanner.nextDouble();
		
		//secondNumber is the variable name for the second number
		Scanner secondScanner = new Scanner(System.in);
		System.out.println("Enter second number: ");
		double secondNumber = secondScanner.nextDouble();
		
			{
			    //additionAnswer is the answer to the addition statement
				double additionAnswer = firstNumber + secondNumber;
				System.out.println(numberFormat.format(firstNumber) + " + " + numberFormat.format(secondNumber) + " = " + numberFormat.format(additionAnswer));
			}
		
			{
			    //subtractionAnswer is the answer to the subtraction statement
				double subtractionAnswer = firstNumber - secondNumber;
				System.out.println(numberFormat.format(firstNumber) + " - " + numberFormat.format(secondNumber) + " = " + numberFormat.format(subtractionAnswer));
			}
		
			{
			    //multiplicationAnswer is the answer to the multiplication statement
				double multiplicationAnswer = firstNumber * secondNumber;
				System.out.println(numberFormat.format(firstNumber) + " * " + numberFormat.format(secondNumber) + " = " + numberFormat.format(multiplicationAnswer));
			}
		
			{
			    //divisionAnswer is the answer to the division statement
				double divisionAnswer = firstNumber / secondNumber;
				System.out.println(numberFormat.format(firstNumber) + " / " + numberFormat.format(secondNumber) + " = " + numberFormat.format(divisionAnswer));
			}
		
			{
			    //moduloAnswer is the answer to the modulo statement
				double moduloAnswer = firstNumber % secondNumber;
				System.out.println(numberFormat.format(firstNumber) + " % " + numberFormat.format(secondNumber) + " = " + numberFormat.format(moduloAnswer));
			}
		}
	}

}