package encapsulation_in_java;

class Student{
	private String name;
	private int roll;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
}
public class Encapsulation1 {
	/*
	 * encapsulation:
	 * ==============
	 * Encapsulation is a mechanism that binding the data into a single unit
	 *	i,e making fields(state) as private and methods as public using 
	 *	getters and setters
	 */
	public static void main(String[] args) {
		Student std= new Student();
		std.setName("pavan");
		std.setRoll(121);
		
		System.out.println("Name is: "+std.getName());
		System.out.println("Roll is: "+std.getRoll());
	}
}
