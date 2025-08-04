package polymorphism_in_java;
//1. Method over loading
class Addition{
	public void add(int a, int b) {
		System.out.println("The result of 1st mt is: "+(a+b));
	}
	public void add(int a, int b,int c) {
		System.out.println("The result of 2nd mt is: "+(a+b+c));
	}
}


public class Ploymorphism1 {
	/*
	 * polymorphism:
	 * =============
	 * * poly-> many
	 * * morphism -> forms
	 * * it a mechanism that methods will perform a different actions 
	 *   based on the situation
	 *  1. method-oervloading(one class)
	 *  2. method-overriding(two class)
	 * */
	public static void main(String[] args) {
		//1. method-oervloading(one class)
		// same method name but different parameters
		Addition addition = new Addition();
		addition.add(10, 2);
		addition.add(10, 2, 10);
	}

	
}
