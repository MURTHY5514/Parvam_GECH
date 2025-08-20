package method_and_constructor_reference;

import java.util.Arrays;
import java.util.Comparator;

public class InstanceMethodreference2 {
	public static void main(String[] args) {
		String[] names = {"mohan","Murali","Abhi","akash"};
		//without
		//Arrays.sort(names, (a,b)->a.compareToIgnoreCase(b));
		//with
		Arrays.sort(names, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(names));
	}
}
