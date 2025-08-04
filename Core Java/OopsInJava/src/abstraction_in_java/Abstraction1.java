package abstraction_in_java;
////concrete class
//class Person{
////	public void isWalking() { // non abstract method or concrete method
////	System.out.println("person is walking");
////}
//}

//1. abstract class
abstract class Person{
	public abstract void iswalking(); // abstract method or non concrete method
	
	public void isSleeping() {
		System.out.println("Person is sleeping");
	}
}

class Student extends Person{
	@Override
	public void iswalking() {
		System.out.println("Student is walking");
	}
}

//2. Interface
interface Vehicle{
	void start();//abstract method (public and abstract)
}

class Car implements Vehicle{
	@Override
	public void start() {
		System.out.println("Car is starting");
	}
}


/*
 * class -> extends -> class
 * interface -> implements ->class
 * interface -> extends ->interface
 */

public class Abstraction1 {
	/*
	 * Abstraction:
	 * ============
	 * is is a process of hiding the implementation and
	 * showing only the essential resources to user
	 * 2 ways:
	 * =======
	 * 1. Interface(100%)
	 * 2. abstract class(0-100%)
	 * */
	
	/*
	 * Interface:
	 * ==========
	 * It is a blue print of the class 
	 * The methods in the interface by default abstract(does not contain body)
	 * from java 8 we can write default and static methods in interface and 
	 * from java 9 on wards we will write private methods
	 * if you don't know the complete complete implementation of the method
	 * 
	 * interface interface_name{
	 * 	//code
	 * }
	 * 
	 * interface Animal{
	 * 	public void makeSound();
	 * }
	 * */
	public static void main(String[] args) {
		Student std = new Student();
		std.iswalking();
		std.isSleeping();
		
		Car c = new Car();
		c.start();
	}
}
