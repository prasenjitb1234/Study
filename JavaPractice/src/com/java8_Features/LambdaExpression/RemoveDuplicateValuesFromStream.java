package com.java8_Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateValuesFromStream {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,3,4,5,5,6,7,8,8,8,9,10);
		
		List<Integer> unique = nums.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println("Unique Numbers : "+unique);
		
		
	}
}
