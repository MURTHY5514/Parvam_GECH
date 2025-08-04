package array2_in_java;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {		
		//2d
		int[][] arr = new int[3][4];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values: ");
		for(int i=0; i<=2;i++) {
			for(int j=0; j<4;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//print
		for(int i=0; i<=2;i++) {
			for(int j=0; j<4;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
