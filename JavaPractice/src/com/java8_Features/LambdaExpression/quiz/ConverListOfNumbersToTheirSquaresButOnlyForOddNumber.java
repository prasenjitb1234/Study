package com.java8_Features.LambdaExpression.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConverListOfNumbersToTheirSquaresButOnlyForOddNumber {
	
	public static void main(String[] args) {
		
//		Convert this list of numbers into a list of their squares, but only for odd numbers.
		
		List<Integer> nums = Arrays.asList(2, 3, 4, 5, 6);
		
		List<Integer> squares = nums.stream()
				.filter(n -> n % 2 != 0)
				.map(n -> n * n)
				.collect(Collectors.toList());
		
		System.out.println("Only Odd numbers Squares are : "+squares);
				

		
		
	}
}
