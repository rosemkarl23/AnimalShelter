import java.text.DecimalFormat;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//firstNumber is the variable name for the first number
		double firstNumber;
		//secondNumber is the variable name for the second number
		double secondNumber;
		//to format the decimal values
		DecimalFormat numberFormat = new DecimalFormat("#");
		DecimalFormat divideFormat = new DecimalFormat("#.00");
		{
			//first number is set to 20
			firstNumber = 20;
			//second number is set to 15
			secondNumber = 15;
		
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
				//the answer to division is set to two decimal places
				double divisionAnswer = firstNumber / secondNumber;
				System.out.println(numberFormat.format(firstNumber) + " / " + numberFormat.format(secondNumber) + " = " + divideFormat.format(divisionAnswer));
			}
		
			{
			    //moduloAnswer is the answer to the modulo statement
				double moduloAnswer = firstNumber % secondNumber;
				System.out.println(numberFormat.format(firstNumber) + " % " + numberFormat.format(secondNumber) + " = " + numberFormat.format(moduloAnswer));
			}
		}
	}

}
