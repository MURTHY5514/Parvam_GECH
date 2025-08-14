package exception_in_java;

public class Exception4 {
	public static void main(String[] args) {
		//finally
		/*
		 * it will execute even if the exception occur or not
		 * what are the clean up resources(ex; data base connection, file close)
		 * in which senario the finally block will won't execute
		 * 1. System.exit();
		 * 2. when the exception occur in the finally block
		 * 
		 */
//		try {
//			System.out.println(10/2);
//		}finally {
//			System.out.println("This is finally block");
//		}
		try {
			System.out.println(10/0);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
//			System.out.println(10/0);
			System.out.println("This is finally block");
		}
	}
}
