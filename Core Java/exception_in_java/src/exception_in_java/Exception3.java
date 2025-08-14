package exception_in_java;

import java.util.Scanner;

public class Exception3 {
	public static void main(String[] args) {
		// order of catch block child to parent
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter sec number: ");
		int b = sc.nextInt();
		
		try {
			int res = a/b;
			String str = null;
			str.toString();
			System.out.println("The result is: "+res);
		}catch (ArithmeticException e) {
			System.out.println("This is Child class");
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("This is Exception class");
			System.out.println(e.getMessage());
		}
		System.out.println("End of program");
	}
}
