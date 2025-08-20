package stream_api_in_java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIJava {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
//		Stream<Integer> stream = list.stream();
//		Stream<Integer> filter = stream.filter(n->n%2==0);
//		long count = filter.count();
		long count = list.stream().filter(n->n%2==0).count();
		System.out.println("result: "+count);
	}
}
