package com.java8_Features.FunctionalInterface.quiz;

import java.util.function.Function;

public class CheckStringLengthFunction {
	public static void main(String[] args) {
		
		Function<String,Integer> getLength = word -> word.length();
		
		System.out.println(getLength.apply("Java"));
		System.out.println(getLength.apply("Hello"));
		
	}
}
