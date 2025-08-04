package inheritence;

class Student{
	//states
	public int age = 23;
	public String name = "Hunter";
	public double marks = 230.45;
	
	//actions
	public void isPlaying() {
		System.out.println(this.name+" is playing");
	}
	public void isSleeping() {
		System.out.println(this.name+" is speeping");
	}
}

public class ClassObjectInJava {
	
	public static void main(String[] args) {
		/*
		 * class:
		 * ======
		 * * class will represent the state and behavior of an object
		 * state -> property
		 * behavior --> action
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
		 * issleeping()
		 * 
		 * how ot declare class and object
		 * ===============================
		 * class class_name{
		 *		state
		 *		action
		 * }
		 * ex:
		 * ===
		 * class Student{
		 * 		property:
		 * 		public int age = 30;
		 * 
		 * 		action:
		 * 		public void isPlaying(){
		 * 		syso("the student is playing")	
		 * 		}	
		 * }
		 * Student std1=new Student();
		 * */
		//student1
		Student std1 = new Student();
		System.out.println(std1.name);
		System.out.println(std1.age);
		System.out.println(std1.marks);
		std1.isPlaying();
		std1.isSleeping();
		
		//student 2
		Student std2 = new Student();
		System.out.println(std2.name);
		System.out.println(std2.age);
		System.out.println(std2.marks);
		std2.isPlaying();
		std2.isSleeping();
	}
}