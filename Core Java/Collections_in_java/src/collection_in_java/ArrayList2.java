package collection_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(20);
		arr.add(4);
		arr.add(6);
		arr.add(8);
		arr.add(10);
		
		//1. for loop
		System.out.println("using for loop");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		//2. for each
		System.out.println("using for each");
		for(Object item : arr) {
			System.out.println(item);
		}
		
		//3. forEach
		System.out.println("using forEach");
		arr.forEach((item)->System.out.println(item));
		
		//4. iterator - uni-directional (forward)
		Iterator itr = arr.iterator();
		System.out.println("Using iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//5. ListIterator - bi-directional(forward and backward)
		ListIterator list =  arr.listIterator();
		System.out.println("using List Iterator");
		while (list.hasNext()) {
			System.out.println(list.next());
		}
		
		//6. ENumaration
		Vector vec = new Vector();
		vec.add("Hello");
		vec.add(124);
		
		System.out.println("using Enumaration");
		Enumeration em =  vec.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		
		
	}
}
