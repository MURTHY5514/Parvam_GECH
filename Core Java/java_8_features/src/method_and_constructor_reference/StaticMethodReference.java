package method_and_constructor_reference;

import java.util.function.Consumer;

public class StaticMethodReference {
	
	public static void printMessage(String msg) {
		System.out.println("You message is: "+msg);
	}
	
	public static void main(String[] args) {
		//without static method reference
		Consumer<String> con = s->StaticMethodReference.printMessage(s);
		//with static method reference
		Consumer<String> con1 = StaticMethodReference::printMessage;
		con1.accept("Hello world");
	}
}
