package com.java8_Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findSquareAndCubeOfNumbersInList {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		
		List<Integer> squares = nums.stream() 
				.map(n -> n * n)
				.collect(Collectors.toList());
		
		List<Integer> cubes = nums.stream()
				.map(n -> n * n * n) 
				.collect(Collectors.toList());
		
		System.out.println("Square of numbers : "+squares);
		System.out.println("Cube of numbers : "+cubes);
		
		
		
	}
}
