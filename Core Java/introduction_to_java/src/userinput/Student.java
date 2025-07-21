package userinput;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		int std_age;
		char std_gender;
		float std_marks;
		String std_name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student age: ");
		std_age = sc.nextInt();
//		sc.nextLine();
		System.out.println("Enter student gender: ");
		std_gender = sc.next().charAt(0);
		System.out.println("Enter student marks: ");
		std_marks = sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter student name: ");
		std_name =  sc.nextLine();

		System.out.println("Student Details: ");
		System.out.println("Age: "+std_age);
		System.out.println("Gender: "+std_gender);
		System.out.println("Marks: "+std_marks);
		System.out.println("Name: "+std_name);
	}
}
