package com.java8_Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumbersFromList {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int sum = nums.stream()
				.filter(n -> n % 2 == 0)
				.mapToInt(n -> n) 
				.sum();
				
		
		System.out.println("Sum of Even Numbers is : "+sum);
		
		
		
	}
}
