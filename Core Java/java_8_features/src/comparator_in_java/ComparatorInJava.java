package comparator_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class CustomStoring implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
	
}


public class ComparatorInJava {
	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<Integer>();
		Scanner sc =new  Scanner(System.in);
		for(int i =0;i<10;i++) {
			System.out.println("Enter "+ (i+1) +" student marks: ");
			marks.add(sc.nextInt());
		}
		System.out.println("Before Sorting: ");
		System.err.println(marks);
//		Collections.sort(marks, new CustomStoring());
		Collections.sort(marks, (o1,o2)-> o2-o1);
		System.out.println("After Sorting: ");
		System.err.println(marks);
	}
}
