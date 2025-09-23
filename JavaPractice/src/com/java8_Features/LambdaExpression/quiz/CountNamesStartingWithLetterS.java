package com.java8_Features.LambdaExpression.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountNamesStartingWithLetterS {
	public static void main(String[] args) {
		
//		From this list, count how many names start with 'S'
		
		List<String> names = Arrays.asList("Sneha", "Sahil", "Amit", "Suresh", "pooja", "shyam");
		
		long count = names.stream()
				.filter(name -> name.toLowerCase().startsWith("s"))
				.count();
		
		System.out.println("Number of names startign with letter S : "+count);
		
		
	}
}
