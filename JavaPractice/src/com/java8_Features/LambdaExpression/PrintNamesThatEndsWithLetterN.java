package com.java8_Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNamesThatEndsWithLetterN {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Prasenjit","Alan","Varun","Alia","Simran","Raj","Ram","Karan");
		
		List<String> result = names.stream()
				.filter(name -> name.endsWith("n"))
				.collect(Collectors.toList());
		
		System.out.println("Names that ends with letter N : "+result);
		
		
		
		
	}

}
