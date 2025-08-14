package exception_in_java;

class InvalidAgeException extends Exception{

	public InvalidAgeException(String message) {
		super(message);
	}
	
}


public class Exception6 {
	
	public static void validateAge(int age) throws InvalidAgeException {
		if(age>=18) {
			System.out.println("Your age is: "+age);
		}else {
			throw new InvalidAgeException("Your age is invalid or less than 18");
		}
	}
	
	public static void main(String[] args) {
		/*
		 * creating our own exception - by extending Exception class
		 */
		
		try {
			validateAge(18);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}	
