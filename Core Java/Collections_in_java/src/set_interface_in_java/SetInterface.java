package set_interface_in_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetInterface {
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
		Set<Integer> st = new HashSet<Integer>();
		st.add(12);
		st.add(14);
		st.add(12);
		st.add(34);
		st.add(14);
		st.add(null);
		st.add(100);
		st.add(null);
		System.out.println(st);
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		marks.add(120);
		marks.add(100);
		marks.add(200);
		marks.add(300);
		marks.add(200);
		System.out.println(marks);
		
		Set<Integer> uniqueMarks = new HashSet<Integer>(marks); 
		System.out.println(uniqueMarks);
		
		Iterator<Integer> iterator = marks.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
