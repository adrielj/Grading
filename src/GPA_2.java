import java.util.Scanner;
public class GPA_2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String transcript = "Course\t\tCredits\tGrade\tGrade Points\n";
		String course = "";
		String grade = "";
		int credits = 0;
		double numberGrade = 0;
		Boolean endTranscript = false;
		Boolean endQuestion = false;
		int answer;
		
		while (endTranscript == false) {
		
		System.out.println("To end program, type in \"Quit\"");
		System.out.print("What is the name of your class?: ");
		course = in.next();
		
		//Since the loop needs to have some way to exit,
		//the user must type in "Quit" to end the program.
		
		if (course.equalsIgnoreCase("Quit")) {
			
			System.out.println("Thank you, goodbye!");
			endTranscript = true;
			break;
			
		}
		
		System.out.print("What is the amount of credits you earned?: ");
		credits = in.nextInt();

		System.out.print("What is the letter grade you got?: ");
		grade = in.next();
		
		
		//This switch statement takes the letter grade and converts 
		//it to a number grade, based on what that letter grade is.
		
		switch (grade) {
		
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
		
			default: System.out.println("That isn't an acceptable answer.");
		
			}
		
		//this takes the inputs for each of the variables
		//and implements them into the transcript, with
		//every class and details receiving its own line.
		
		transcript = transcript + course + "\t" + credits + "\t" + grade + "\t" + numberGrade + "\n";
		
		System.out.println();
		System.out.println(transcript);
		
		
		}
		
	}

}
