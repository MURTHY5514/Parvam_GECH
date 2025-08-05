package collection_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList4 {
	public static void main(String[] args) {
		//camparable and comparator
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1000);
		arr.add(30);
		arr.add(40);
		arr.add(5);
		arr.add(25);
		//1. comparable - if you need default or natural sorting 
		//order then we should go for comparable
		Collections.sort(arr);
		System.out.println("using comparable: "+arr);
		//2. comparator - if you need custom sorting order then we should 
		//go for comparator interface
		Collections.sort(arr, (a1, a2)->a2-a1); 
		/*
		 * A negative integer if o1 should come before o2.
		   Zero if o1 and o2 are considered equal for sorting purposes.
		   A positive integer if o1 should come after o2.
		 */
		System.out.println("using comparator: "+arr);
	}
}
