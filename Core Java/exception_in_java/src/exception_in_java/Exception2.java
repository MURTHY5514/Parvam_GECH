package exception_in_java;

import java.util.Scanner;

public class Exception2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter sec number: ");
		int b = sc.nextInt();
		
		try {
			int res = a/b;
			System.out.println("The result is: "+res);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		System.out.println("End of program");
		
	}
}
