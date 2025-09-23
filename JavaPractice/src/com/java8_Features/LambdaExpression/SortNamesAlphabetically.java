package com.java8_Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNamesAlphabetically {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Prasenjit","Arjun","Ram","Samay","Krishna","Peter","Bablu");
		
		List<String> sorted = names.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println("Names Sorted Alphabetically : "+sorted);
		
	}
}
