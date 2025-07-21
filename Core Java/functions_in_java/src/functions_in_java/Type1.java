package functions_in_java;

import java.util.Scanner;

public class Type1 {
	
	public int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int a, b;
		Type1 t1 = new Type1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		int res = t1.add(a, b);
		System.out.println("The result is : "+res);
	}
}
