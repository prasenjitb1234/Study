package com.java8_Features.LambdaExpression.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipFirst3NumbersFromListPrintRemaining {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50, 60);
		
		List<Integer> skipped = nums.stream()
				.skip(3)
				.collect(Collectors.toList());
		
		System.out.println("After Skipping First 3 numbers : "+skipped);
		
		
	}
}
