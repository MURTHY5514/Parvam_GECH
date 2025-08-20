package stream_api_in_java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI2 {
	public static void main(String[] args) {
		List<List<Integer>> asList = Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4));
		System.out.println("Before: "+asList);
		List<Integer> flattenedList = asList.stream()
			    .flatMap(c->c.stream()) // Flattens the stream of lists into a stream of integers
			    .collect(Collectors.toList());
		System.out.println("After: "+flattenedList);
		
		/*
		 * 1. Sort the list of numbers in Descending order
		 * 2. Remove the Duplicate elements from list
		 * 3. FInd the Maximum element in List
		 * 4. Find the Second Max Element List
		 * 5. calculate the sum of elements in the list - reduce
		 * 6. concatenate all list of strings into single string - reduce
		 * 7. Check if any numbers in the list is greater than 100 - anyMatch
		 * 8. Check all the numbers in the list is greater than 100 - allMatch
		 */
	}
}
