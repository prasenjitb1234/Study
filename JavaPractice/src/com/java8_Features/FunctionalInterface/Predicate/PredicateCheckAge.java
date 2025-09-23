package com.java8_Features.FunctionalInterface.Predicate;

import java.util.function.Predicate;

public class PredicateCheckAge {
	public static void main(String[] args) {
		
		Predicate<Integer> isAdult = age -> age >= 18;
		
		System.out.println(isAdult.test(19));
		System.out.println(isAdult.test(15));
		
	}
}
