package class_and_object;

class Student{
	//state
	public String name;
	public int age;
	
	//action
	public void isWriting() {
		System.out.println("Student is writing");
	}
}

public class ClassAndObject {
	/*
	 * class:
	 * ======
	 * * class will represent the state and behavior of an object
	 * state or property
	 * behavior or action
	 * 
	 * * class will take memory or not? ---> NO, but object will take a memory
	 * 
	 * Object:
	 * =======
	 * * Object is a implementation of class(state and action)
	 * 
	 * example:
	 * ========
	 * Student
	 * 
	 * property:
	 * =========
	 * USN
	 * name
	 * branch
	 * age
	 * 
	 * action:
	 * =======
	 * isplaying()
	 * isWriting()
	 * issleeping()
	 * 
	 * how to declare class and object
	 * ===============================
	 * class class_name{
	 *		state --> variable
	 *		action --> method
	 * }
	 * ex:
	 * ===
	 * class Student{
	 * 		property:
	 * 		public int age = 30;
	 * 
	 * 		action:
	 * 		public void isPlaying(){
	 * 			syso("the student is playing")	
	 * 		}	
	 * }
	 * 
	 * Object:
	 * =======
	 * Class_name obj_name = new Class_name();
	 * 
	 * Student std1=new Student();
	 * 
	 * set values
	 * ==========
	 * obj_name.state = value;
	 * 
	 * to call method
	 * ==============
	 * onj_name.action();
	 * 
	 * */
	public static void main(String[] args) {
		//creating object for Student
		Student std1 = new Student();
		//setting values to state
		std1.name = "Mohan";
		std1.age = 23;
		//printing values
		System.out.println("Name: "+std1.name);
		System.out.println("Age: "+std1.age);
		//calling action
		std1.isWriting();
		
		Student std2 = new Student();
	}
}
