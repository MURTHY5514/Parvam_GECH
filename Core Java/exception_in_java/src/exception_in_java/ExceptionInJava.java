package exception_in_java;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionInJava {
	public static void main(String[] args) throws FileNotFoundException {
		/* 
		 * Exception in Java:
		 * ==================
		 * * there is a unwanted or un-expected event occur in the program.
		 * * when ever there is exception the normal flow will stops.
		 * 
		 * 2 types:
		 * ========
		 * 1. checked exception(compile time) - FileNotFoundException(2 ways)
		 * 	 we have to handle at compile time
		 * 2. unchecked exception(run time) - arrayIndexOutBoundException(1 way)
		 * 
		 * Error:
		 * ======
		 * * it is a problem where the programmer can't handle it ex: stackoverflow  error
		 * */
		
		//1. Error
//		int res = fact(3);
//		System.out.println(res);
		
		//2. Exception
		// checked exception
		// 1st way
		try {
			PrintWriter pw =new PrintWriter("abc.txt");
			pw.println("Hello world");
			pw.println("123445");
			System.out.println("hello world");
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// to print any exception we have 3 ways
			e.printStackTrace(); // entire details
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		// 2 way
		PrintWriter pw =new PrintWriter("abc.txt");
		pw.println("Hello world");
		pw.println("123445");
		System.out.println("hello world");
		pw.close();
	}

	private static int fact(int i) {
		return i*fact(i-1);
	}
}
