package com.java8_Features.LambdaExpression.quiz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAListOfNumbersInReverse {
	public static void main(String[] args) {
		
//		Sort a list of numbers in reverse
		
		List<Integer> nums = Arrays.asList(5, 1, 8, 3, 2);
		
		
		List<Integer> sorted = nums.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println("Sorted in Reverse Order : "+sorted);
		
		
		

	}
}
