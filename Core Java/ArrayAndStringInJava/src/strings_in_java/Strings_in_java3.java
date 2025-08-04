package strings_in_java;

import java.util.Arrays;

public class Strings_in_java3 {
	public static void main(String[] args) {
		/*
		 * Methods in strings:
		 * ===================
		 *  length()
			charAt()
			substring()
			indexOf(), lastIndexOf()
			toLowerCase(), toUpperCase()
			replace(), trim(), split()
			equals(), equalsIgnoreCase()
			startsWith(), endsWith()
			valueOf(),
			intern() - try to find this 
		 * 
		 */
		String str = "pavan";
		String[] str2 = str.split("a");
		int number = 123;
		String str3 = String.valueOf(number);
		System.out.println("Output: "+Arrays.toString(str2));
		System.out.println("output1: "+str3);
		String str4 = "pavan";
		String str5 = new String("pavan").intern();
		System.out.println("==: "+(str4==str5));
	}
}
