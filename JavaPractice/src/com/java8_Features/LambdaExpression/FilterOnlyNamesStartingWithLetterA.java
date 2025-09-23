package com.java8_Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOnlyNamesStartingWithLetterA {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Prasenjit","Tom","Peter","arun","Alia","Albert","Jerry","Nobita","Ananya");
		
		List<String> result = names.stream()
				.filter(name -> name.toLowerCase().startsWith("a"))
				.collect(Collectors.toList());
		
		System.out.println("Names that starts with Letter A : "+result);
		
		
		
	}

}
