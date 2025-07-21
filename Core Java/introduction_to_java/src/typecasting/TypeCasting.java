package typecasting;

public class TypeCasting {
	/*
	 * Type casting:
	 * =============
	 * * to convert one data type to another data type
	 * 
	 * a. primitive data types:
	 * ========================
	 * 1. implicit
	 * 2. explicit 
	 * 
	 * b. object:
	 * ==========
	 * 1. up casting
	 * 2. down casting
	 */
	
	public static void main(String[] args) {
		//implicit
		short age = 24;
		int age1 = age;
		System.out.println("Short Age is: "+age);
		System.out.println("Int Age is: "+age1);
		
		// explicit
		long marks = 998;
		int marks1 = (int)marks;
		System.out.println("Long Marks: "+marks);
		System.out.println("Int Marks: "+marks1);
	}
}
