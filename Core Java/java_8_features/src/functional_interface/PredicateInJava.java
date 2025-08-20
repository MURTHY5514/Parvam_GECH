package functional_interface;

import java.util.function.Predicate;

public class PredicateInJava {
	public static void main(String[] args) {
		/*predicate
		 * ========
		 * * it will hold the condition
		 * * the return type of the predicate is boolean
		 */
		// to check the given number is even or odd
		Predicate<Integer> pre = i->i%2==0;
		boolean test = pre.test(11);
		if(test) {
			System.out.println("The given number is even");
		}else {
			System.out.println("The given number is odd");
		}
		
		Predicate<String> pre1=s->s.length()>10;
		boolean res1 =  pre1.test("Hello world");
		if(res1) {
			System.out.println("The given string is greater than 10");
		}else {
			System.out.println("The given strign is not greater than 10");
		}
		
		
	}
}
