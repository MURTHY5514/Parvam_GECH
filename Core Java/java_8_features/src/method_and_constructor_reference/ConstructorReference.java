package method_and_constructor_reference;

import java.util.function.Function;
import java.util.function.Supplier;

class Student{
	public String name;
	public Student() {
		System.out.println("This is Stdent constructor");
	}
	public Student(String s) {
		this.name = s;
		System.out.println("This is Stdent 2 constructor");
	}
	
}

public class ConstructorReference {
	public static void main(String[] args) {
		//without
		Supplier<Student> sup = ()->new Student();
		//with
		Supplier<Student> sup1 = Student::new;
		sup1.get();
		
		Function<String, Student> fun1 = Student::new;
		fun1.apply("Hello");
	}
}
