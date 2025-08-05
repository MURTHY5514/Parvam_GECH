package collection_in_java;

import java.util.ArrayList;
import java.util.List;

public class ListInterface1 {
	public static void main(String[] args) {
		/*
		 * List:
		 * =====
		 * * it is a child interface of collection
		 * * it will contain some of the built in methods that used inside a 
		 * 	 list implemented classes only
		 * * When you represent a group of individual object as a single entity 
		 * 	 where order is preserved and index based access and duplicate is allowed 
		 *   then we should go for List Interface.
		 */
		List l1 = new ArrayList(); //up casting
		l1.add("hello");
		l1.add(123);
		l1.add("hello");
		l1.add(123);
		
		String name = (String) l1.get(0);
		
		System.out.println(l1);
		System.out.println(l1.get(1));
	}
}
