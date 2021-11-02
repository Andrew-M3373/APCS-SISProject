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
		System.out.println("\nChoose a Period"
				+ "\n\t(1) Sort by first period grades"
				+ "\n\t(2) Sort by second period grades"
				+ "\n\t(3) Sort by third period grades");
		Scanner userInput = new Scanner(System.in);
		return MainMenu.inputChecks(userInput, 3, 1);
		
	}
	
	public static void sortGrades() {
		for (int i = 0; i < Roster.roster.size(); i++) {
			switch (Roster.roster.get(i).getFirstGrade()) {
			case "A+": Roster.roster.get(i).setFirstGrade("a"); break;
			case "A": Roster.roster.get(i).setFirstGrade("b"); break;
			case "A-": Roster.roster.get(i).setFirstGrade("c"); break;
			case "B+": Roster.roster.get(i).setFirstGrade("d"); break;
			case "B": Roster.roster.get(i).setFirstGrade("e"); break;
			case "B-": Roster.roster.get(i).setFirstGrade("f"); break;
			case "C+": Roster.roster.get(i).setFirstGrade("g"); break;
			case "C": Roster.roster.get(i).setFirstGrade("h"); break;
			case "C-": Roster.roster.get(i).setFirstGrade("i"); break;
			case "D+": Roster.roster.get(i).setFirstGrade("j"); break;
			case "D": Roster.roster.get(i).setFirstGrade("k"); break;
			case "D-": Roster.roster.get(i).setFirstGrade("l"); break;
			case "F": Roster.roster.get(i).setFirstGrade("m"); break;
			}
			switch (Roster.roster.get(i).getSecondGrade()) {
			case "A+": Roster.roster.get(i).setSecondGrade("a"); break;
			case "A": Roster.roster.get(i).setSecondGrade("b"); break;
			case "A-": Roster.roster.get(i).setSecondGrade("c"); break;
			case "B+": Roster.roster.get(i).setSecondGrade("d"); break;
			case "B": Roster.roster.get(i).setSecondGrade("e"); break;
			case "B-": Roster.roster.get(i).setSecondGrade("f"); break;
			case "C+": Roster.roster.get(i).setSecondGrade("g"); break;
			case "C": Roster.roster.get(i).setSecondGrade("h"); break;
			case "C-": Roster.roster.get(i).setSecondGrade("i"); break;
			case "D+": Roster.roster.get(i).setSecondGrade("j"); break;
			case "D": Roster.roster.get(i).setSecondGrade("k"); break;
			case "D-": Roster.roster.get(i).setSecondGrade("l"); break;
			case "F": Roster.roster.get(i).setSecondGrade("m"); break;
			}
			switch (Roster.roster.get(i).getThirdGrade()) {
			case "A+": Roster.roster.get(i).setThirdGrade("a"); break;
			case "A": Roster.roster.get(i).setThirdGrade("b"); break;
			case "A-": Roster.roster.get(i).setThirdGrade("c"); break;
			case "B+": Roster.roster.get(i).setThirdGrade("d"); break;
			case "B": Roster.roster.get(i).setThirdGrade("e"); break;
			case "B-": Roster.roster.get(i).setThirdGrade("f"); break;
			case "C+": Roster.roster.get(i).setThirdGrade("g"); break;
			case "C": Roster.roster.get(i).setThirdGrade("h"); break;
			case "C-": Roster.roster.get(i).setThirdGrade("i"); break;
			case "D+": Roster.roster.get(i).setThirdGrade("j"); break;
			case "D": Roster.roster.get(i).setThirdGrade("k"); break;
			case "D-": Roster.roster.get(i).setThirdGrade("l"); break;
			case "F": Roster.roster.get(i).setThirdGrade("m"); break;
			}
		}
	}
	
	public static void sortGrades2() {
		for (int i = 0; i < Roster.roster.size(); i++) {
			switch (Roster.roster.get(i).getFirstGrade()) {
			case "a": Roster.roster.get(i).setFirstGrade("A+"); break;
			case "b": Roster.roster.get(i).setFirstGrade("A"); break;
			case "c": Roster.roster.get(i).setFirstGrade("A-"); break;
			case "d": Roster.roster.get(i).setFirstGrade("B+"); break;
			case "e": Roster.roster.get(i).setFirstGrade("B"); break;
			case "f": Roster.roster.get(i).setFirstGrade("B-"); break;
			case "g": Roster.roster.get(i).setFirstGrade("C+"); break;
			case "h": Roster.roster.get(i).setFirstGrade("C"); break;
			case "i": Roster.roster.get(i).setFirstGrade("C-"); break;
			case "j": Roster.roster.get(i).setFirstGrade("D+"); break;
			case "k": Roster.roster.get(i).setFirstGrade("D"); break;
			case "l": Roster.roster.get(i).setFirstGrade("D-"); break;
			case "m": Roster.roster.get(i).setFirstGrade("F"); break;
			}
			switch (Roster.roster.get(i).getSecondGrade()) {
			case "a": Roster.roster.get(i).setSecondGrade("A+"); break;
			case "b": Roster.roster.get(i).setSecondGrade("A"); break;
			case "c": Roster.roster.get(i).setSecondGrade("A-"); break;
			case "d": Roster.roster.get(i).setSecondGrade("B+"); break;
			case "e": Roster.roster.get(i).setSecondGrade("B"); break;
			case "f": Roster.roster.get(i).setSecondGrade("B-"); break;
			case "g": Roster.roster.get(i).setSecondGrade("C+"); break;
			case "h": Roster.roster.get(i).setSecondGrade("C"); break;
			case "i": Roster.roster.get(i).setSecondGrade("C-"); break;
			case "j": Roster.roster.get(i).setSecondGrade("D+"); break;
			case "k": Roster.roster.get(i).setSecondGrade("D"); break;
			case "l": Roster.roster.get(i).setSecondGrade("D-"); break;
			case "m": Roster.roster.get(i).setSecondGrade("F"); break;
			}
			switch (Roster.roster.get(i).getThirdGrade()) {
			case "a": Roster.roster.get(i).setThirdGrade("A+"); break;
			case "b": Roster.roster.get(i).setThirdGrade("A"); break;
			case "c": Roster.roster.get(i).setThirdGrade("A-"); break;
			case "d": Roster.roster.get(i).setThirdGrade("B+"); break;
			case "e": Roster.roster.get(i).setThirdGrade("B"); break;
			case "f": Roster.roster.get(i).setThirdGrade("B-"); break;
			case "g": Roster.roster.get(i).setThirdGrade("C+"); break;
			case "h": Roster.roster.get(i).setThirdGrade("C"); break;
			case "i": Roster.roster.get(i).setThirdGrade("C-"); break;
			case "j": Roster.roster.get(i).setThirdGrade("D+"); break;
			case "k": Roster.roster.get(i).setThirdGrade("D"); break;
			case "l": Roster.roster.get(i).setThirdGrade("D-"); break;
			case "m": Roster.roster.get(i).setThirdGrade("F"); break;
			}
		}
		
	}
}
