package collection_in_java;

public class WrapperClasses {
	public static void main(String[] args) {
		/*
		 * java is a pure oop or not:
		 * ===========================
		 * --> No (primitive data types)
		 * 
		 * primitive data types:
		 * =====================
		 * byte, short, int, long, float, double, char, boolean
		 * 
		 * String name = new String("mohan");
		 * 
		 * collections:
		 * ============
		 * to store group of individual objects as a single entity
		 * 
		 * 10,20,30,40 ---> int(primitive data type)
		 * 
		 * Wrapper Classes:
		 * ================
		 * byte --> Byte
		 * short --> Short
		 * int --> Integer
		 * long --> Long
		 * float ---> Float
		 * double ---> Double
		 * char ----> Character
		 * boolean ----> Boolean
		 * */
		
		//1. Auto boxing --> from primitive to Wrapper
		int a = 100;
		Integer i = Integer.valueOf(a);
//		Integer i = a;
		System.out.println("Int: "+a);
		System.out.println("Integer: "+i);
		System.out.println("Integer type: "+i.getClass().getName());
		
		
		//2. unboxing
		Integer i1 = 10; //wrapper class to primitive 
//		int a1 = i1.intValue();
		int a1 = i1;
		System.out.println("Int: "+a1);
		System.out.println("Integer: "+i1);
		System.out.println("Integer type: "+i1.getClass().getName());
		
	}
}
