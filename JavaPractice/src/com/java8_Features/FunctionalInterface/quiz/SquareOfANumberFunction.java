package com.java8_Features.FunctionalInterface.quiz;

import java.util.function.Function;

public class SquareOfANumberFunction {
	public static void main(String[] args) {
		
		Function<Integer,Integer> square = n -> n * n;
		
		System.out.println("Square of 4 is : "+square.apply(4));
		System.out.println("Square of 7 is : "+square.apply(7));
		
		
	}
}
