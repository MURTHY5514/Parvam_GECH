package final_this_super;

class NewAnimal{
	public String name;
	public int age;
	public NewAnimal(String name, int age) {
		super();
		System.out.println("parent class conrtructor");
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
	}
}

class NewDog extends NewAnimal{
	public String eat;

	public NewDog(String name, int age, String eat) {
		super(name, age);
		System.out.println("Child class conrtructor");
		this.eat = eat;
	}
	public void display() {
		super.display();
		System.out.println("Dog eats: "+this.eat);
		System.out.println("name of dog once again : "+super.name);
	}
}


public class SuperInJava {
	public static void main(String[] args) {
		/*
		 * super:
		 * ======
		 * 1. it used to call super class instance variables
		 * 2. it used to call super class constructor
		 * 3. it used to call super class methods
		 * */
		
		NewDog newDog = new NewDog("Dog1",12,"rice");
		newDog.display();
		
	}
}
