package functional_interface;

import java.util.function.Consumer;

public class ComsumerInjava {
	public static void main(String[] args) {
		/*
		 * Consumer:
		 * =========
		 * * it will consume the value
		 * * it won't return anything
		 */
		Consumer<String> con = s->System.out.println("The given string is : "+s);
		con.accept("Hello world");
	}
}
