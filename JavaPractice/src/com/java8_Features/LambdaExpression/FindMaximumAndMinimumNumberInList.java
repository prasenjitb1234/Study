package com.java8_Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class FindMaximumAndMinimumNumberInList {
	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		int max = nums.stream().max(Integer::compare).get();

		int min = nums.stream().min(Integer::compare).get();

		System.out.println("Maximum number in List is : " + max);
		System.out.println("Minimum number in List is : " + min);

	}
}
