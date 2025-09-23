package com.java8_Features.FunctionalInterface.Function;

import java.util.function.Function;

public class FunctionLength {
	public static void main(String[] args) {
		
		Function<String,Integer> getLength = word -> word.length();
		
		System.out.println(getLength.apply("Hello"));
		
		
	}
}
