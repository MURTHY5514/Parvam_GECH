package functional_interface;

import java.util.function.Function;

public class FunctionInjava {
	public static void main(String[] args) {
		/*
		 * Function
		 * ========
		 * * this will take input argument and perform some actions 
		 *   and return the result
		 */
		Function<String, Integer> fun1 = s->s.length();
		int res = fun1.apply("Hello");
		System.out.println("The length: "+res);
	}
}
