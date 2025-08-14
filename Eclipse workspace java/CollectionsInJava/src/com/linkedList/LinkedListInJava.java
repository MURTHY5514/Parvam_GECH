package com.linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava {
	public static void main(String[] args) {
		/*
		 * LinkedList:
		 * ===========
		 * * linked list underline data structure is doubly linked list
		 * * linked list allow duplicate
		 * * linked List allow random Access(using index)
		 * * linked List will allow null value
		 * * linked List will preserve the order of insertion
		 * */
		List<Integer> list = new LinkedList<Integer>();
		list.add(45);
		list.add(45);
		list.add(null);
		list.add(23);
		list.add(30);
		System.out.println(list);
		System.out.println(list.get(2));
		
		/* * linked list underline data structure is doubly linked list
		 * * arrayList Dynamic Array
		 * 
		 * * linked list will occupy more memory(3 nodes)
		 * * arrayList will occupy less memory
		 * 
		 * * when ever there is a continuous operation on deletion we should go for linked list
		 * * when ever there is a continuous operation on deletion then we should not go for array list
		 * */
	}
}
