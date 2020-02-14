import java.util.Scanner;
public class GPA {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String letterGrade;
		double numberGrade = 0;
		Boolean loop = true;
		
		while (loop == true) {
		
		System.out.println("To quit program, type \"Q\".");
		System.out.print("What letter grade did you get?: ");
		
		letterGrade = in.next();
		
		switch (letterGrade) {
		
		case "A+": numberGrade = 4;
		break;
		
		case "A": numberGrade = 4;
		break;
		
		case "A-": numberGrade = 3.7;
		break;
		
		case "B+": numberGrade = 3.3;
		break;
		
		case "B": numberGrade = 3;
		break;
		
		case "B-": numberGrade = 2.7;
		break;
		
		case "C+": numberGrade = 2.3;
		break;
		
		case "C": numberGrade = 2;
		break;
		
		case "C-": numberGrade = 1.7;
		break;
		
		case "D+": numberGrade = 1.3;
		break;
		
		case "D": numberGrade = 1;
		break;
		
		case "D-": numberGrade = 0.7;
		break;
		
		case "F": numberGrade = 0;
		break;
		
		case "Q": System.out.println("Thank you, goodbye.");
		System.exit(0);
		break;
		
		default: System.out.println("That isn't an acceptable answer.");
		
			}
		
		System.out.println("Your number grade is a " +numberGrade);
		
		}
		
	}

}
