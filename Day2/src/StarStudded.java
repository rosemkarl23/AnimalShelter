import java.util.Scanner;

public class StarStudded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner firstScanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int star = firstScanner.nextInt();
		
		for (int x = 1; x <= star; x++) {
			for (int y = 1; y <= star; y++) {
				System.out.print("*" + "\t");
			}
		System.out.print("\n");
		}
	}
}
