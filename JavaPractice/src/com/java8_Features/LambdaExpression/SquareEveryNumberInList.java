package com.java8_Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEveryNumberInList {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		
		// we want to square every number in list 
		
		List<Integer> squares = nums.stream()
				.map(n -> n * n)
				.collect(Collectors.toList());
		
		System.out.println("Squares are : "+squares);
		
		
		
	}
}
