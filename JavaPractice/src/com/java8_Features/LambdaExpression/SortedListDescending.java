package com.java8_Features.LambdaExpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedListDescending {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(2,10,9,6,1,5,8,3,7,4);
		
		List<Integer> descending = nums.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println("Sorted List in Descending order : "+descending);
		
		
		
		
	}

}
