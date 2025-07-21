package conditional_statement;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		int num1, num2, choice;
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Enter your choice: ");
		System.out.println("1-> add");
		System.out.println("2-> sub");
		System.out.println("3-> mul");
		System.out.println("4-> div");
		System.out.println("5-> mod");
		choice = sc.nextInt();
		
		switch(choice) {
		  case 1 -> System.out.println("Add: "+(num1+num2));
		  case 2 -> System.out.println("Sub: "+(num1-num2));
		  case 3 -> System.out.println("Mul: "+(num1*num2));
		  case 4 -> System.out.println("Div: "+(num1/num2));
		  case 5 -> System.out.println("Mod: "+(num1%num2));
		  default -> System.out.println("Invalid Choice");
		}
	}
}
