package constructor_in_java;

class Student{
	public String name;
	public int roll;
	//
	public Student(String name, int roll) {
		/*this is a keyword that will refer 
			the current instance or object of the class
		*/
		this.name = name;
		this.roll = roll;
	}
}



public class Constructor1 {
	/*
	 * Constructor:
	 * ============
	 * In Java, a constructor is a special type of method 
	 * used to initialize a newly created object or values to 
	 * instance variables.
	 * 
	 * * constructor name should be same as class name.
	 * * constructor does not have actual return type.
	 * 
	 * syntax:
	 * =======
	 * access_modifier constructor_name (parameters){
	 * 		//code
	 * }
	 * 
	 * public Constructor1(int age){
	 * 		this.age = age;
	 * }
	 * 
	 * * jvm will provide the default constructor 
	 *   when you won't write any constructor in the class
	 */
	
	public static void main(String[] args) {
		Student std1 = new Student("Mohan",121);
		System.out.println("Name: "+std1.name);
		System.out.println("Roll: "+std1.roll);
	}
}
