package strings_in_java;


public class Strings_in_java1 {
	public static void main(String[] args) {
		/* Strings in java: 
		 * ================
		 * In Java, a String is an object that represents a sequence of characters.
		 * 
		 * Syntax:
		 * =======
		 * 1.String var_name = "value"; // String literals -> this will only \
		 * create if doesn't exist
		 * 
		 * 2. String var_name = new String("value"); // create a new object every time
		 */
		//1. String literals
		String str1 = "pavan123";
		String str2 = "pavan";
		
		//2. new keyword
		String str3 = new String("pavan");
		String str4 = new String("pavan");
		
		System.out.println("String1: "+str1);
		System.out.println("String2: "+str2);
		System.out.println("String3: "+str3);
		System.out.println("String4: "+str4);
		
		System.out.println("=================================");
		/*
		 * String comparision
		 * 
		 * 1. == - reference comparision
		 * 2. equals() - value *imp
		 * 3. compareTo - based on bytes 
		 * 		if two strings are equal -> 0
		 * 		if first string greater than second - > >0
		 * 		if first string less than second - > <0
		 */
		
		System.out.println("str1 == str2: "+(str1==str2)); //true - this will compare with reference or address
		System.out.println("str1 == str3: "+(str1==str3));
		System.out.println("str3 == str4: "+(str1==str4));
	}
}
