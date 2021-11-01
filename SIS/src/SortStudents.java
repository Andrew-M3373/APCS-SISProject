import java.util.Scanner;

public class SortStudents {

	public static int prompt() {
		System.out.println("\nSort Students"
				+ "\n\t(1) Sort by last name"
				+ "\n\t(2) Sort by first name"
				+ "\n\t(3) Sort by grades"
				+ "\n\t(4) Sort by GPA"
				+ "\n\t(5) Sort by period");
		Scanner userInput = new Scanner(System.in);
		return MainMenu.inputChecks(userInput, 5, 1);
	}
	
	public static int classSorterPrompt() {
		System.out.println("\nSort by Period"
				+ "\n\t(1) Sort by first period"
				+ "\n\t(2) Sort by second period"
				+ "\n\t(3) Sort by third period");
		Scanner userInput = new Scanner(System.in);
		return MainMenu.inputChecks(userInput, 3, 1);
		
	}
	
	public static int gradesSorterPrompt() {
		System.out.println("\nSort by Period"
				+ "\n\t(1) Sort by first period grades"
				+ "\n\t(2) Sort by second period grades"
				+ "\n\t(3) Sort by third period grades");
		Scanner userInput = new Scanner(System.in);
		return MainMenu.inputChecks(userInput, 3, 1);
		
	}
}
