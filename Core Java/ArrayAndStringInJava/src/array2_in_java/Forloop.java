package array2_in_java;

import java.util.Scanner;

public class Forloop {
	public static void main(String[] args) {
		System.out.println("Enter no of rows: ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt(); //7
		
		for(int i=0;i<=rows-1;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print((i+1)+" ");
			}
			System.out.println();
		}
	}
}
