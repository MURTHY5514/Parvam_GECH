package userinput;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		//UserInput
		/*
		 * for user input we use Scanner class
		 * to create an object in java we use "new" keyword
		 * Syntax:
		 * =======
		 * class_name var_name = new class_name();
		 * Scanner scanner = new Scanner();
		 */
		int userInput;
		System.out.println("Enter a Value: ");
		//creating scanner object
		Scanner scanner = new Scanner(System.in);
		// taking input value
		userInput = scanner.nextInt();
		System.out.println("Entered value: "+userInput);
		
		//float
		float marks;
		System.out.println("Enter marks: ");
		marks = scanner.nextFloat();
		System.out.println("Entered Marks: "+marks);
		
		//char
		char gender;
		System.out.println("Enter a  character: ");
		gender = scanner.nextLine().charAt(0); // this will take entire line include spaces ex: Hello World
//		gender = scanner.next().charAt(0); // this wil take only one word it won't take space ex: Hello, M
		System.out.println("Gender is : "+gender);
		
		//close the scanner
		scanner.close();
	}
}
