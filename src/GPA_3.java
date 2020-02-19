import java.util.Scanner;
public class GPA_3 {
	
	// this method takes an input from the code below
	static double converter (String x) {
		
		double numberGrade = 0;
		
		switch (x) {
		
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
		}
		
		return numberGrade;
		
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String transcript = "Course\t\tCredits\tGrade\tGrade Points\n";
		String course = "";
		String grade = "";
		int credits = 0;
		double numberGrade;
		Boolean endTranscript = false;
		
		//this while loop keeps the program looping until the user wishes to exit
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
		
		// this call the method, sending the string "grade"
		// over and goes through the switch, sending back the code
		numberGrade = converter(grade);
		
		
		//this takes the inputs for each of the variables
		//and implements them into the transcript, with
		//every class and details receiving its own line.
		
		transcript = transcript + course + "\t" + credits + "\t" + grade + "\t" + numberGrade + "\n";
		
		System.out.println();
		System.out.println(transcript);
		

		
		}
		
	}

}
