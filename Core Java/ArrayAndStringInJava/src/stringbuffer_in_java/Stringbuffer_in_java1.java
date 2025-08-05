package stringbuffer_in_java;

public class Stringbuffer_in_java1 {
	public static void main(String[] args) {
		//StringBuffer
		
		StringBuffer sb = new StringBuffer();
		sb.append("mohan");
		System.out.println("String1: "+sb);
		System.out.println("inital Capacity: "+sb.capacity());
		sb.append("11111111111111");
		/*
		 * (initial_catpacity+1)*2
		 */
		System.out.println("String1: "+sb);
		System.out.println("Capacity: "+sb.capacity());
		sb.append("11111111111111");
		sb.append("11111111111111");
		System.out.println("Capacity: "+sb.capacity());
		
		
		String str1 = "123456";
		final String str2 = "123";
		String str3 = "123";
		
		String str4 = str2+"456";
		String str5 = str3+"456";
		
		System.out.println(str1 == str5); //false
		System.out.println(str1 == str4); //true 

	}
}
