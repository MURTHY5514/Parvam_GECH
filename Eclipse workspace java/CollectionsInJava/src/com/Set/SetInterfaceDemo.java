package com.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceDemo {
	public static void main(String[] args) {
		/*
		 * Set:
		 * ====
		 * * When you represent a group of individual object as a single entity 
		 *   where the insertion order is not preserved, duplicate will not allow 
		 *   then we should got for Set Interface
		 *   
		 *   1. order is not preserved
		 *   2. duplicate will not allow
		 * */
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(12);
		set.add(null);
		set.add(12);
		set.add(30);
		set.add(45);
		set.add(30);
		
		System.out.println(set);
		System.out.println(set);
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(34);
		list.add(12);
		list.add(34);
		list.add(13);
		System.out.println("List: "+list);
		
		Set<Integer> set1 = new HashSet<Integer>(list);
		
		System.out.println("Set1: "+set1);
		
		
	}
}
