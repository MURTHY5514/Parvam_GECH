package stream_api_in_java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI1 {
	
	public static boolean startWithA(String s) {
		return s.startsWith("a");
	}
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("aohan","murali","aavan");
//		names.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
//		names.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("----------------------------------------------");
//		names.stream().filter(s->s.startsWith("a")).forEach(c->System.out.println(c));
		List<String> collect = names.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
		System.out.println(collect);
//		names.stream().filter(StreamAPI1::startWithA).forEach(c->System.out.println(c));			
	}
}
