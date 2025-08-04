package array_in_java;

public class Array2 {
	public static void main(String[] args) {
		int[] std_marks = new int[10]; // starting ->0 ending -> n-1 -> 10-1 -> 9

		// for loop
		for (int i = 0; i < 10; i++) {
			std_marks[i] = i+10;
		}
		
		//for loop
		for(int i=0;i<=9;i++) {
			System.out.println(i+1+" element is: "+std_marks[i]);
		}
	}
}
