package inheritence_in_java;

class Parent{
	int age = 40;
	public void parent() {
		System.out.println("This is parent class");
	}
}

public class Inheritence1 extends Parent  {
	public static void main(String[] args) {
		/*
		 * Inheritance:
		 * ============
		 * * extending the properties of parent class to child class
		 * * properties(state and actions)
		 * types:
		 * ======
		 * 1. single level
		 * 2. multilevel 
		 * 3. heirarchical 
		 * 4. hybrid
		 * 5. multiple  -> not possible
		 * */
		
		Inheritence1 one = new Inheritence1();
		System.out.println("Parent age: "+ one.age);
		one.parent();
	}
}
