package array3_in_java;

class Student {
	public String name;
	public int roll;
//	public Student(String name, int roll) {
//		super();
//		this.name = name;
//		this.roll = roll;
//	}2---
}

public class ArrayObjects {
	// Array of objects
//	datatype[] array_name = new datatype[size]
	public static void main(String[] args) {
		Student[] students = new Student[2];
		students[0] = new Student();
		students[0].name="murali";
		students[0].roll = 20;
		students[1] = new Student();
		students[1].name="pavan";
		students[1].roll = 120;
		for(int i=0;i<2;i++) {
			System.out.println("Student name: "+students[i].name);
			System.out.println("Student roll: "+students[i].roll);
		}
	}
}
