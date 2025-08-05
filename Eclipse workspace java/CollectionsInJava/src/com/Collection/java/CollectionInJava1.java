package com.Collection.java;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInJava1 {
	public static void main(String[] args) {
		/*
		 * Collection --> root interface in collection framework
		 * Collections --> it will provide some of the utility methods to work with collection
		 * 
		 * Collection:
		 * ===========
		 * * When you represent a group of individual object as a single entity then we should go 
		 * for collection
		 * * root interface in collection framework
		 * * This will provide some of built in methods to work with any collection class
		 * */
		
		Collection collection = new ArrayList();
		collection.add(10);
		collection.add("Name");
		collection.add(10.89);
		collection.remove(10);
		collection.clear();
		
		System.out.println(collection);		
		
	}
}
