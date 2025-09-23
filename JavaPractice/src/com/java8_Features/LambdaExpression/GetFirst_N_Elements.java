package com.java8_Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetFirst_N_Elements {
	public static void main(String[] args) {
		
		// Get first 3 elements 
		
		List<Integer> nums = Arrays.asList(10,20,30,40,50,60,70);
		
		List<Integer> limited = nums.stream()
				.limit(3)
				.collect(Collectors.toList());
		
		System.out.println("First 3 Elements : "+limited);
		
		
		
		
	}
}
