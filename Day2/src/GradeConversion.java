import java.util.Scanner;

public class GradeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner firstScanner = new Scanner(System.in);
		System.out.println("Enter numerical grade: ");
		double userGrade = firstScanner.nextDouble();
		
		if (userGrade >= 90 && userGrade <= 100) {
			System.out.println("A");
		}
		else if (userGrade >= 80 && userGrade < 90) {
			System.out.println("B");
		}
		else if (userGrade >= 70 && userGrade < 80) {
			System.out.println("C");
		}
		else if (userGrade >= 60 && userGrade < 70) {
			System.out.println("D");
		}
		else if (userGrade >= 0 && userGrade < 60) {
			System.out.println("F");
		}
		else {
			System.out.println("Please enter a valid grade.");
		}
	}

}
