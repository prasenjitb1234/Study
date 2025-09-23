package com.java8_Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConverAllNamesToUppercase {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("prasenjit","alexander","ram","victoria","peter","seeta");
		
		List<String> uppercase = names.stream()
				.map(name -> name.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println("Names in Uppercase : "+uppercase);
		
	}
}
