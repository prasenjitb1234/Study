package com.java8_Features.LambdaExpression.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromListOfNames {
	public static void main(String[] args) {
		
//		Q1. Remove duplicates from a list of names
		
		List<String> names = Arrays.asList("Ravi", "Amit", "Ravi", "Pooja", "Amit", "Sonal");
		
		List<String> unique = names.stream()
				.distinct()
				.collect(Collectors.toList());
		
		
		System.out.println("After Removing Duplicates : "+unique);

		
		
	}
}
