package com.java8_Features.FunctionalInterface.quiz;

import java.util.function.Predicate;

public class CheckIfStringStartsWithApredicate {
	public static void main(String[] args) {
		
		Predicate<String> check = str -> str.toLowerCase().startsWith("a");
		
		System.out.println(check.test("Amit"));
		System.out.println(check.test("Pooja"));
		
		
	}
}
