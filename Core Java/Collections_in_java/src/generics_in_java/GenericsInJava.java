package generics_in_java;

import java.util.ArrayList;
import java.util.List;

public class GenericsInJava {
	public static void main(String[] args) {
		/*
		 * Generics:
		 * =========
		 * to provide the type safety and to avoid the type casting in 
		 * collection then we should go for generics
		 * syntax:
		 * =======
		 * List<type of object> arr = new List<type of object>();
		 * ex:
		 * ===
		 * List<Integer> arr =new List<Integer>(); 
		 * */
		
		// without generics
		List marks = new ArrayList();
		marks.add(120);
		marks.add(140);
		System.out.println(marks);
		
		int marks1 = (int)marks.get(0);
		int marks2 = (int)marks.get(1);
		
		System.out.println("Marks1: "+marks1);
		System.out.println("Marks2: "+marks2);
		
		// with generics
		List<String> names = new ArrayList<>();
		names.add("murali");
		names.add("pavan");
		
		String name1 = names.get(0);
		String name2 = names.get(1);
		
		System.out.println("Name1: "+name1);
		System.out.println("Name2: "+name2);
	}
}
