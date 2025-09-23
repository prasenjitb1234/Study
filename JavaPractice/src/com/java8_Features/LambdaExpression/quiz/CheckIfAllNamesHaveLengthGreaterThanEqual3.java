package com.java8_Features.LambdaExpression.quiz;

import java.util.Arrays;
import java.util.List;

public class CheckIfAllNamesHaveLengthGreaterThanEqual3 {
	public static void main(String[] args) {
		
		
//		Q6. Check if all names have length >= 3
		
		List<String> names = Arrays.asList("Ram", "Raj", "Ami", "Anu");
		
		boolean isGreater = names.stream()
				.allMatch(n -> n.length() >= 3);
		
		System.out.println("Name length Greater than Equal to 3 ? : "+isGreater);

		
	}
}
