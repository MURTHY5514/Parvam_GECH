package functions_in_java;

public class Functions {
	/*
	 * Functions:
	 * ==========
	 * * It is a block of code used to 
	 * perform specific task
	 * 
	 * Types:
	 * ======
	 * 1. Built-in - println(), print(), subString()
	 * 2. User defined
	 * 
	 * syntax:
	 * =======
	 * modifier return_type fun_name(parameters){
	 * 		//body of the method
	 * }
	 * 
	 * 4 types of User defined:
	 * ========================
	 * 1. function taking parameter and return a value
	 * 2. function not taking parameter but return a value
	 * 3. function not taking parameter and not returning value
	 * 4. function taking parameter but not return value
	 * 
	 * to call function:
	 * =================
	 * fun_name(arguments);
	 * 
	 */
	
	public static void main(String[] args) {
		//1. create a object of class
		Functions func = new Functions();
		//2. using object name call that function
		func.show(10);
	}
	
	public void show(int val) {
		System.out.println("Entered Value: "+val);
	}
}
