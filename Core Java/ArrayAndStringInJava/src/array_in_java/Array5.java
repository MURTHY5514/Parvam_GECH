package array_in_java;

import java.util.Scanner;

public class Array5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int size = sc.nextInt();// 100
		int[] arr = new int[size];

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter " + (i + 1) + " element: ");// 10, 20 , 30 ,40
			arr[i] = sc.nextInt();
		}
		int max_ele=arr[0];
		for(int i =0;i<=arr.length-1;i++) {
			if(arr[i]>max_ele) {
				max_ele = arr[i];
			}
		}
		
		System.out.println("The max element: "+max_ele);
		
	}
}
