package exception_in_java;

public class Exception5 {
	
	public static void validateAge(int age) {
		if(age>=18) {
			System.out.println("Your age is: "+age);
		}else {
			throw new ArithmeticException("Your age is invalid or less than 18");
		}
	}
	
	
	public static void main(String[] args) {
		/*
		 * throw:
		 * ======
		 * * to throw exception
		 */
		try {
			validateAge(10);
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("program complete");
		}
		
	}
}
