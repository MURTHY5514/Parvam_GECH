package functional_interface;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierInjava {
	public static void main(String[] args) {
		/*
		 * Supplier:
		 * =========
		 * * it won;t take any parameters and return the value
		 */
		Supplier<Double> sup = ()->Math.random()*10;
		Double res = sup.get();
		System.out.println(res);
		Supplier<LocalDate> sup1 = ()->LocalDate.now();
		LocalDate res1 = sup1.get();
		System.out.println(res1);
	}
}
