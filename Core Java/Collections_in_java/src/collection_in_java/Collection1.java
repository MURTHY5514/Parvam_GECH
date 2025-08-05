package collection_in_java;

import java.util.Arrays;

class Student{
	public String name;
	public int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}


public class Collection1 {
	public static void main(String[] args) {
		/*
		 * Why we need collection:
		 * =======================
		 * to over come the drawback of array we have to go for collection
		 * 
		 * drawback of array:
		 * ==================
		 * 1. fixed size
		 * 2. same data type elements
		 * 3. we cannot reduce the size of an array
		 * 
		 * advantages of an array:
		 * =======================
		 * 1. random access
		 * 2. type safety - the elements inside the array is based on 
		 *  the data type.
		 * 3. type casting - to print elements in array no need to 
		 * type cast.
		 * 
		 * Also we can store more than one data type using Object Array
		 * Object[] arr = new Object[5];
		 * 
		 */
		int[] arr = new int[2];
		arr[0]=20;
		arr[1]=14;
//		System.out.println(Arrays.toString(arr));
		int value = arr[0]; // no need to type cast
		System.out.println("Value: "+value);
		
		Object[] obj = new Object[5]; // there is no type safety
		obj[0]="pavan";
		obj[1]=123;
		obj[2]=12.45;
		obj[3]=true;
		Student st =new Student("murali", 23);
		obj[4]=st;
		String name = (String) obj[0]; // we need type casting
		Student std = (Student) obj[4];
		System.out.println(Arrays.toString(obj));
		
		
		
	}
}
