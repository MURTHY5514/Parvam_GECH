package set_interface_in_java;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetInJava {
	public static void main(String[] args) {
//		TreeSet<Integer> integers = new TreeSet<Integer>();
		TreeSet<Integer> integers = new TreeSet<Integer>((t1,t2)->t2-t1);
		integers.add(100);
		integers.add(10);
		integers.add(60);
		integers.add(60);
		integers.add(100);
		integers.add(20);
		
		System.out.println(integers);
		
	}
}
