package com.java8_Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class SumofAllNumbers {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		
		int sum = nums.stream()
				.mapToInt(n -> n)
				.sum();
		
		System.out.println("Sum of all numbers : "+sum);
		
		
	}
}
