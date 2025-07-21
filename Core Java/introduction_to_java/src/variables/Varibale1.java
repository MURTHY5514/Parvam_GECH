package variables;

public class Varibale1 {
	public static void main(String[] args) {
		// Variables
		/*
		 * Syntax: ======= data_type var_name; // decleartion
		 * 
		 * var_name = value; // initialization
		 * 
		 * data_type var_name = value;
		 */

		// byte
		byte age;

		age = 20;

		System.out.print("The age is : " + age + "\n");

		// int
		// long
		long salary = 30000L;
		System.out.println("Salary is : " + salary);

		// float
		float marks = 34.2f;
		System.out.println("Marks is : " + marks);
		// double

		// char - ''
		char gender = 'M';
		System.out.println("Gender is : " + gender);

		// boolean
		boolean isValid = true;

		System.out.println("Is Valid : " + isValid);

	}
}
