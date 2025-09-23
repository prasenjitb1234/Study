package com.java8_Features.LambdaExpression.quiz;

import java.util.Arrays;
import java.util.List;

public class CheckIfAnyNumberGreaterThan100 {
	public static void main(String[] args) {
		
//		Q5. Check if any number is greater than 100
		
		List<Integer> nums = Arrays.asList(10, 25, 90, 105, 60);
		
		boolean isGreater = nums.stream()
				.anyMatch(n -> n > 100);
		
		System.out.println("Any Number greater than 100 ? : "+isGreater);

		
	}
}
