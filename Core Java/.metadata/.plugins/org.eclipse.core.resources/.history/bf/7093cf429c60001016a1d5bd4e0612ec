package functions_in_java;

import java.util.Scanner;

public class Recursion {
	public static int sumOfN(int num) {
		//Base condition
		if(num == 1) {
			return 1; 
		}
		return num + sumOfN(num-1);
	}
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		int res = sumOfN(num);
		System.out.println("The result is: "+res);
	}
}
