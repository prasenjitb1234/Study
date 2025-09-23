package com.java8_Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class CountNamesLongerThan4Letters {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("om","Prasenjit","Arun","Arjun","Sakshi","Albert","Ananya");
		
		
		long count = names.stream()
				.filter(name -> name.length() > 4)
				.count();
		
		System.out.println("Names with more than 4 letters : "+count);
		
		
	}
}
