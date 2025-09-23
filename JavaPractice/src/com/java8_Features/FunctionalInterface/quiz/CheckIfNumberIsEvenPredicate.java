package com.java8_Features.FunctionalInterface.quiz;

import java.util.function.Predicate;

public class CheckIfNumberIsEvenPredicate {
	public static void main(String[] args) {
		
		Predicate<Integer> isEven = num -> num % 2==0;
		
		System.out.println(isEven.test(4));
		System.out.println(isEven.test(7));
		
	}
}
