import java.util.Scanner;

public class SeatFinderProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String seatMap [][] = {
				{"KEVIN", "ALVIN", "JEZRA", "MANNY"},
				{"M", "JOLO", "RAF", "GERREL"},
				{"BRIAN", "ALMIE", "AYEN", "SWIL"},
				{"JC", "EMMAN", "SHEILA", "JAY"}
			};
		String searchPerson;
		boolean valid = false;
		int rowCount = 0;
		int columnCount = 0;
		
		System.out.println("Please enter name of employee: ");
		Scanner firstScanner = new Scanner (System.in);
		searchPerson = firstScanner.nextLine();
		for (String[] row: seatMap) {
			for (String column: row) {
				++columnCount;
				if (column.equalsIgnoreCase(searchPerson)) {
					valid = true;
					break;
				}
				else {
					continue;
				}
			}
			++rowCount;
			if (valid == false) {
				columnCount = 0;
				continue;
			}
			else {
				break;
			}
		}
		
		if (valid == false) {
			System.out.println("\nName is not found in seatplan.");
		}
		else {
			for (String[] row: seatMap) {
				for (String column: row) {
					if (searchPerson.equalsIgnoreCase(column)) {
						System.out.print("|\t" + "*\t");
					}
					else {
						System.out.print("|\t" + " \t");
					}
				}
				System.out.println("|\n");
			}
			System.out.println("\n" + searchPerson + " is seated on row " + rowCount + " col " + columnCount);
		}
	}
}