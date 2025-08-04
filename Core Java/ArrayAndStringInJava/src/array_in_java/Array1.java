package array_in_java;

public class Array1 {
	/*
	 * Arrays in java:
	 * ===============
	 * If we want to store a multiple values of the same data type 
	 * we have to go for the array
	 * 
	 * how to declare the array:
	 * =========================
	 * <datatype>[] array_name;
	 * 
	 * int[] array1;
	 * 
	 * initialize the array:
	 * =====================
	 * array_name = new data_type[size];
	 * 
	 * array1 = new int[5];	
	 * 
	 * how to declare and initialize the array:
	 * ========================================
	 * int [] arr = new int[4];
	 * 
	 * starting index of an array is 0, size(n-1)
	 * 
	 * assign values:
	 * ==============
	 * array_name[index] = value;
	 * 
	 * arr[3]=10;
	 * 
	 * types:
	 * ======
	 * 1. 1D -> single row.
	 * int [] array1 = new int[4];
	 * 2. 2D -> in the form of table.
	 * int [][] array1 = new int[4][3];-->4*3->12
	 * 
	 * */
	public static void main(String[] args) {
		int[] std_marks; //decleration
		std_marks = new int[5];
		
		std_marks[0] = 10;
		std_marks[1] = 100;
		std_marks[2] = 200;
		std_marks[3] = 300;
		std_marks[4] = 400;
		
		System.out.println("First element: "+std_marks[0]);
		System.out.println("First element: "+std_marks[1]);
		System.out.println("First element: "+std_marks[2]);
		System.out.println("First element: "+std_marks[3]);
		System.out.println("First element: "+std_marks[4]);
		System.out.println("First element: "+std_marks[5]); //array index out bound exception
	}
}
