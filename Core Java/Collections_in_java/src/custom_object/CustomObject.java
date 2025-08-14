package custom_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
	private String name;
	private int age;
	private int roll_num;
	private String email;
	public Student(String name, int age, int roll_num, String email) {
		super();
		this.name = name;
		this.age = age;
		this.roll_num = roll_num;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRoll_num() {
		return roll_num;
	}
	public void setRoll_num(int roll_num) {
		this.roll_num = roll_num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", roll_num=" + roll_num + ", email=" + email + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getRoll_num()-o.getRoll_num();
	}
}

class SortStudent implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getRoll_num()-o1.getRoll_num();
	}
	
}

public class CustomObject {
	public static void main(String[] args) {
		Student std1 = new Student("mohan", 19, 120, "one@gmail.com");
		Student std2 = new Student("abc", 20, 200, "two@gmail.com");
		Student std3 = new Student("pavan", 18, 220, "three@gmail.com");
		Student std4 = new Student("rohan", 23, 500, "four@gmail.com");
		Student std5 = new Student("yashwanth", 21, 40, "five@gmail.com");
//		System.out.println(std1);//internally call toString() method
		
		List<Student> students = new ArrayList<>();
		students.add(std1);
		students.add(std2);
		students.add(std3);
		students.add(std4);
		students.add(std5);
		System.out.println("Before Sorting");
		System.out.println(students);
		
//		Collections.sort(students, new SortStudent());
//		after java 8
//		Collections.sort(students, (s1,s2)->s1.getRoll_num()-s2.getRoll_num());
		
		//comparable
		Collections.sort(students);
		
		System.out.println("After Sorting");
		System.out.println(students);
		
	}
}
