package com.java8_Features.LambdaExpression.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintOnlyNamesWithExact4Letters {
	public static void main(String[] args) {
		
//		Q.  Given a list of names, print only names with exactly 4 letters.
		
		List<String> names = Arrays.asList("Ram", "Amit", "Neha", "Anil", "John", "Ajay");
		
		List<String> result = names.stream()
				.filter(name -> name.length() == 4)
				.collect(Collectors.toList());
		
		System.out.println("Names with Exactly 4 letters are : "+result);
		
		
		

		
		
		
	}
}
