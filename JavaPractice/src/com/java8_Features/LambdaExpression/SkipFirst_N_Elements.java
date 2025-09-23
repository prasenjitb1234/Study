package com.java8_Features.LambdaExpression;

import java.util.*;
import java.util.stream.*;
public class SkipFirst_N_Elements {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
		
		List<Integer> skipped = nums.stream()
				.skip(2)
				.collect(Collectors.toList());
		
		System.out.println("After Skipping first 2 elements : "+skipped);
		
		
	}
}
