package strings_in_java;

public class Strings_in_java4 {
	public static void main(String[] args) {
		/*
		 * String Constructors in Java:
		 * ============================
		 */
		String str1 = new String();
		System.out.println("STring1: "+str1);
		str1="Some value";
		System.out.println("STring1: "+str1);
		
		String str2 = new String("murali");
		System.out.println("STring2: "+str2);
		
		char[] arr= {'a','b','c'};
		String str3 = new String(arr);
		System.out.println("String3: "+str3);
		
		byte[] arr1 = {65,97,66,98,67};
		String str4 = new String(arr1);
		System.out.println("String4: "+str4);
		
		StringBuffer sb = new StringBuffer("112334");
		String str5 = new String(sb);
		System.out.println("str5: "+str5);
		
	}
}
