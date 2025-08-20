package functional_interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PrimeNumber {
	public static void main(String[] args) {
		Predicate<Integer> pre = (num)->{
			if(num<=1) return false;
			for(int i=2;i<num/2;i++) {
				if(num%i==0) return false;
			}
			return true;
		};
		boolean res = pre.test(6);
		if(res) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}
}
