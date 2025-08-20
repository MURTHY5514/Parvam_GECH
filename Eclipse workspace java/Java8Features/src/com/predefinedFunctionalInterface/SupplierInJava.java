package com.predefinedFunctionalInterface;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierInJava {
	public static void main(String[] args) {
		/*
		 * Supplier:
		 * =========
		 * it won't take anything but it will return the value.
		 * */
		Supplier<LocalDate> s = ()->LocalDate.now();
		LocalDate date = s.get();
		System.out.println(date);
	}
}
