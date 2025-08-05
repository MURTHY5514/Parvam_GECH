package collection_in_java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collection2 {
	public static void main(String[] args) {
		/*
		 * Collection --> root interface in collection framework
		 * Collections --> it will provide some of the utility 
		 * methods to work with collection
		 * 
		 * Collection:
		 * ===========
		 * * When you represent a group of individual object as a single entity then we 
		 * should go for collection
		 * * root interface in collection framework
		 * * This will provide some of built in methods to work with any collection class
		 * * we can store multiple data types
		 * 
		 * */
		Collection col = new ArrayList(); // there is no type safety //up casting
		col.add("123");
		col.add(123);//Int
		col.add(123.123);
		col.add(true);
		
		Collection col2 = new ArrayList(); // there is no type safety
		col2.add("Hello");
		
		col.addAll(col2); // we need to do type casting
		
		System.out.println(col);
		System.out.println(col.size());
	}
}
