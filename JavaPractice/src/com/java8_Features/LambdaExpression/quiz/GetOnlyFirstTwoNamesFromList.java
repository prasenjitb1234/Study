package com.java8_Features.LambdaExpression.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetOnlyFirstTwoNamesFromList {
	public static void main(String[] args) {
//		Q3. Get only the first 2 names from a list
		
		
		List<String> names = Arrays.asList("Arun", "Kiran", "Pooja", "Meera", "Sneha");
		
		List<String> limited = names.stream()
				.limit(2)
				.collect(Collectors.toList());
		
		System.out.println("Only First Two Names from List : "+limited);

		
		
		
		
	}
}
