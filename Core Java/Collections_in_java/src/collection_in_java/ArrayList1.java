package collection_in_java;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		/*
		 * ArrayList:
		 * ==========
		 * * Array list is a improved version of array(Dynamic Array)
		 * * Array list underline data structure is Dynamic array
		 * * Array list allow duplicate
		 * * ArrayList allow random Access(using index)
		 * * ArrayList will allow null value
		 * * ArrayList will preserve the order of insertion
		 * */
		
		ArrayList arr = new ArrayList();
		arr.add("123");
		arr.add("123");
		arr.add(345);
		arr.add(null);
		arr.add(null);
		System.out.println(arr);
		System.out.println(arr.get(2));
	}
}
