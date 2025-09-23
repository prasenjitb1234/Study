package com.java8_Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class DisplayNames {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Prasenjit","Peter","Ben","Nobita","Shinchan");
		
		names.forEach(name -> System.out.println(name));
		
		
		
		
	}
}
