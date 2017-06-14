import java.util.Scanner;
//Note: - The user has to give the input as student name, phone number, roll number, class along
//with the marks in three subjects. And the output should contain all the information of the
//student as his/her name, roll number, class, result. 
public class StudentResultProcessing extends Student{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudentResultProcessing sRP = new StudentResultProcessing();
		
		System.out.println("What is the student's name?");
	    sRP.setName(input.nextLine());
	    System.out.println("What is the student's class?");
	    sRP.setClassRoom(input.nextLine());
	    System.out.println("What is the student's phone number?");
	    sRP.setPhoneNumber(input.nextDouble());
	    System.out.println("What is the student's roll number?");
	    sRP.setRollNumber(input.nextInt());
	    
	    System.out.println("What is the student's mark in Math?");
	    int mathScore = input.nextInt();
	    System.out.println("What is the student's mark in English?");
	    int englishScore = input.nextInt();
	    System.out.println("What is the student's mark in Science?");
	    int scienceScore = input.nextInt();
	    
	    
	    System.out.println("\n\n+++++Student Information+++++");
	    System.out.println("Student Name:\t" + sRP.getName());
	    System.out.println("Student Class:\t" + sRP.getClassRoom());
	    System.out.println("Student Roll#:\t" + sRP.getRollNumber());
	    System.out.println("Student Phone#:\t" + sRP.getPhoneNumber());
	    System.out.println("Student Result:\t" + sRP.result(mathScore, englishScore, scienceScore));
	}

}
