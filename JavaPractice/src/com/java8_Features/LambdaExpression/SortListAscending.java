package com.java8_Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListAscending {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10,1,4,5,2,6,3,9,8,7);
		
		
		List<Integer> sorted = nums.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println("Sorted list in ascending order : "+sorted);
		
		
	}
}
