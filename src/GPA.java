import java.util.Scanner;
public class GPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		String letterGrade;
		double numberGrade;
		boolean loop;
		
		while (loop = true) {
		
		System.out.print("What grade did you get?: ");
		
		letterGrade = in.next();
		
		switch (letterGrade) {
		
		case "A+": numberGrade = 4;
		System.out.println("Your number grade is a " +numberGrade);
		break;
		
		case "A": numberGrade = 4;
		System.out.println("Your number grade is a " +numberGrade);
		break;
		
		case "A-": numberGrade = 3.7;
		System.out.println("Your number grade is a " +numberGrade);
		break;
		
		case "B+": numberGrade = 3.3;
		System.out.println("Your number grade is a " +numberGrade);
		break;
		
		case "B": numberGrade = 3;
		System.out.println("Your number grade is a " +numberGrade);
		break;
		
		case "B-": numberGrade = 2.7;
		System.out.println("Your number grade is a " +numberGrade);
		break;
		
		case "C+": numberGrade = 2.3;
		System.out.println("Your number grade is a " +numberGrade);
		break;
		
		case "C": numberGrade = 2;
		System.out.println("Your number grade is a " +numberGrade);
		break;
		
		case "C-": numberGrade = 1.7;
		System.out.println("Your number grade is a " +numberGrade);
		break;
		
		case "D+": numberGrade = 1.3;
		System.out.println("Your number grade is a " +numberGrade);
		break;
		
		case "D": numberGrade = 1;
		System.out.println("Your number grade is a " +numberGrade);
		break;
		
		case "D-": numberGrade = 0.7;
		System.out.println("Your number grade is a " +numberGrade);
		break;
		
		case "F": numberGrade = 0;
		System.out.println("Your number grade is a " +numberGrade);
		break;
		
		case "Q": System.out.println("Thank you, goodbye.");
		System.exit(0);
		
		default: System.out.println("That isn't an acceptable answer.");
		
			}
		
		}
		
	}

}
