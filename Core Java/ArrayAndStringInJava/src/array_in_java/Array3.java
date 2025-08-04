package array_in_java;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter teh size of an Array: "); 
		int size = sc.nextInt();//100
		int[] arr = new int[size];
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter "+(i+1)+" element: ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<=size-1;i++) {
			System.out.println((i+1)+" element is: "+arr[i]);
		}
		sc.close();
	}
}
