package method_and_constructor_reference;

import java.util.function.Supplier;

public class InstanceMethodReference1 {
	public String getMessage() {
		return "This is instance method";
	}
	
	public static void main(String[] args) {
		InstanceMethodReference1 ir1 = new InstanceMethodReference1();
		//without InstanceMethodReference
		Supplier<String> sup = ()->ir1.getMessage();
		//with InstanceMethodReference
		Supplier<String> sup1 = ir1::getMessage;
		System.out.println(sup1.get());
	}
}
