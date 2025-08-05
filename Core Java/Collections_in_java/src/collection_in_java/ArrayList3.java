package collection_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList3 {
	public static void main(String[] args) {
		List arr = new ArrayList();
		arr.add(10);//Int
		arr.add(6);
		arr.add(90);
		arr.add(11);
		arr.add(30);
		System.out.println(arr);
		Collections.sort(arr); //comparable used for default or natural sorting order
		System.out.println("After: "+arr);
		System.out.println("Min: "+Collections.min(arr));
		System.out.println("Min: "+Collections.max(arr));
	}
}
