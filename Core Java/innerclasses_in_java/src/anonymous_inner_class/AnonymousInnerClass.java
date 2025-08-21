package anonymous_inner_class;

class Person {
	public String name;
	public int age;

	public void isWalking() {
		System.out.println("Person is waling");
	}
}
public class AnonymousInnerClass {
	public static void main(String[] args) {
		Person person = new Person() {
			public static int i;
			{ //instance block - used to initialize the instance variables.
				name = "mohan";
				age = 21;
			}
			static { //static block - used to initialize the static variables.
				i=10;
			}
			public void isWalking(){
				System.out.println("Mohan is walking");
			}
			
		};
		System.out.println(person.name); // it will going to call parent class
		person.isWalking();
	}
}
