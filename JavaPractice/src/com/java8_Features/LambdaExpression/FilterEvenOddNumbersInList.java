package com.java8_Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenOddNumbersInList {
	public static void main(String[] args) {
		
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> evens = nums.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		
		List<Integer> odds = nums.stream()
				.filter(n -> n % 2 != 0)
				.collect(Collectors.toList());
		
		System.out.println("Even : "+evens);
		System.out.println("Odd : "+odds);
		
		
		
	}

}
