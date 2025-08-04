package class_and_object;

class Employee {
	public String name;

	public void isWorking() {
		System.out.println(this.name+" Is working");
	}
}

public class ClassAndObject2 {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "murali";

		System.out.println("Name: " + e.name);
		e.isWorking();
	}
}
