package array_in_java;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array: "); 
		int size = sc.nextInt();//100
		int[] arr = new int[size];
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter "+(i+1)+" element: ");// 10, 20 , 30 ,40
			arr[i] = sc.nextInt();
		}
		int res=0;
		for(int i=0;i<=arr.length-1;i++) {
//			res = res + arr[i]; // 100
			res+=arr[i];
		}
		System.out.println("The sum is: "+res);
	}
}
