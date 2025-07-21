package conditional_statement;

import java.util.Scanner;

public class ConditionalStatemnt {
	public static void main(String[] args) {
		/*
		 * COnditional Statement: ====================== 1. if 2. if else 3. else if 4.
		 * switch if: === if(condition){ //true block code }
		 * 
		 * if else: ======== if(condition){ //true block code }else{ //flase block code
		 * }
		 * 
		 * else if: ======== if(condition){ //true block code }else if(condition){
		 * //true block code }else if(condition){ //true block code }else{ //false block
		 * code }
		 * 
		 * switch: ======= switch(var_name){ case 1 :{ //code break; } case 2 :{ //code
		 * break; } case 3 :{ //code break; } default:{ //code } }
		 */
		
		boolean a = true;
		if(a) {
			System.out.println("The value of a is: "+a);
		}
		
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
		
		switch (choice) {
			case 1: {
				System.out.println("Add: "+(num1+num2));
				break;
			}
			case 2: {
				System.out.println("Sub: "+(num1-num2));
				break;
			}
			case 3: {
				System.out.println("Mul: "+(num1*num2));
				break;
			}
			case 4: {
				System.out.println("Div: "+(num1/num2));
				break;
			}
			case 5: {
				System.out.println("Mod: "+(num1%num2));
				break;
			}
			default:
				System.out.println("Invalid choice");
		}
	}
}
