package strings_in_java;

public class Strings_in_java2 {
	public static void main(String[] args) {
		//1. Mutability:
		// String objects are immutable. Once created, their content cannot be changed
		String str = "murali ";
		str = str.concat("gowda");
		System.out.println("Result: "+str);
	}
	
}
