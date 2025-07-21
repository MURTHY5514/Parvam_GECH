package loopingstatement;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		int i = 1;
		while(i<=num) {
			if(num%i==0) {
				System.out.println(i+" ");
			}
			i++;
		}
	}
}
